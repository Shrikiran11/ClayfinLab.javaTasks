package com.cf.javaTasks;
class MyAccount{
	 long accNum;
	 double balance;
	private PersonMy accHolder;
	public MyAccount(long accNum, double balance, PersonMy accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	MyAccount(){
		
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public PersonMy getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(PersonMy accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double money) {
		balance=balance+money;
		System.out.println("balance after deposit "+balance);
	}
	public void withDraw(double money) {
		balance=balance-money;
		System.out.println("balance after withdraw "+balance);
	}
	public double getBalance() {
		
		return balance;
	}
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + getBalance() + ", accHolder=" + accHolder + "]";
	}
}
class SavingsAccount extends MyAccount{
	PersonMy accHolder2;
	SavingsAccount(long accNum, double balance, PersonMy accHolder2){
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder2 = accHolder2;
	}
	SavingsAccount(){
		super();
	}
	final int minBalance=500;
	@Override
	public void withDraw(double money) {
		if(balance>=minBalance) {
		balance=balance-money;
		System.out.println("balance after withdraw "+balance);
	}
}
}
	class CurrentAccount extends MyAccount{
		boolean check;
		CurrentAccount(long l, int i, PersonMy smith){
			super();
		}
		final int overDraft=2000;
		@Override
		public void withDraw(double money) {
			if(balance>overDraft) {
				check=true;
				balance=balance-money;
			System.out.println("balance after withdraw "+balance);
			}else {
				check=false;
			}
				System.out.println("OverDraft Limit exceeded");
			}
		public boolean checkOverDraft() {
			return check;
		}
		}
	

class PersonMy{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public PersonMy(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
public class BankAccMaintainance {
	public static void main(String[] args) {
		PersonMy Smith=new PersonMy("StevenSmith",33);
		MyAccount a1=new MyAccount(123456789l,3000,Smith);
		SavingsAccount sa1=new SavingsAccount(123456789l,3000,Smith);
		  sa1.withDraw(1000);
		  sa1.withDraw(2550);
		  CurrentAccount ca1=new CurrentAccount(123456789l,3000,Smith);
		  ca1.withDraw(3200);
		  
	}
}
