package chap08;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account("441-0290-1203",500000,7.3);
		
		/*acc.setAccount("441-0290-1203");
		acc.setBalance(500000);
		acc.setInterestRate(7.3);*/
		System.out.println("��������: "+acc.getAccount()+" �����ܾ�: "+acc.getBalance());
		try {
			acc.deposit(-10);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			acc.withdraw(600000);
		}catch(Exception e) {
			System.out.println("�ݾ��� 0���� ���ų� ���� �ܾ׺��� �����ϴ�.");
		}

		System.out.println("����: "+acc.calculateInterest());
		
	}
}
