import com.xxx.Student;

public class TestStudent2 {

	public static void main(String[] args) {
		//패키지의 명시적 지정 사용
		
		com.xxx.Student s= new com.xxx.Student();
		System.out.println(s.name);
		com.yyy.Student s2= new com.yyy.Student();
		System.out.println(s2.name);
		com.zzz.Student s3= new com.zzz.Student();
		System.out.println(s3.name);
		
	}

}
