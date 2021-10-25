
public class TestPet5 {

	public static void main(String[] args) {
		Pet [] c= {
				
				new Cat("야옹이", 3, "암놈"),
				new Cat("야옹이", 3, "암놈"),
				new Dog("누렁이", 8, "암놈","검정"),

	};
for (Pet x : c) {
	if (x instanceof Cat) {
		Cat c1=(Cat)x;
		System.out.println("Cat"+ c1.getGender());
	} else if(x instanceof Dog){
       Dog d=(Dog)x;
       System.out.println("Dog"+d.getColor());
	}else if(x instanceof Pet){
	       	       System.out.println("Dog"+x.getAge());
     }
   }
 }
}
