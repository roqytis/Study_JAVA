
public class TestStudent2 {

	public static void main(String[] args) {
		//1.객체생성
		Student stu1=new Student("홍길동");
		System.out.println(stu1.name+"\t"+stu1.age+"\t"+stu1.address);

		Student stu2=new Student("이순신",100,"해남");
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
	    ///////////////////////////////////////////////////////////////////
	    Student stu3= new Student();//기본 생성자 호출
	    System.out.println(stu3.name+"\t"+stu3.age+"\t"+stu3.address);
	}

}
