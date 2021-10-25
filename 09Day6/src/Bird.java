
public class Bird implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("새가 이륙");
		
	}

	@Override
	public void land() {
		System.out.println("새가 착륙");
		
	}

	@Override
	public void fly() {
		System.out.println("새가 날아간다");
		
	}

}
