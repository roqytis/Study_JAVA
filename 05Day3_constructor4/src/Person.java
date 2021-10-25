
public class Person {
        //1.멤버변수 영역
	String name;
	int age;
	String addr;

	
	//2. 생성자 명시적 작성
public Person(String name, int age, String addr ) {
	System.out.println("\"Person(String name, int age, String addr) 호출됨========\"");
this.name=name;
this.age=age;
this.addr=addr;
}

//3.기본생성자
	public Person() {
		System.out.println("기본생성자 호출 ===========");
	
	}
}
