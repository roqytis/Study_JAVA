
public class TestOuter {

	public static void main(String[]args) {
		//1
//		Outer outer =new Outer();
//		outer.innerCreate();
	
	    //2. outer 밖에서 Inner 생성
		Outer outer2=new Outer();
		outer2.n=10;
		Outer.Inner inner = outer2.new Inner();
		inner.info();
		
	
	
	
	
	}
}
