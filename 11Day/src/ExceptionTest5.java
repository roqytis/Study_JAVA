
public class ExceptionTest5 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
	try {	
		//작업1
		int num =10;
		int result =num/0;
		System.out.println(result);
	}catch(ArithmeticException  e) {  
		System.out.println("예외발생2" + e.getMessage());
	}
	
	try {	
		//작업2
		String name=null;
		System.out.println(name.length());
		
	}catch(NullPointerException  e) {	
		System.out.println("예외발생1" + e.getMessage());
	}
		System.out.println("프로그램 종료");
	}

}
