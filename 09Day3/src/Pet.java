
public abstract class Pet {

	private String name;
	private int age;
	
	//기능
	public abstract void cry();
	public abstract void eat();
	public abstract void sleep();
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}








}
