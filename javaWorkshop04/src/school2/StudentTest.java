package school2;

public class StudentTest {

	public static void main(String[] args) {
		Student studentArray[]=new Student[3];
		studentArray[0]=new Student("홍길동", 15, 170, 80);
				studentArray[1]=new Student("한사람",13, 180, 70);
				studentArray[2]=new Student("임걱정", 16, 175, 65);
	
				double totalAge=0.0;
				double totalHeight=0.0;
				double totalWeight=0.0;
				
				int maxAgeIndex=0;
				int minAgeIndex=0;
				int maxHeightIndex=0;
				int minHeightindex=0;
				int maxWeightIndex=0;
				int minWeightIndex=0;
				
				
				
				System.out.println("이름 \t 나이 \t 신장 \t 몸무게");
						for (int i = 0; i < studentArray.length; i++) {
							totalAge+=studentArray[i].getAge();
							totalHeight+=studentArray[i].getHeight();
							totalWeight+=studentArray[i].getWeight();
							
				if (studentArray[maxAgeIndex].getAge()< 
					studentArray[i].getAge()){
				maxAgeIndex=i;
				}			
				if (studentArray[minAgeIndex].getAge()>   //if(maxAgeStudent.getAge()<studentArrat[i].getAge())
						studentArray[i].getAge()){ // {maxAgeStudent= studentArray[i];}
					minAgeIndex=i;
				}			
				if (studentArray[maxHeightIndex].getHeight()< 
						studentArray[i].getHeight()){
					maxHeightIndex=i;
				}			
				if (studentArray[minHeightindex].getHeight()>   
				studentArray[i].getHeight()){ 
					minHeightindex=i;
				}			
				if (studentArray[maxWeightIndex].getWeight()< 
						studentArray[i].getWeight()){
					maxWeightIndex=i;
				}			
				if (studentArray[minWeightIndex].getWeight()>   //if(maxAgeStudent.getAge()<studentArrat[i].getAge())
				studentArray[i].getWeight()){ // {maxAgeStudent= studentArray[i];}
					minWeightIndex=i;
				}			
							
							
													
							
							
							
							System.out.println(studentArray[i].getName()+"\t"
									+studentArray[i].getAge()+"\t"+
									studentArray[i].getHeight()+"\t"+
									studentArray[i].getWeight()+"\t");
									
						}
	
						
						
	System.out.println();
	System.out.printf("나이의 평균: %.2f \n", totalAge/3);
	System.out.printf("신장의 평균: %.2f \n", totalHeight/3);
	System.out.printf("몸무게의 평균: %.2f \n", totalWeight/3);
	System.out.println("============================");

	System.out.println("나이가 가장 많은 학생: "+studentArray[maxAgeIndex].getName());
	System.out.println("나이가 가장 적은 학생: "+studentArray[minAgeIndex].getName());
	System.out.println("신장이 가장 큰 학생 : " + studentArray[maxHeightIndex].getName());
	System.out.println("신장이 가장 작은 학생 : " + studentArray[minHeightindex].getName());
	System.out.println("몸무게가 가장 많이 나가는 학생 : " +
	studentArray[maxWeightIndex].getName());
	System.out.println("몸무게가 가장 적게 나가는 학생 : " +
	studentArray[minWeightIndex].getName());

	
	}

}
