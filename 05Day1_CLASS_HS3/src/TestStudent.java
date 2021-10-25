
public class TestStudent {

	public static void main(String[] args) {
		
		Student stu =new Student();//객체생성 후 참조변수가 참조
		System.out.println(stu.name+"\t"+stu.age+"\t"+stu.address);
		//객체생성시 명시적 초기화된 값으로 객체 생성
		
		Student stu2 =new Student();
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);

				
//		System.out.println(stu+"\t"+stu2);
//		Student stu3 =new Student();
//		System.out.println(stu3.name+"\t"+stu3.age+"\t"+stu3.address);
//		
//		//가 개체에 실제 학생 정보 저장, 객체의 멤버변수 접근 사용

		stu.age=20;
		stu2.age=44;

		System.out.println(stu.name+"\t"+stu.age+"\t"+stu.address);
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
//		stu3.name="이순신";
//		stu3.age=44;
//		stu3.address="전라";
//		System.out.println(stu3.name+"\t"+stu3.age+"\t"+stu3.address);
//	
	
	}

}
