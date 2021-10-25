import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {

	
		//5. for문
		for(int i=0;i<5; i++) {
			for(int j=0; j<4;j++) {
				System.out.println(i+"\t"+j);
			}
		}//end for
		
		//4. 
		for(int i=0;i<5; i=i+2) {
			System.out.println("hello "+i);
		}//end for
		
		
		//3. 
		int i=0,j=0;
		for(i=0,j=0;i<5 && j<3;i++,j++) {
			System.out.println("happy "+i+"\t"+j );
		}//end for
		System.out.println(i);
		
		System.out.println("============================");
		//2. 
		for(int i2=10;i2>0;i2--) {//10~1 
			System.out.println("world "+i2);
		}//end for
		System.out.println("=============================");
		//1. 
		for(int i3=0;i3<5;i3++) {//ㅑ3=0~4 5번
			System.out.println("hello "+i3);
		}//end for
		System.out.println("for 바깥===============");
		//1-1 누적 합계
		int sum=0;
		for (int k = 0; k <=10; k++) {
			
			sum+= k;//sum= sum+k;와 동일 
			//System.out.println(sum);
		}
		//for밖에서 sum 사용 안됨, 
		System.out.println(sum);
	}//end main
}//end class
