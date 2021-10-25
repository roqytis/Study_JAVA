
public class Ex03_5 {

	public static void main(String[] args) {
		
		int a=3;
		//++a;//전치
		a++;//후치
		System.out.println(a);// 출력값 4
	  
		//2.전치
		int b=0;
		int sum=++b; //전치 +1하고 사용
		//b=b+1
		//sum=b; 와 동일한 순서로 진행		
		System.out.println("sum : "+ sum+" b: "+ b);
		//3.후치
		int c=0;
	    int sum1=c++;//후치 c를 사용한 후 +1
	    //sum1=c; //0
	    //c= c+1; 와 동일한 순서로 진행 //1
	    System.out.println("sum1 : "+ sum1+" c: "+ c);
		
		
		
		
		a--;//후치
		System.out.println(a);//3

		
		int x =5;
		int y= ++x;
	System.out.println(x+" "+ y);
	

	
	
	}

}
