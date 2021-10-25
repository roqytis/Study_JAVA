
public class TestMethod {

	//멤버변수, 생성자, 함수
	String name;
	//3. 멤버함수
	//문법: 접근제한자 리턴타입 함수이름(매개변수){}
	public void test() {//매개변수로 받는 것도 없고 함수 처리 후 반환(리턴값)도 없는 함수임-void
		System.out.println("test()호출됨========"+ name);
		
	}
	
    public static void  numA(int num) {//static 키워드를 함수에 부이면 객체 생성없이 호출가능
    	//매개변수 int num 받아서 사용, 처리 후 리턴이 없음.
    	System.out.println("numA 호출=============="+num);
        num=100;
    	//        String name="aa";
        //        int t=100;
        //        return num+100;//처리완료후 리턴값을 호출 곳으로 반환시킴
    }//호출한 곳으로 돌아가야함
	
    public static int  numB() {
    	System.out.println("numB 호출======================");
        int num=100;
        return num; // 100 호출한 곳으로 int 100을 리턴
        //System.out.println("return 뒷부분");
    }
    
    public static int  numC(int num) {
    	System.out.println("numC 호출=============");
    	return num+100;
    }
    
    
    //method overloading
    public static String numC(String num) {
    	System.out.println("numC 호출 1=========");
    	return num+100;
    }
    public static String numC(String num1, int num2) {
    	System.out.println("numC 호출2 =========");
        return num1+num2;
      //  System.out.println("===========");//리턴으로 반환됨
    }
	public static void main(String[] args) {
//     TestMethod t= new TestMethod();
//     t.name="홍길동";
//     t.test();//테스트함수 호출
//     //test();
//    TestMethod t2= new TestMethod();
//    t2.name="이순신";
//    t2.test();
    // System.out.println(t.name);
	
		int num=1;
		numA(1);//static 함수 호출
	    System.out.println(num);//1 -call by value
        int n= numB();
	    System.out.println("main n======="+n);
	    System.out.println(numB());
	    int data=numC(10);
	    System.out.println(data);
	    numC("aaaa");
	    numC( "aaa",10);
	    String s= numC("aa",10);
	}

}
