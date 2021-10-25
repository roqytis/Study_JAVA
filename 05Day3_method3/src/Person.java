
public class Person {
   //1. 멤버변수 영역 -private
	private String name;
	private int age;
 
   //2. 생성자 오버로딩
    public Person (String name, int age) {
    	this.name=name;
    	this.age=age;
    }
	public Person() {}
	
	//3. 각 멤버변수에 관련 get,set 구현
    public String getName() {
    	return name;
    }
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
    //4. 데이터 출력용 toString()구현
	//오버라이드
	public String toString() {
		return "Person [name="+ name+",age="+age+"]";
	}
	
	
	
	
	
}
