import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		String data = "aa/bb/cc,dd/ee/xx,kk/yy/zz";
		
		StringTokenizer st = new StringTokenizer(data, "/ ,");
		while(st.hasMoreTokens()) {
			    System.out.print(st.nextToken()+ " ");
		}		
				System.out.println(" ");
	}

}
