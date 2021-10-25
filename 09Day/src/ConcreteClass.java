
public class ConcreteClass extends AbstractClass {
//추상 클래스 상송
	public ConcreteClass() {
		super();
	}
    public ConcreteClass(int num) {
    	super(num);
    }

    @Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("test()====================");
	}
}
