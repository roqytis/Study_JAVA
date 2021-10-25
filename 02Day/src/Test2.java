
public class Test2 {

	public static void main(String[] args) {
		// 이거 꼭 외우자
		String m="hello";
		String m2="hello";
		//자바에서 문자열 비교할때 == 사용불가
		// equals
		
		//System.out.println(m== m2);//사용안함, 주소비교만 사용가능
		System.out.println(m.equals(m2));
		//  반드시 equals메시지 사용하기

		System.out.println(m);// hello
		// 자동으로 to ㄴtring이 붙음
		System.out.println(m.toString());// hello
		System.out.println(m.hashCode());
		System.out.println(m2.hashCode());
	}

}
