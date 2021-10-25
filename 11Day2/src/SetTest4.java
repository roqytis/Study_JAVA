import java.util.HashSet;

public class SetTest4 {

	public static void change3(HashSet<String>num) {
		num.remove("홍길동");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<String>set = new HashSet<String>();
    set.add("홍길동");
    set.add("이순신");
    set.add("유관순");
		System.out.println("변경전: "+set);
		change3(set);
		System.out.println("변경후: "+set);
	}

}
