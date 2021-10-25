
public class TestPet6 {

	public static void main(String[] args) {
		Pet [] c= {
				
				new Cat("야옹이", 3, "암놈"),
				new Cat("야옹이", 3, "암놈"),
				new Dog("누렁이", 8, "암놈","검정"),

	};
for (Pet x : c) {
	String name= x.getName();
	int age = x.getAge();
	if (x instanceof Cat) {
		Cat c1=(Cat)x;
		System.out.println("Cat"+ c1.getGender());
	} else if(x instanceof Dog){
       Dog yy=(Dog)x;
       String gender = yy.getGender();
      String color= yy.getColor();
       System.out.println(name+"\t"+age+"\t"+gender+"\t"+color);
	}else if(x instanceof Pet){
	       	       System.out.println("Dog"+x.getAge());
     }
   }
 }
}
