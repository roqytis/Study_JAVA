
public class Pet {//부모 클래스

	 String name;  //private 제거=자식에서 변수 직접 사용
	 int age;
     //기본 생성자
	public Pet() {
		super();//부모객체 먼저 생성을 먼저하도록 super가 들어가 부모의 기본생성자를 자동 호출함
        //코드를 미기재시 jdk가 묵시적으로 부모 생성하는 Super():를 자식의 생성자 첫줄에 자동 삽입함 
		System.out.println("Pet의 기본 생성자 호출==============================");
	}
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
	 
	 
}
