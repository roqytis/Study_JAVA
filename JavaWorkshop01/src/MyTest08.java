import java.util.Scanner;

public class MyTest08 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		//System.out.println("1.정수 입력하세요." );
	//	int n= scan.nextInt();

		//System.out.println("2.정수 입력하세요.");
	   // int n1= scan.nextInt();	
	
			System.out.println("1.정수 입력하세요." );
			String num1= scan.next();
			System.out.println("2.정수 입력하세요.");
			String num2= scan.next();
			int n= Integer.parseInt(num1);
		   int n1= Integer.parseInt(num2);
			
			
		System.out.printf("정수 %d 과 정수 %d 의합계: %d" ,n, n1,(n+n1));
		System.out.println("정수  " +n +"과 정수"+n1+" 의 합계"+(n+n1));
	}

}
