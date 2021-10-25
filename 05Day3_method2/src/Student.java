
public class Student {
    //정보의 은닉화(Encapturation)
	//잘못된 데이터의 객체 저장금지-
	//멤버변수 private 접근금지-> 생성자 명시적 작성 매개변수 데이터 검사후 멤버변수에 설정
	//1. 멤버변수 선언 -private
	private String name;
	private int age;
	private String address;
	//get, setXXX()함수 작성  get 변수명(첫 글자는 대문자)
	public String getName() {
		return this.name;
	}
    public void setName(String name) {
    	if (name.length()<5) {
    		this.name=name;
		}
    	
    }
	//나이 관련 함수
    public int getAge() {
    	return this.age;
    }
    public void setAge(int age) {
    	if (age>0 && age<150) {
			this.age=age;
		}
    }
    //주소관련 함수
    public String getAddress() {
    	return this.address;
    }
    public void setAddress(String address) {
    	this.address=address;
    }
	
	//멤버변수, 기본생성자
	public Student(String name, int age, String addr) {
		//생성자 이용 초기값 설정 전 데이터 검사 후 설정- 객체 생성 만 되고 private이기 때문에 다른 클래스에서 변수 사용 못함
		this.name=name;
		if(age<100) {
			this.age=age;
		}
	this.address=addr;
	}
	public Student() {}// 기본생성자 명시적 의무작성
	
	public String toString() {
		return this.name+"\t"+this.age+"\t"+this.address;
	}
	
}
