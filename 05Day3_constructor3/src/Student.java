
public class Student {
  //1. 멤버변수 영역
	String name; //이름
	int age;//나이 
	String address;//주소
	//##주의 : 생성자 명시적 오버로딩시에는 기본 생성자 자동 삽입을 하지 않음
	//2.생성자 영역
	//2-1 생성자의 오버로딩(overloading): 생성자의 매개변수를 다르게 설정해서 구분
	//2-2 생성자의 명시적 작성
	public Student() {//반드시 명시적 기본생성자 추가
		System.out.println("기본생성자 호출=============");
	}
	public Student(String name) {//매개변수로 이름을 받음
        System.out.println("Student(String name) 호출됨========");
		this.name=name; // this= 인스턴스 (멤버)변수 : 객체로 만들어진 객체의 멤버변수를 지정
        //멤버변수를 매개변수로 받은 값으로 초기화 
		}
    //2-3 생성자 오버로딩- 같은 식별자를 사용, 매개변수 다르게 하여서 구분
	public Student(String name, int age, String address) {//매개변수 3개 Student stu3=new Student("유관순", 10,"경기")
	System.out.println("Student(String name, int age, String address) 호출됨========");
	this.name=name;
	this.age=age;
	this.address=address;//매개변수로 넘어온 값으로 멤버변수에 설정 완료

	
	}

}
