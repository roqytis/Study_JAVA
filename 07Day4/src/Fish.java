
public class Fish extends Pet {
	
	private double tailSize; //Fish에만 존재하는 속성 가정
    //동작////////////////////
	/////// 공통부분
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("fish cry=========");
	}


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("fish eat=========");
	}


	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("fish sleep=========");
	}

		////////////////////////
	//동작=유일한 부분
	public void swimFish() {
		System.out.println("어푸어푸~");
	} 
	
	
	


	public Fish(String name, int age, double tailSize) {
		super();
		this.name = name;
		this.age = age;
		this.tailSize = tailSize;
	}
		public double getTailSize() {
		return tailSize;
	}
	public void setTailSize(double tailSize) {
		this.tailSize = tailSize;
	}

}
