
public class MyTest14 {

	public static void main(String[] args) {
		
		String mesg="100/200";
				String [] data= mesg.split("/");// String 여러개 []//배열
				//data[0]="100", data[1]="200"
				//String data2= mesg.split("/");
				int n= Integer.parseInt(data[0]);
				int n2= Integer.parseInt(data[1]);
System.out.println("정수값 합계: " +(n+n2));
System.out.println("정수값 평균: " +(n+n2)/data.length);
	


//합계 sum에 저장 출력, 평균: sum 변수를 활용하여 구하고 
// avg변수에 저장 출력 추가 
int sum = n+n2;
double avg= sum/data.length;
System.out.println("총합은: "+ sum+ "\t 평균은"+ avg);
	}

}
