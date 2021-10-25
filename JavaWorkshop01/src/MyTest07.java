import java.util.Scanner;

public class MyTest07 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("1.이름을 입력하세요");

		String name = scan.next();//string 문자열
		// 문자열을 형변환 하는법 Intefer.parseInt
		System.out.println("2.나이를 입력하세요.");
		//int age = scan.nextInt(); //int
		String ageStr=scan.next();
		int age = Integer.parseInt(ageStr);//String => int 변환
		
		System.out.println("이름은 " +name +", 나이는"+age+"살 입니다");
	 //System.out.printf("이름은 %s, 나이는 %d 입니다", name, age);	
	
	}

}
