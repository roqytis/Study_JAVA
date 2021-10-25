
public class Cat extends Pet {

	private String gender;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age, String gender) {
		super(name,age);
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Cat [gender=" + gender + "]";
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("cat 야옹!");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("cat 생선 먹기");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("cat 쿨쿨");
	}
	
}
