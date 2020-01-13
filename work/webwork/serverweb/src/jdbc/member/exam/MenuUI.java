package jdbc.member.exam;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	MemberDAO dao = new MemberDAOImpl();
	public void insertMenu(){
		//�Ի����� ���ó�¥ - sysdate, point =1000�� ���Եǵ���
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("����:");
		String name = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		MemberDTO user = new MemberDTO(id, pass, name, addr, deptno);
		dao.insert(user);
	}
	public void updateMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		dao.update(id, addr);
	}
	public void deleteMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		dao.delete(id);
	}
	public void findByAddrMenu(){
		System.out.println("*******����˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		ArrayList<MemberDTO> memberlist = dao.findByAddr(addr);
		int size = memberlist.size();
		for(int i=0;i<size;i++) {
			MemberDTO member = memberlist.get(i);
			System.out.println(member.getId()+"\t"+member.getPass()+"\t"+member.getName()+"\t"+
					member.getAddr()+"\t"+member.getDeptno()+"\t"+member.getHiredate()+"\t"+
					member.getPoint());
		}
	}
	
	
	public void selectMenu(){
		System.out.println("*******�����ȸ********");
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		ArrayList<MemberDTO> memberlist = dao.memberList();
		int size = memberlist.size();
		for(int i=0;i<size;i++) {
			MemberDTO member = memberlist.get(i);
			System.out.println(member.getId()+"\t"+member.getPass()+"\t"+member.getName()+"\t"+
					member.getAddr()+"\t"+member.getDeptno()+"\t"+member.getHiredate()+"\t"+
					member.getPoint());
		}
	}
	
	public void loginMenu(){
		System.out.println("*******�α���********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		MemberDTO member = dao.login(id, pass);
		if(member==null) {
			System.out.println("�α��ν���");
		}else {
			System.out.println("�α��μ���");
//			System.out.println("���̵�:"+member.getId());
//			System.out.println("�н�����:"+member.getPass());
//			System.out.println("�̸�:"+member.getName());
//			System.out.println("�ּ�:"+member.getAddr());
//			System.out.println("�μ���ȣ:"+member.getDeptno());
//			System.out.println("�Ի�����:"+member.getHiredate());
//			System.out.println("����Ʈ:"+member.getPoint());
		}
	}
}


















