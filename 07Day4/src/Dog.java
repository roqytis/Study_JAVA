
public class Dog extends Pet{


	private String gender;
	private String color; //다른 애완동물에 없는 속성 가정...
    //동작////////////////////////////////
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
		System.out.println("Dog의 cry 호출");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("Dog의 eat 호출");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
		System.out.println("Dog의 sleep 호출");
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
