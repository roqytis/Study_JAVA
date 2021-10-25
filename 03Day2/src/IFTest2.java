
public class IFTest2 {

	public static void main(String[] args) {
		
		//. if~else 
		// num2=100 홀/짝수 판단  mesg값을  출력하는 문장을 완성하시오.
		 int num2=100;
		 int result=  num2%2;
		 String mesg="";
		 if (result==0) {
			mesg="짝수";
		} else {
			mesg="홀수"; 
		}
		 System.out.println("숫자 "+ num2+" 는 "+ mesg+" 입니다 .");
		
	
		//2.  if~else문
		System.out.println("문장1");
		int num =0;  //변수선언
		if(3==3) {
			num=3;  //변수에 값 설정 
			System.out.println("참");
			System.out.println("참2");
			System.out.println(num);
		}else {
			num=10;
			String name="aaaa";  //else 블럭에서만 사용가능한 변수 
			System.out.println("거짓");
			System.out.println("거짓2");
			System.out.println(num);
		}
		System.out.println("if ~ else 문 바깥 ======"+ num);
		System.out.println("문장3");
		
		
		
		//3. if~else 문(대소문자 판단)
		System.out.println("++++++++++++++++++++++++");
		char c='a';
		//int intc=97;
		String mesg2="";
		if(c>='a'&&c<='z') {
			
			mesg2="소문자";
		}else {
			mesg2="대문자";
		}
		System.out.println(mesg2);
		System.out.println("main종료 ==============");
		
	}

}
