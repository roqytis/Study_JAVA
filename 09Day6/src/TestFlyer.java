
public class TestFlyer {

	public static void main(String[] args) {
		
		Flyer b= new Bird();
		b.takeOff();
		b.fly();
		b.land();
		
		Flyer m= new SuperMan();
		m.takeOff();
		m.fly();
		m.land();
		
		Flyer a= new Airplane();
		a.takeOff();
		a.fly();
		a.land();
	
	    Flyer[] p=new Flyer[] {b,m,a};
	    for (Flyer f : p) {
			f.fly();
		}
		
	}

}
