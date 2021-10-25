
public class ArrayTest1 {

	public static void main(String[] args) {
		
		//배열. 선언
		//데이터타입[]변수명;
		int[] num;
		
		//2. 배열생성
		//변수명= new데이터타입[크기]
        num= new int[3];
        System.out.println(num[0]);
        System.out.println(num[1]);
	
	    //3. 배열방 명시적 초기화
        num[0]=10;
        num[1]=20;
        num[2]=30;
	    
        //4.배열 데이터사용
       System.out.println(num[0]);
       System.out.println(num[1]);
       System.out.println(num[2]);
       System.out.println("배열크기(길이)"+num.length);
     // System.out.println(num);// 배열의 주소- num은 참조변수
       // 방=index= 0~배열.length-1
	
	int sum=0;
	for (int i = 0; i < num.length; i++) {//i=idx번호
		System.out.println(">> num["+i+"]= ");
	   sum += num[i];// sum= sum+num0, sum+num1, sum+num2
	}
       System.out.println(sum);
       System.out.println("=====================================================");
  
	//foreach문
      int idx=0;
       for (int i : num) {//i는 idx 가 아닌 실제 방 하나의 데이터가 됨
		System.out.println(i);
//	System.out.println("num["+idx+"]=");
//       idx++;
       
       }
	
	
	
	
       
	}

}
