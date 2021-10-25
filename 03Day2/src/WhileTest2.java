import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		//반복문을 이용한 누적 
//0~10 까지의 합계 : 55
	
	int num=0;  //증가값   1~10
	int sum=0;  //누적된 합계 저장 
	while(num<=10) {//0~10
		sum+=num;    //sum= sum+ num;  와 동일 
		System.out.println(num+ "\t"+ sum);
		num++; 
	}
	System.out.println(sum);
	//1 ~ 100 까지 덧셈결과 
	int num2=1;
	int sum2=0;
	while (num2<=100) {
		sum2+=num2;
		num2++;
	}
	System.out.println(sum2);
	  
	}//end main
}//end class
