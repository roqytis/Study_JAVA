
 class Counter {
	
	private int num;//멤버변수: 객체생성, new객체마다 따로 생성, 참조 변수, 멤버변수
	private static int count;//static : 객체생성 x,1번만 자동생성, 다른 클래스에서 사용
   //클래스이름. count 로 접근 사용
	public Counter() {//생성자
    	num++;// new 객체마다 따로 생성
    	count++;//객체 생성시 카운트 값 증가
    }
    public int getNum() {
    	return this.num;
    }
    public int getCount() {//멤버함수 : 객체생성 하여야 사용가능함
    	return count;//static변수에 this 키 사용 안함
    }
    public static int getCount2() {
    	int aa=10;//
    	//System.out.println(num);//static에서는 멤버변수 사용 불가함
    	return count;
    }
    public static void setCount2(int num) {
    	count=num;
    }
    ////////////////////////////////////////////////
    //public static int getNum2(){
    //     return num;
 //   }

}

public class Testmain {

	public static void main(String[] args) {
		
		System.out.println(Counter.getCount2());//static함수 호출, new 안함, 클래스이름 , static 함수 이름
        Counter c= new Counter();
        
        System.out.println("static count: "+c.getCount());//0->1
        System.out.println("instance num: "+c.getNum());//0->1
        
        Counter c2= new Counter();
        System.out.println("static count: "+c2.getCount());//2
        System.out.println("instance num: "+c2.getNum());//1
	    System.out.println("static count: "+Counter.getCount2());

	    c.setCount2(100);//고유변수로 활용
	    System.out.println(c2.getCount());//100
	}

}
