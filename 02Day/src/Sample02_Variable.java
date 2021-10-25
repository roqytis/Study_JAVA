
public class Sample02_Variable {

	public static void main(String[] args) {
		//0. 변수의 사용
		// 1.선언 : 타입 + 변수명
		
		int num; // 변수선언
		// 2.변수 초기화
		num=10; // 변수 초기화
		//3.변수를 사용
		System.out.println(num);//10
		//변수값 변경, 
		num=20;
		System.out.println(num);//20
		
		int a=10;
		int b=20;
		int sum= a+b;
		System.out.println(sum);
		
		
	//에러
//	byte testByte=300; //bytes는 1바이트 짜리라 300을 담기엔 넘 작음	
//  int testLong=123L; 인트보다 롱단위가 커서 담을 수 없음 
//  float testFloat =3.14; // 실수의 기본형은 double 이나 		
//  char testChar ="A" // 문자를 적어야 하는 곳에 문자열 서식으로 되있음  'A'
//  boolean testBoolean= TRUE; // boolean 값은 소문자로 적어야 한다. 소문자 true,false
//  boolean testboolean2=0; // 0,1 사용은 C+에서나 가능 자바는 불가능 	
		
		// 홍길동 20 서울 성별(남) 결혼여부 (false) 키(185.63) 체중(78.25)
		//1.변수선언(메모리에 특정크기의 영역생성)
		String name; // 변수,name변수, 문자열 변수, String타입의 변수, 참조형 변수
		int age;// 변수, age변수, 정수형변수, int 타입의 변수, 기본형변수
		String address;//참조형변수
		char gender;// 변수, gender변수, 문자형변수, char타입변수, 기본형변수
		boolean isMarried;// 기본형변수
		float height;// 기본형 변수
		double weight;// 기본형 변수
	//  System.out.println(name);
		
		
		//2. 변수초기화 (값을 맨처음 설정하는 작업) 초기화 이후 연산, 출력으로 사용해야 함
		name="홍길동";
		age= 20;
		address="서울";
		gender='남';
		isMarried= false;
		height= 185.63F;
		// height= 3.14
		weight= 78.25;
		
		
		// 이제 출력!!
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(isMarried);
		System.out.println(height);
		System.out.println(weight);
	
		
		
		
		
     
	} //main 끝- 프로그램 종료

}
