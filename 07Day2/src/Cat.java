
public class Cat extends Pet {
//부모에 있는 name, age삭제	, get,set 함수 삭제
	private String gender;
	//동작///////////////////////////////////////////
	public void cryCat() {
		System.out.println("cat 야옹~");
	}
	public void eatCat() {
		System.out.println("cat 생선 먹기");
	}
	public void sleepCat() {
		System.out.println("cat 새근새근~");
	}	
	
	////////////////////////////////////////////////
	
		public Cat(String name, int age, String gender) {
		super();
		System.out.println("cat생성자 호출됨===========");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
}
