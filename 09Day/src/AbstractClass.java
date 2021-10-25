
public abstract class AbstractClass {
//멤버변수, 생성자, 함수 포함, 추상메소드(구현안된)가 포함된 클래스
	//abstract 클래스로 선언, new  객체생성 안됨
	// 다른 클래에서 extends 로 상속, 추상메서드 오버라이딩
	//구현된 클래스를 객체 생성해서 사용
	private int num;
	/////////////////////////////////////////
	public abstract void test();// {}가 없는 추상 메소드(함수)
////////////////////////////////////////
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public AbstractClass() {
		super();
	}
	public AbstractClass(int num) {
		super();
	this.num=num;
	}
	
}
