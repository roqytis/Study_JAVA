
public interface A {//주의 new 객체 생성 안됨
//다른 클래스가 implements A로 추상함수를 강제 구현해야함
	 int Num=10;//public static final 자동으로 지정된다. 
	 // A.NUM 사용
	 public abstract void a();//추상함수 abstract 명시적 기재
	 void b();//자동으로 추상함수
	 
	 public default void c() {//기본 사용함수내용 구현
		 System.out.println("c");
	 }
	 public static void d() {//A.d()사용
		 System.out.println("d");
	 }
	 //public void e() {}// 일반메서드 불가
	 
}
