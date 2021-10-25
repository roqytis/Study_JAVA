
public class Person {
        //1.멤버변수 영역
	String name;
	int age;
	String addr;
///////////////////////////////3.멤버 함수 부분
	public String toString() {// 이름을 반드시 toString()으로 작성
		System.out.println("toString 호출됨========");
		return this.name+"\t"+this.age+"\t"+this.addr;
			}
	
	//2. 생성자 명시적 작성
public Person(String name, int age, String addr ) {
	System.out.println("\"Person(String name, int age, String addr) 호출됨========\"");
this.name=name;
this.age=age;
this.addr=addr;
}

//기본생성자
	public Person() {
		System.out.println("기본생성자 호출 ===========");
	}
/////////////////////////////




}
