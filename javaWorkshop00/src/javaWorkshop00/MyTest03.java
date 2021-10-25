package javaWorkshop00;

public class MyTest03 {

	public static void main(String[] args) {
		int n=10;
		int n2=20;
		
		int temp= n; // 선언과 동시에 초기화 n값 10
		n=n2;
		n2=temp;
		
		//두개의 값을 swap
	//	n=n2; //n=20, n2=20
	//	n2=n; //n2=20 -> 20, n=20
		
		
		System.out.println("n값은" +n);
		System.out.println("n2값은"+n2);

	}

}

