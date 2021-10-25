
public class TestStudent {

	public static void main(String[] args) {
		
		Student stu= new Student("홍길동", 200, "서울");
        System.out.println(stu);
	System.out.println(stu.getName());
	stu.setName("이순신");
	System.out.println(stu);
	
	
	}

}
