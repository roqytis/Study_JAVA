import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {

		//3.  switch문
		System.out.println("점수 입력하시오");
		int num =10;
		
		switch(num) {
		case 10:System.out.println("10"); break;
		case 20:System.out.println("20"); break;
		case 30:System.out.println("30"); break;
		case 40:System.out.println("40"); break;
		default:System.out.println("default");
		}
		
		
		
		String xxx="A2";
		switch(xxx) {
		case "A":System.out.println("A"); break;
		case "A2":System.out.println("A2"); break;
		case "A3":System.out.println("A3"); break;
		case "A4":System.out.println("A4"); break;
		default:System.out.println("default");
		}
//		char xxx2='A';
//		switch(xxx2) {
//		case 'A':System.out.println("A"); break;
//		case 'B':System.out.println("A2"); break;
//		case 'C':System.out.println("A3"); break;
//		case 'D':System.out.println("A4"); break;
//		default:System.out.println("default");
//		}
		System.out.println("문장3");

	}

}
