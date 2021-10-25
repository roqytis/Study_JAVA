
public class EnumTest3 {


	//public enum 타입 {상수값,상수값2,상수값3}
	public enum Color {BLUE,RED,YELLOW}
	
	public static void main(String[] args) {
		 // 타입.상수값
		Color c = Color.BLUE;
	//	System.out.println(c.ordinal()); //BLUE		
		Color c2 = Color.RED;
	//	System.out.println(c2.ordinal());
		Color c3 = Color.YELLOW;
		//Color c4 = Color.GREEN;
	
		
		Color[] xx = Color.values();
		for (Color p : xx) {
			//System.out.println(p);
			System.out.println(p.name()+"\t"+p.ordinal());
		}
		
	}//end main0
}//end class




