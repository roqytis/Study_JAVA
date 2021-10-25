package Workshop06.acc;

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
	public void deposit(double money)throws AccountException{
		if(money<=0) {
			throw new AccountException("입금 금액이 0보다 적습니다.");
		}
	}
    public void withdraw(double money) throws AccountException {
    	if(balance<=0 || money> balance) {
    		throw new AccountException("출금을 할 수 없습니다.");
    	}
    	balance-=money;
    		
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


	

