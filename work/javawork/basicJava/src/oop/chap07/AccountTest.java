package oop.chap07;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account("441-0290-1203",500000,7.3);
		
		/*acc.setAccount("441-0290-1203");
		acc.setBalance(500000);
		acc.setInterestRate(7.3);*/
		System.out.println("��������: "+acc.getAccount()+" �����ܾ�: "+acc.getBalance());
		acc.deposit(20000);
		System.out.println("��������: "+acc.getAccount()+" �����ܾ�: "+acc.getBalance());
		System.out.println("����: "+acc.calculateInterest());
		
	}
}
