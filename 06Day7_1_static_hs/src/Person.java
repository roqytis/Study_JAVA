
public class Person {
	static {System.out.println("static block===============");}
	//인스턴스 변수, new 할때 생성~객체소멸,사용:생성후 변수명.name
	String name; 
	// static 변수(클래스 변수),프로그램 실행시생성~프로그램 종료,사용:클래스명.age
	static int age; 
			
	public void a() {
		System.out.println("in a()========"+this.name);
		System.out.println("in a()========"+age);
		
	}
	public static void b() {
		//System.out.println(name);
		System.out.println("static void b()===============");
		System.out.println(age);
	}
	
	
}
