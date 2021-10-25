package Workshop06.calc;

public class Calculator {
        public double plus(int data1, int data2) {
        	double result=0.0;
        	result = data1 + data2;
        	return result;
        }
        public double minus(int data1, int data2) {
        	double result=0.0;
        	result = data1 - data2;
        	return result;
        }
        public double multiplication(int data1, int data2) {
        	double result=0.0;
        	result = data1 * data2;
        	return result;
        }
        public double devide(int data1, int data2) {
        	double result=0.0;
        try {	result = data1 / data2;
        }catch(ArithmeticException e) {
        	System.out.println("Exceptio 이 발생");
        }
        return result;
        }
        
}
