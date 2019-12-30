package jdbc.board.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//tb_board���̺��� �׼����ϴ� ����� ���ǵ� Ŭ����
public class BoardDAOImpl implements BoardDAO{
	public int insert(BoardDTO board) {
		System.out.println("dto���޼ҵ�:"+board); //�޼ҵ带 ȣ���ϴ� �޼ҵ忡�� �⺻���� ����� ���
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0; //�޼ҵ� �������� ����� ����
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {	
			con = DBUtil.getConnect();//DBMS����
			stmt = con.prepareStatement(sql);
			stmt.setString(1, board.getId());
			stmt.setString(2, board.getTitle());
			stmt.setString(3, board.getContent());
			result = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	
	public int insert(String id, String title, String content) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0; //�޼ҵ� �������� ����� ����
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {	
			con = DBUtil.getConnect();//DBMS����
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			result = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	
	public int update(String id, int boardNum) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		String sql = "update tb_board set id=? where boardnum=?";
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setInt(2, boardNum);
			result = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	
	public int delete(int boardNum) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		StringBuffer sql = new StringBuffer();
		sql.append("delete tb_board "); 
		sql.append("where boardnum=?");
		/*String sql = "delete from tb_board where boardnum = 3";*/
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setInt(1, boardNum);
			result = stmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("���� ����"+e.getMessage());
			e.printStackTrace();//��������
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	//��ȸ�� ����� ArrayList�� ��ȯ�Ͽ� ����
	public ArrayList<BoardDTO> select() {
		//��ü �Խñ��� ���� Collection
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		//��ȸ�� �Խñ��� ���� ��ü
		//��ü�� �������� �ʰ� null�� �ʱ�ȭ�ϴ� ���� 
		//-> �����͸� ��ȸ�ϴ� �۾��� �ϴ� ���� while�� �����̹Ƿ� while�� ��ȸ�� ���ڵ�� ��ü�� ����
		BoardDTO board = null; 
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from tb_board";
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {//=>���ڵ带 ��ȸ�ϱ� ���ؼ��� ���ڵ尡 �� ���� �ݵ�� Ŀ���� �̵����Ѿ� �Ѵ�.
				/*System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString("content")+"\t");
				System.out.print(rs.getDate(5)+"\t");
				System.out.println(rs.getInt(6));*/
				
				//1. ��ȸ�� ���ڵ��� �÷��� �о DTO�� ��ȯ�ϴ� �۾�
				board = new BoardDTO(rs.getInt(1), rs.getString(2),	rs.getString(3),
						rs.getString(4), rs.getDate(5), rs.getInt(6));
				//2. DTO�� ��ȯ�� ���ڵ带 ArrayList�� �߰�
				boardlist.add(board);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return boardlist;
	}
	public BoardDTO read(int boardnum) {
		BoardDTO board = null;
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from tb_board where boardnum=?";
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, boardnum);
			rs = stmt.executeQuery();
			if(rs.next()) {
				board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getDate(5), rs.getInt(6));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}		
		return board;
	}

	@Override
	public ArrayList<BoardDTO> findByTitle(String title) {
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		BoardDTO board = null;
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from tb_board where title like ?";
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, "%"+title+"%");
			rs = stmt.executeQuery();
			while(rs.next()) {
				board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getDate(5), rs.getInt(6));
				boardlist.add(board);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, con);
		}
		return boardlist;
	}
	
	public int hitUp(int boardnum) {
		int result =0;
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "update tb_board set hit=hit+1 where boardnum=?";
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, boardnum);
			result = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
}
