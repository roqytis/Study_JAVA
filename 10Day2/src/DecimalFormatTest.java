import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatTest {

	public static void main(String[] args) throws ParseException {
		
		//1.숫자--> String : format
		
		DecimalFormat df = new DecimalFormat("$###,###,###");
		String mesg = df.format(987654321);
		System.out.println(mesg);
		/////////////////////////////////////////////////////////////
		//2. String --> 숫자 : parse
		DecimalFormat df2 = new DecimalFormat("$###,###");
		Number xxx = df2.parse("$987,654");
		System.out.println(xxx);
		System.out.println(xxx.intValue()-1);//정수 변경 후 연산
		
		
	}

}