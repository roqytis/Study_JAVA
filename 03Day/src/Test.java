import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("이름 입력 ");
		String name = scan.next();
		System.out.println("나이입력");
		int age= scan.nextInt();
		System.out.println(name+ "\t"+ age);
		
		scan.close();

	}

}
