import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	  int n=0;    //초기값 
	  String name="";
	  while(true) {//조건 검사 - 무한 반복 
		  name= scan.next();
		  if(name.equals("홍길동")||(n==5)) break;
//		  if(n >5) break;
//		  System.out.println("while 안==== "+n);//0,
		  n++;//증가식   주의 증가식이 없을 경우 무한 반복됨
		  //0-
	  }
	  System.out.println("while 문 바깥. ========== "+ name);
	  
	  
	  
	  
	  
	  
	  
	}//end main
}//end class
