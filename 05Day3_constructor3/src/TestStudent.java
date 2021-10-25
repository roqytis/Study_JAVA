
public class TestStudent {

	public static void main(String[] args) {
		//1.객체생성
		Student stu1= new Student();//객체생성완료- 클래스 안의 생성장 호출(constructor)
        //호출하여 생성 new Student()==> public Student(){} 생성자 호출 객체를 생성함
		Student stu2= new Student();
	
		System.out.println(stu1.name+"\t"+stu1.age+"\t"+stu1.address);
		
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
		
	
	
	}

}
