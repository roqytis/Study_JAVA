import java.util.Scanner;

public class MyTest11 {

	public static void main(String[] args) {
		
Scanner scan= new Scanner(System.in);
				System.out.println("주소를 입력하시오." );
					String mesg= scan.nextLine();
					System.out.println(mesg);
					
					System.out.println("문자 갯수(공백포함): "+mesg.length());
					System.out.println("단어 갯수: "+ mesg.split(" ").length);
					// ""을 기준으로 문자열을 분리 시켜 String 의 배열로 반한
	}

}
