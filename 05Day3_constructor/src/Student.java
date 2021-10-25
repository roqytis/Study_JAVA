
public class Student {
  //1. 멤버변수 영역
	String name; //이름
	int age;//나이 
	String address;//주소
	
	//2. 생성자(constructor)영역
	//2-1 명시적 생성자를 작성
	//- 접근제한자 클래스이름(인자){}
	public Student() {
	 System.out.println("생성자 호출됨===================================");
	 name="aa";
	 age=10;
	 address="서울";
	} //생성자

}
