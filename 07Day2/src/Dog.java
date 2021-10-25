
public class Dog extends Pet{


	private String gender;
	private String color; //다른 애완동물에 없는 속성 가정...
    //동작////////////////////////////////
	
	public void cryDog() {
		System.out.println("Dog 멍멍~");
	}
	public void eatDog() {
		System.out.println("Dog 사료 먹기");
	}
	public void sleepDog() {
		System.out.println("Dog 쿨쿨~");
	} 
	// 다른 애완도물에 없는 기능 가정.....
    public void runDog() {
    	System.out.println("Dog  발발~");
    }
    	
	public Dog(String name, int age, String gender, String color) {
		super();
		System.out.println("Dog생성자 호출===================");
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.color = color;
	}
		public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
}
