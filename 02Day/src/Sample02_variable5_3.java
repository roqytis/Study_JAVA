
public class Sample02_variable5_3 { // 클래스 블럭에 설정
     String name;
     int age;
     char gender;
     float height;	
     // 멤버변수, 인스턴스변수(instance variable)
	//선어 위치 : 클래스 블럭안에 선언,클래스 내 함수에서 전부 사용가능(전역변수)
     //생성시점: new 키워드 사용 속한 클래스를 명시적으로 객체 생성해서 사용함
     //객체생성한 참조변수를 이용하여 변수를 사용함
     //생성주기: 객체생성(클래스생성)~ 객체소멸(클래스종료)  
     //초기화 안하면 자동초기화 된다.(초기값을 정하지 않으면 자동 초기화 없어도됨)
     //각 타입의 기본값으로 자동초기화
     //정수:0, 실수:0.0, char: '\u0000', boolean:false, 참조형: null
	 
	public static void main(String[] args) {//함수=매소드
		//함수 안에 선언되는 변수를 로컬변수라고 함
		//로컬변수(local variable): 선언이 매소드 안에서,사용되는 범위도 매소드 안에서만 사용
		//생서시점: 메서드호출~메서드 종료
		//메모리: 스택(stack)
		//주의할점: 반드시 사용전에 초기화해야한다.(명시적)
		//로컬 변수의 순수 한국말: 지역 변수
		
		int n=0;//메인함수에 선언된 로컬 변수
		System.out.println(n);
		Sample02_variable5_3 refVar= new Sample02_variable5_3();
		//객체 생성 후 각 멤버변수에 자동 초기값 저장 후 시작 주소를 참조변수에 저장하여 참조하게함
		System.out.println(refVar);
		System.out.println(refVar.age);
		System.out.println(refVar.name);
		System.out.println(refVar.height);
		//refVar=null;// 클래스 강제 종료
		//System.out.println(refVar.age);//Exception in thread "main" java.lang.NullPointerException
	}// 메인함수 종료

}// 클래스 종료
