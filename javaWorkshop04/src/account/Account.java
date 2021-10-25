package account;

public class Account {
	private String account;
    private int balance;
    private double interestRate;
	public Account() {
		}
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public double CalculateInterest() {
		return balance*interestRate;
	}
	public void deposit(int money){
		balance += money;
	}
    public void withdraw(int money) {
    	if(balance<money) {
    		System.out.println("출금을 할 수 없습니다.");
    	}else {
    		System.out.println("을 출금하였습니다. 현재잔액: "+ balance);
    		balance-=money;
    	}
    }
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}	
	
	
	}	


	

