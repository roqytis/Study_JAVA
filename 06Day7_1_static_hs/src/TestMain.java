
public class TestMain {
	public static void main(String[] args) {
		
		System.out.println("1.====="+Person.age);//클래스이름, 변수
		Person.b();//클래스이름, 함수
		Person p= new Person();
		System.out.println(p.name);
		System.out.println(p.age);
		p.a();
		System.out.println(Person.age);
		Person.b();
		
		p.age=20;
		Person p2= new Person();
		System.out.println(p2.age);
		
		
	}//end main
}//end class
