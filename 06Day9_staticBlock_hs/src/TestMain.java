
public class TestMain {

	 //static 초기화 블력: 특정 작업의 초기화
	static {
		System.out.println("static 초기화블럭");
	}
    //인스턴스 초기화 블력 -객체 초기화 시 사용: 사용하는 경우 거의 없음
	{
		System.out.println("인스턴스 초기화 블럭");
	}
	
	public TestMain() {
		System.out.println("TestMain 생성자");
	}
	
	
	
	
	public static void main(String[] args) {
		TestMain m= new TestMain();
		TestMain m2= new TestMain();
		TestMain m3= new TestMain();
		
		
	}

}
