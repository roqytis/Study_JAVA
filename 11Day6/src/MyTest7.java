import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyTest7 {

	public static void main(String[] args) {
		
		HashMap<String,Person> map=new HashMap<>();
		map.put("one", new Person("홍길동",20,"서울"));
		map.put("two", new Person("홍길동2",30,"서울2"));
		map.put("three", new Person("홍길동3",40,"서울3"));
	
		HashMap<String,Person> map2=new HashMap<>();
		map2.put("one", new Person("이순신",20,"전라"));
		map2.put("two", new Person("이순신2",30,"전라2"));
		map2.put("three", new Person("이순신3",40,"전라3"));
	    
	    ArrayList<HashMap<String,Person>> list=
	    		new ArrayList<HashMap<String,Person>>();
	    list.add(map);
	    list.add(map2);
	
	    //데이터 출력하기
	    for (HashMap<String, Person> x : list) {
			Set<String>keys=x.keySet();
			for (String key: keys) {
				Person p=x.get(key);
				System.out.println(p.getName());
			}
		}
System.out.println("============================");
  //Iterator
 
Iterator<HashMap<String,Person>> i=list.iterator();
while (i.hasNext()) {
	HashMap<String,Person> m=i.next();
	Set<String>keys =m.keySet();
	for (String s : keys) {
		System.out.println(m.get(s).getName());
	}
	
	
	}

	}}
