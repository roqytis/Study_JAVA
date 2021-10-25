package workshop07;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Mobile>map=new HashMap<String,Mobile>();
		double sum=0.0;
	
		Mobile m1 = new Mobile("LU6800", "Optimus 2X", 800000.0);
        Mobile m2 = new Mobile("SU6600", "Optimus Black", 900000.0);
        Mobile m3 = new Mobile("KU5700", "Optimus Big", 700000.0);
        Mobile m4 = new Mobile("SU7600", "Optimus Mach", 950000.0);

        map.put(m1.getCode(), m1);
        map.put(m2.getCode(), m2);
        map.put(m3.getCode(), m3);
        map.put(m4.getCode(), m4);

        for (String code: map.keySet()) {
			Mobile m=map.get(code);
			System.out.println(m.printInfo());
			sum+=m.getPrice();
		}
	System.out.println("합계: "+sum);
	System.out.println();
	
	//모바일 가격 10%상승
	for (String code : map.keySet()) {
		Mobile m=map.get(code);
		m.setPrice(m.getPrice()+(m.getPrice()*0.1));
		}
	System.out.println("가격 변경 후");
	
	for (String code : map.keySet()) {
		Mobile m= (Mobile)map.get(code);
		System.out.println(m.printInfo());
		sum+= m.getPrice();
	}
	System.out.println("합계: "+sum);
	}

}
