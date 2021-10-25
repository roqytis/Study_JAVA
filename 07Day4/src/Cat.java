
public class Cat extends Pet {
//부모에 있는 name, age삭제	, get,set 함수 삭제
	private String gender;
	//오버라이딩(재정의) 에 대한 정의- 부모의 함수를 자식에서 입맛에 맞도록 내용수정
	// 상속관계에서 부모의 함수정의는 따라가고 내용만 자식에게 맞도록 수정
	public void cry() {
		System.out.println("cat ========== 울기");
	}
	@Override
public void eat() {
	// TODO Auto-generated method stub
//	super.eat();
		System.out.println("Cat eat()==========");
}
   @Override
public void sleep() {
	// TODO Auto-generated method stub
//	super.sleep();
	   System.out.println("Cat sleep()==========");
}
	//동작///////////////////////////////////////////
//	public void cryCat() {
//		System.out.println("cat 야옹~");
//	}
//	public void eatCat() {
//		System.out.println("cat 생선 먹기");
//	}
//	public void sleepCat() {
//		System.out.println("cat 새근새근~");
//	}	
	
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
