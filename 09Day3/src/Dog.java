
public class Dog extends Pet {

	private String color;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age,String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [color=" + color + "]";
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog 왈왈");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Dog 콜콜");
	}
	
	
}
