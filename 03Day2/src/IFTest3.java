import java.util.Scanner;

public class IFTest3 {

	public static void main(String[] args) {

		// 2. 다중 if~else문
		System.out.println("점수 입력하시오");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num >= 90) {
			System.out.println("A");
		} else if (num >= 80) {
			System.out.println("B");
		} else if (num >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		scan.close();
		System.out.println("문장3");

		// 콘솔에서 숫자 하나 입력
		// IF-ELSE IF 사용 F, C,B, A순으로 조건 비교 만들어 볼것

		if (num < 70) {
			System.out.println("F");
		} else if (num < 80) {
			System.out.println("C");
		} else if (num < 90) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}

	}

}
