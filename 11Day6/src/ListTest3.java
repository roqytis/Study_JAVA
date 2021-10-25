import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ListTest3 {

	public static void main(String[] args) {
		
		ArrayList <String> list=new ArrayList<>();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("강감찬");
		list.add("세종");
		//list.add(100);

		
	   
		System.out.println(list.size());
		System.out.println(list.contains("세종"));
		System.out.println(list.indexOf("세종"));
		System.out.println(list.isEmpty());
	
		System.out.println(list);
		List<String>sub=list.subList(0, 3);
		for (String x : sub) {
			System.out.println(">>>>"+x);
		}
	     System.out.println("======================");
	
	     Object[] obj=list.toArray();
	     for (Object x : obj) {
			System.out.println("***"+x);
		}
	list.add(0,"정조");
	     System.out.println(list);
	     list.set(0,"영조");
	     System.out.println(list);
	list.remove(0);
	list.remove("세종");
	System.out.println(list);
	}

}
