import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		//set : 순서 없음, 중복불가
		
		Set set =new HashSet();
		set.add("1");
		set.add("2");
		set.add(3);
		set.add("4");
		set.add(3.15);
		set.add(new Date());
		System.out.println(set);

	System.out.println("길이:" + set.size());
	System.out.println("포함여부:" + set.contains(20));
	System.out.println("empty 냐:" + set.isEmpty());
	
	Object [] xxx=set.toArray();
	for (Object o : xxx) {
		System.out.println(o);
			}
	set.clear();
	System.out.println(set);
	}

}
