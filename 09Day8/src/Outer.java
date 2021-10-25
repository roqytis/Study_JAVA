
public class Outer {

	//멤버변수
		public int n =10;
		protected int n2 =20;
		int n3 =30;
		private int n4 =40;
		static int n5 =50;
   //멤버 메서드
	public void x() {}
	
	//멤버 inner 클래스
	class Inner{
		int k=10;  //Inner의 멤버 변수
		static final int NUM=20;
		public void info() { //Inner멤버함수
			System.out.println(n);
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n4);  //private도 접근 가능
			System.out.println(n5);
			System.out.println(k);
			System.out.println(NUM);
		}
	}// end Inner
	
	//////////1. Outer클래스의 멤버함수, OUTER에서 Inner 생성 후 사용
	public void innerCreate() {
		Inner i = new Inner();
		i.info();
	}
	
	
	
	
}
