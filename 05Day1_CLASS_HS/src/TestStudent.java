
public class TestStudent {

	public static void main(String[] args) {
		
//   클래스명 변수명= new클래스명();//클래스의 객체 생성
		//객체생성 방법
		//1. 필요한 클래스 import(패키지가 다른 경우)
		//2. 사용시 로컬변수 규칙을 따름
		//- 선언: 클래스명 변수; ex) Student stu;
		// - 초기화: stu= new Student(); // new를 이용한 객체생성
        // 변수에 생성된 객체의 주소 저장
		//3. 객체의 사용: stu.멤버변수이름, stu.멤버함수의 이름()으로 사용
		Student stu =new Student();//객체생성 후 참조변수가 참조
		System.out.println(stu.name+"\t"+stu.age+"\t"+stu.address);
		Student stu2 =new Student();
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
		System.out.println(stu+"\t"+stu2);
		Student stu3 =new Student();
		System.out.println(stu3.name+"\t"+stu3.age+"\t"+stu3.address);
		
		//가 개체에 실제 학생 정보 저장, 객체의 멤버변수 접근 사용
		stu.name="홍길동";
		stu.age=20;
		stu.address="서울";
		
		stu2.name="이순신";
		stu2.age=44;
		stu2.address="전라";
		System.out.println(stu.name+"\t"+stu.age+"\t"+stu.address);
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
		stu3.name="이순신";
		stu3.age=44;
		stu3.address="전라";
		System.out.println(stu3.name+"\t"+stu3.age+"\t"+stu3.address);
	
	
	}

}
