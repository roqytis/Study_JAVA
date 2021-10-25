import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest2 {

	public static void main(String[] args) {
		//set : 순서 없음, 중복불가
		
		HashSet<String> set =new HashSet<>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		set.add("6");
		//set.add(10);
		
		//1. toString
		System.out.println(set);

		//2.foreach
		for (String m: set) {
			System.out.println(m);
		}
	   Iterator<String>ite=set.iterator();
	   while(ite.hasNext()) {
		   String m= ite.next();
		   System.out.println(">>"+m);
	   }
	}

}
