
public class ExceptionTest8 {

	public static void a() throws ArithmeticException{//위임
		try {
			b();
		} catch (Exception e) {
			System.out.println("in b 에서 처리 ");
		}
		
	}
	public static void b() throws ArithmeticException {//위임
		
			 int num =10;
				int result =num/0;   //에러 발생 코드 - 처리하지 않고 throws사용하여 호출한 곳에서 처리하도록 위임시킴
		System.out.println(result);
	}	
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
	 try {	
		a();
	 }catch(ArithmeticException e) {
		 System.out.println("main try~ catch : "+ e.getMessage());
	 }
		System.out.println("프로그램 종료");
	}
}
