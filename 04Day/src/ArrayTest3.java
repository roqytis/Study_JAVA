
public class ArrayTest3 {
//클래스 안에 선언: 멤버변수, 메소드(함수), 생성자(constructor)로 구성
//change1함수	
	public static void change1(int n) {// 클래스의 메소드(함수)는 new를 통한 객체 생성 후
		//참조변수 이용 사용해야하지만 static 함수는 객체 생성 없이 사용이 가능함
		System.out.println("change1 호출됨============================");
		n=20;
	}
//change2함수	
	public static void change2(int[] n) {// 클래스의 메소드(함수)는 new를 통한 객체 생성 후
		//참조변수 이용 사용해야하지만 static 함수는 객체 생성  없이 사용이 가능함
		System.out.println("change2 호출됨============================");
		n[2]=90;
	}
//change3함수	
	public static void change3(int n) {// 클래스의 메소드(함수)는 new를 통한 객체 생성 후
		//참조변수 이용 사용해야하지만 static 함수는 객체 생성  없이 사용이 가능함
		System.out.println("change3 호출됨============================");
		n=1111;
	}
	///////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
		//기본형 데이터
		int xxx=10;
		System.out.println("호출전:"+ xxx);
		change1(xxx);//change1 함수 호출
	    System.out.println("호출후:"+xxx);//
//참조형 데이터
	    int[] num=new int[3];
	    num[0]=10;
	    num[1]=20;
	    num[2]=30;
	System.out.println("호출전"+ num[2]);//30출력
	change2(num);
	System.out.println("호출전"+ num[2]);//90출력
	//////////////////////////////////////////////////////////
	System.out.println(num[0]);//10
	change3(num[0]);
	System.out.println(num[0]);//10
	}

}
