import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {

	  int n=5;    //초기값 
	  while(n<5) {//조건 검사 
		  System.out.println("while 안==== "+n);//0,
		  n++;//증가식   주의 증가식이 없을 경우 무한 반복됨
		  //0-
	  }
	  System.out.println("while 문 바깥. ========== "+ n);
	  
	  
	  
	  
	  
	  
	  // do~while문 : 조건이 일치하지않아도 적어도 한번은 수행
	  int n2 = 5;
	  do {
		  System.out.println("world" + n2);
		  n2++;
	  }while(n2<5);
	  System.out.println("do~ while 바깥 "+ n2);
		
	  
	  
	  
	  
	  
	}//end main
}//end class
