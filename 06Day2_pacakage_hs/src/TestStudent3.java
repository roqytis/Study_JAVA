import com.xxx.Student;

public class TestStudent3 {

	public static void main(String[] args) {
		//패키지의 명시적 지정 사용
		Student s= new Student();
		System.out.println(s.name);
	    com.yyy.Student s2= new com.yyy.Student();
	    System.out.println(s2.name);
		
	}

}
