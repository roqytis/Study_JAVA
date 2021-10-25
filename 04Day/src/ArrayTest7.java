import java.util.Arrays;

// 컴파일: javac ArrayTest7.java
//실행: java ArrayTest7 문자열 문자열.....

public class ArrayTest7 {

	public static void main(String[] args) {
	     //클래스 안에 : 멤버변수, 함수, 생성자 : 멤버변수, 함수는 사용시 속한 클래스를 객체생성
		// new 후 참조변수를 사용 접그, 사용함
		//static이 붙은 함수는 객체 생성 new  필요없이 호출할 수 있음
		//java ArrayTest7 aa bb cc
		for (String s : args) {
			System.out.println(s);
		}
		
	}

}
