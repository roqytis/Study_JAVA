
public class Sample05_operator{

	public static void main(String[] args) {
		
		//1.산술연산자; +,-,*,/,%
		int n=10;
		int n2=3;
		System.out.println(n+n2);//13
		System.out.println(n-n2);//7
		System.out.println(n*n2);//30
		System.out.println(n/n2);//3
		System.out.println(n/3.0);//3.333333
		System.out.println(n%n2);//나눈 나머지1
		
		//2. 대입연산자
		int x=10;
		int x2= x;
		
		x2 +=x;// 예 x2=x2+x 와 동일
		System.out.println(x2);
		//x2+=1; //x2=x2+1;

		x2-=x;//x2=x2-c 20-10
		System.out.println(x2);//x2=10
		
		x2*=x;// x2=x2*x  10*10
		System.out.println(x2);//100
		
		x2/=x; //x2=x2/10 100/10
		System.out.println(x2);//10
		
		x2 %=x; // x2=x2%10 10%10
		System.out.println(x2);//0
		
		x2+=1;
		System.out.println(x2);//1
		
		x2-=1;
		System.out.println(x2);//0
		
		
		//4.비교 연산자==>실행결과는 논리값
        int xyz=5;
        int xyz2=3;
        boolean result = xyz == xyz2;// 
        System.out.println(result);//F
        System.out.println(xyz==xyz2);//F
        System.out.println(xyz!=xyz2);//T
        System.out.println(xyz>xyz2);//T
        System.out.println(xyz>=xyz2);//T
        System.out.println(xyz<xyz2);//F
        System.out.println(xyz<=xyz2);//F
        
        //5.논리 연산자
        
        System.out.println(3==4 && 4>3);//F
        System.out.println(! true);//F
        System.out.println(! false);//T
        System.out.println(true || true);//F
        System.out.println(true || false);//T
		System.out.println(false || true);//T
		System.out.println(false || false);//F

		System.out.println(true && true);//T
		System.out.println(true && false);//F
		System.out.println(false && true);//F
		System.out.println(false && false);//F

		
		//3.증감연산자
		int y=10;
			int y2=++y;//먼저 증가하고 나중에 할당
			System.out.println(y+"\t"+y2);// y=11,y2= 11
			int y3=y++;// 후치: 먼저 할당하고 나중에 증가
			System.out.println(y+"\t"+y3);// y=12, y3=11
        
			int k=10;
			++k;//먼저 증가하고 나중에 할당
			System.out.println(k);
			k++;// 후치: 먼저 할당하고 나중에 증가
			System.out.println(k);
			
		int x1 = 10;
		int y1= (--x1) + (10*(++x1));
		System.out.println(x1);
		System.out.println(y1);
		
		
		//6. 3항연산자
		int xxx=(3==4)? 100:200;
	    String xxx2 =(3==4)?"A":"B";
		System.out.println(xxx);
        System.out.println(xxx2);
	}

	

}
