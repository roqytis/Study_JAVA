import java.util.Scanner;
public class Mytest09 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("1.정수 입력하세요." );
			
			int n= scan.nextInt();
			
		System.out.println("2.정수 입력하세요." );
			int n2= scan.nextInt();
			
			int max=(n>n2)? n:n2;
			System.out.println("정수"+n+"과 정수"+ n2 +" 중에서 최댓값"+ max
										);
	}

}
