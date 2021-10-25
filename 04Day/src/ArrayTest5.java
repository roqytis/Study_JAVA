
public class ArrayTest5 {

	public static void main(String[] args) {
		
		//1.new 이용
		int[] num;
		num= new int[3];
		num[0]=10;
		num[1]=30;
		num[2]=40;

		//2.값만 이용 -한줄로 선언과 초기화 동시에 
		int[] num2= {10,20,30};
		////////////////////////////////
		//3. new+값
		int [] num3;
		num3=new int[] {10,20,30};
		num3=new int[] {10,20,30,40};
		for (int i : num3) {
			System.out.println(">>"+i);
		}
	    String[] names= new String[] {"aa","bb"};
	    for (String s : names) {
			System.out.println(s);
		}
	    for (int i = 0;  i< names.length; i++) {
			System.out.println(">>>>>>>>>>"+ names[i]);
		}
	
	}

}
