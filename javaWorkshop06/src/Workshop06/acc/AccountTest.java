package Workshop06.acc;



public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account("441-0290-1203", 500000, 0.073);
		System.out.println("계좌정보: " +account.getAccount()+ "현재잔액: "
				+account.getBalance());
		
		try {
			account.deposit(-10);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		}
        
		try {
			account.withdraw(600000);
		}catch(AccountException e) {
			System.out.println(e.getMessage());
		}
	   System.out.println("이자: " + account.CalculateInterest());
	}

}
