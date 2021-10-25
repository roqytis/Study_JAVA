package cafe;

public class CafeTest {

	public static void main(String[] args) {
		Cafe cafe= new Cafe();// 배열 10개 방 생성 
		//배열에 coffee객체 넣기 
		cafe.setCoffeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeList(new Coffee("라떼", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));
		cafe.setCoffeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeList(new Coffee("라떼", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));
		cafe.setCoffeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeList(new Coffee("라떼", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));  //11개 추가 - 추가 안됨 
		System.out.println(cafe.totalPrice());	
		
		Coffee[] arr= cafe.getCoffeList();	
		
		
		int sum=0;
		for (Coffee coffee : arr) {
			System.out.println(coffee);
			sum+=coffee.getPrice();
		}
		System.out.println("Coffe가격의 합  "+ sum);

	}

}
