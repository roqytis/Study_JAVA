
public class IFTest {

	public static void main(String[] args) {

		//1. 단일 if문
		System.out.println("문장1");
		int num=0;
		if(3==3) {//조건이 true 인 경우  블럭 안의 코드 실행 
			num=10;
			System.out.println("문장2");
			System.out.println("문장2-1");
		}//조건이 false인 경우 블럭 밖에서 부터 실행 
		System.out.println(num);  //10 
		System.out.println("문장3");			
		
		
		
		//2. 단일 if문
		System.out.println("+++++++++++++++++++++++++++++++");
		int num2=100;
		int result= num2%2;
		String mesg="홀수";   // 기본값 "홀수"
		if(result==0) {
		  	mesg="짝수";
		}
		System.out.println(mesg);		
		
		
		
		
		
		//3.단일 if문(대소문자 판단)
		System.out.println("++++++++++++++++++++++++");
		char c='a';
		String mesg2="대문자";
		if((c>='a'&&c<='z')) {   //    'a'<=c<='z' 사용 안됨 
			
			mesg2="소문자";
		}
		System.out.println(mesg2);
		System.out.println("main종료 ==============");
	}

}
