package workbook;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public void setAccount(String account) {
		this.account=account;
	}
	public String getAccount() {
		return account;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	
	public double calculaterest() {
		double result = this.balance*this.interestRate/100;
		return result;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
}
