package Workshop06.calc;

public class CalcTest {
    public static void main(String[] args) {
    	//10 + 5
        int data1 = Integer.parseInt(args[0]);
        String arg = args[1];
        char operator = arg.charAt(0);
        int data2 = Integer.parseInt(args[2]);
        data1=10;
        operator='+';
        data2=20;
        System.out.println(data1 + "\t"+ operator+ "\t"+ data2);    
        
        
        
        
        
        
        
        
        
        Calculator calc= new Calculator();

        if(operator == '+'){
            System.out.println(calc.plus(data1,data2));

        }else if(operator == '-'){
            System.out.println(calc.minus(data1,data2));

        }else if(operator == 'x'){ //소문자 x 사용 
            System.out.println(calc.multiplication(data1,data2));
///////////////////////////////////////////
        }else if(operator == '/'){
            System.out.println(calc.devide(data1,data2));
        }
    }
}

