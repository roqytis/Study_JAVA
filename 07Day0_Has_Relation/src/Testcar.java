
public class Testcar {

	public static void main(String[] args) {
		car c=new car(new Engine("A010","2001"),"g80");
      Engine e=c.getEngine();
      System.out.println(c);
      Engine en1=new Engine("B111","2020");
      car c2=new car(en1,"gv70");
      System.out.println(c2);
	}

}
