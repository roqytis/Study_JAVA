
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
	//	AbstractClass x =new AbstractClass();
		ConcreteClass y =new ConcreteClass(100);
		System.out.println(y.getNum());
				y.test();
		AbstractClass x=new ConcreteClass();//다형성
		x.test();
		
	}

}
