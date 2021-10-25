import java.io.CharArrayWriter;

public class TestPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Pet c = new Cat("야옹이",3,"암놈");
         
         c.eat();
         c.cry();
         c.sleep();
         Cat c2=(Cat)c;
         System.out.println(c2.getGender());
	}

}
