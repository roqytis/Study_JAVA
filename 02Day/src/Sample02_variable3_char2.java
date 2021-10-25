
public class Sample02_variable3_char2 {

	public static void main(String[] args) {
		
		// char는 수치형이다.
		char  c='A';//65(아스키코드값)
		char c1= 'a';//97(아스키코드값)
		System.out.println(c+1);//66 c사용 후 저장 안함 c=65
        System.out.println(c1+1);//98
	    char c3= (char)(c+1);// 명시적 형변환 66 c3= B
	    System.out.println(c3);
	    char c2= (char)65;
	    System.out.println(c2);
	
	}

}
