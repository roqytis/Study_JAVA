
public class Sample03_typeCasting {

	public static void main(String[] args) {
	
		//데이터 타입 변경 (자동으로 변경된다): 묵시적, promotion
		//1. byte-> short->int->long->float-> double(작은-> 큰)
		byte b= 10;
		short b2=b;
		int b3=b2;
		long b4=b3;
		//////////////////////////
		float b5=b4;// 정수-> 실수
		double b6=b5;
		System.out.println(b5);
		
		//2.
		
		char n='A';
		int n2= n+1;
		System.out.println(n2);
		//char c
		
		
		
		//3.int보다 작은 타입의 연산결과는 int로
		short x=10;
		short x2=20;
		int x3=x+ x2;
		//short x3= x +x2;//연산결과 int가 됨
		short x4= (short)(x+x2); //명시적 변환
		//##연산결과 int 30을 명시적으로 작은타입으로 변환
		
		//"10"---->10
		//자바:Integer.parseInt("10")==>10
		String k="10";
		System.out.println(k+20);
		int k2=Integer.parseInt(k);// ##매우 중요 외우기
		System.out.println(k2+20);
		
		//10++>"10"
		//자바스크립트: toString()
		//자바: String.calueOf(10)==>"10"
        System.out.println(String.valueOf(10)+10);  //정수10 ->"10"로 변환 1010
		System.out.println(10+""+10);
	
        //5. 작은타입과  큰타입이 연사==> 큰타입
		int p =100;
		double p2=3.14;
		double p3=p+p2;
	}

}
