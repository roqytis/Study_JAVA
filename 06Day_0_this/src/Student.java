
public class Student {

	//초기선언, 멤버 변수
	private String name;
	private int age;
	private String address;
	
	
	
	public Student(String name, int age) {
		//super();
		this(name,age, "서울");
	}

	public Student(String name) {
		//super();
		this(name,0,null);
	}

	//매개변수 오버라이딩  자동, 생성자 만들기 만들기 //오른쪽마우스 -> 소스-> 슈퍼 클래스
	public Student(String name, int age, String address) {
		super();// 상속과 관련, 부모생성자 호출 코드 - jdk가 생성자 첫라인에 묵시적 삽입함
		System.out.println("Student (String name, int age, String address) 최종 생성자 호출");
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Student() {
		super();// 상속과 관련, 부모생성자 호출 코드 - jdk가 생성자 첫라인에 묵시적 삽입함
		
	}
		//get set 만들기 오른쪽마우스 -> 소스-> setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
}
