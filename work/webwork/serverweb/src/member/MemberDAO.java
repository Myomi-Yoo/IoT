package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;

public class MemberDAO {
	public ArrayList<MemberDTO> getMemberList(){
		System.out.println("getDeptListȣ��=> ������ �Ѱ��� �Ķ�������");
		ArrayList<MemberDTO> memblist = new ArrayList<MemberDTO>();
		MemberDTO memb = null;
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from member";
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				memb = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
				memblist.add(memb);
			}
			System.out.println("dao=>"+memblist.size());
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return memblist;
	}
	//�μ����
	public int insert(MemberDTO memb) {
		System.out.println(memb);
		int result = 0;
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "insert into member values(?, ?, ?, ?, ?, ?, ?)";
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, memb.getId());
			stmt.setString(2, memb.getPass());
			stmt.setString(3, memb.getName());
			stmt.setString(4, memb.getPass());
			stmt.setString(5, memb.getDeptNo());
			stmt.setString(6, memb.getGrade());
			stmt.setInt(7, memb.getPoint());
			result = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	//����
	public int delete(String deptNo) {
		int result = 0;
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "delete from member where id=?";
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, deptNo);
			result = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	
	public MemberDTO read(String deptNo) {
		System.out.println("dao�� readȣ��");
		MemberDTO dept = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "select * from member where id=?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptNo);
			rs = ptmt.executeQuery();
			//�������� �ڹٰ�ü�� ��ȯ 
			//  - ���ڵ尡 ���� ��: DTO�� ���ڵ带 ��ȯ�ϰ� ArrayList�� �߰�
			//  - ���ڵ尡 �� �� : DTO�� ���ڵ� ��ȯ
			if(rs.next()) {
				dept = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		return dept;
	}
}
