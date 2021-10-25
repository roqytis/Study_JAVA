
public class TestPet {

	public static void main(String[] args) {
		
		Cat c=new Cat("야옹이",3,"암놈");
//		Cat c2=new Cat("하늘이",1,"숫놈");
        Dog d= new Dog ("누렁이", 8, "암놈", "검정");
	    Fish f=new Fish("골드",1,163.3);
//	    
	    
		System.out.println(c.getName()+"\t"+c.getAge()+"\t"+c.getGender());//부모 클래싀 함수를 자식에서 내꺼와 동일하게 사용함
		c.eat();
		c.cry();
		c.sleep();
/////////////////////////////////////////////////////////////////
//		System.out.println(c2.getName()+"\t"+c2.getAge()+"\t"+c2.getGender());
//		c2.eatCat();
//		c2.cryCat();
//		c2.sleepCat();
//////////////////////////강아지 생선
		System.out.println(d.getName()
				+"\t"+d.getAge()+"\t"+d.getGender()+"\t"+d.getColor());		
				d.eat();
				d.cry();
				d.sleep();
				d.runDog();
//		System.out.println(f.getName()+"\t"+f.getAge()+"\t"+f.getTailSize());
				f.eat();
				f.swimFish();

	}

}
