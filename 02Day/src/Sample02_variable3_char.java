
public class Sample02_variable3_char {

	public static void main(String[] args) {
		
//		long num= 100;// L을 누르지 않아도 long 형으로 저장
//		long num1= 9999999999999L;// int보다 큰값은 맨뒤에 L을 추가해 준다
//		System.out.println(num+num1);
		
		int num3=10;
		num3=20;
		System.out.println(num3);
		num3=30;
		System.out.println(num3);
		num3=num3+10; // 30+10
		System.out.println(num3);
		
		char c='A';
		char c2='홍';
	    char c3='\uD64D';
	    
	    System.out.println(c+" "+c2+" "+c3);
	    
	    //escape문자
	    System.out.println("aaa\tbbb");
	    System.out.println("aaa\nbbb");
	    System.out.println("aaa\'bbb");
	    System.out.println("aaa\"bbb");
	    System.out.println("aaa\\bbb");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
