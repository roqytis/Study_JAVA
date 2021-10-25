import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest4 {

	public static void main(String[] args) {
		
		HashMap<String,String>map=new HashMap<>();
		map.put("one", "홍길동");
		map.put("two", "강감찬");
		map.put("three", "유관순");
	  
		System.out.println(map);

	Set<String>keys=map.keySet();
	System.out.println(keys);
	
	for (String key : keys) {
		System.out.println(key+"\t"+map.get(key));
	}
	
	/////////////////////
//	Iterator<String>ite = keys.iterator();
//	while (ite.hasNext()) {
//		String key =ite.next();
//		System.out.println(key+"\t"+map.get(key));
//		
//	}
	
	
//		System.out.println(map.get("one"));
//		System.out.println(map.get("two"));
//		System.out.println(map.get("three"));
//		//매서드
//		System.out.println("크기"+map.size());
//		System.out.println("키포함여부"+map.containsKey("one"));
//		System.out.println("값 포함ㅇ부: "+map.containsValue("유관순"));
		
//		map.replace("three","강감찬");
//		map.remove("two");

	
	
	
	
	
	
	
	}

}
