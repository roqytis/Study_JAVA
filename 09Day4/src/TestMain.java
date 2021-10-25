
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(A.Num);
		//A.Num=100;
		ConcreteClass c=new ConcreteClass();
		System.out.println(c.Num);
		c.a();
		c.b();
		c.c();
		A.d();
		A tt =new ConcreteClass();//다형성 , 형변형
		
	}

}
