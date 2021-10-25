
public class TestStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student x = new Student("홍길동",20,"서울");
		Student x2 = new Student("홍길동",20,"서울");
	
		System.out.println(x==x2);
		System.out.println(x.equals(x2));// true Student 클래스 재정의 된 equals 사용
	}

}
