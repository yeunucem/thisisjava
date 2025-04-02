package ch06.sec15;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	private String num;
	private String name;
	private int balance = 0;
	

	public Account(String num, String name, int balance) {
		this.num=num;
		this.name=name;
		this.balance=balance;
	}

	public int getBalance() {
		return balance;
	}
	public String getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	
	public void setBalance(int balance2) {
		if (balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			return;
		}
		
		this.balance += balance2;
	}
	
	public void setBalance1(int balance1) {		
		this.balance -= balance1;
	}
}
