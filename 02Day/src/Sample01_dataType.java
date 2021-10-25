import java.util.Date;

public class Sample01_dataType {

	public static void main(String[] args) {
		
		
		System.out.println(100); //정수(int- 기본)
        System.out.println(100L);//정수 (long으로 설정)
        // long 타입은 숫자뒤에 L을 명시해야함
        System.out.println("100");// answkduf 100	
	
	System.out.println(3.14);// 실수, 3.14D d와 동일(기본 double)
	System.out.println(3.14F);// 실수, f와 동일 float시에 실수뒤 F 명시
	System.out.println(3.14D);//실수, d와동일 double =3.14
	System.out.println('홍'); // 문자(하나의 문자), 반드시''작은 따옴표

	System.out.println(true);// boolean 논리값(true,false)
	System.out.println(false);// 소문자만 허용 
	//System.out.println(null);// null값, 가리키지 않는것 (참조 x)

	//참조형
	
	System.out.println("홍"); // 문자열(srting) 반드시""
	//"홍"이라는 문자열을 저장하는 객체를 참조
	System.out.println(new Date()); //날짜관리하는 Date utill class 객체
	}
	

}
