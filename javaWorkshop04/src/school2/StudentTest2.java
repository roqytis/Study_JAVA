package school2;

public class StudentTest2 {

	public static void main(String[] args) {
		Student studentArray[]=new Student[3];
		        studentArray[0]=new Student("홍길동", 15, 170, 80);
				studentArray[1]=new Student("한사람",13, 180, 70);
				studentArray[2]=new Student("임걱정", 16, 175, 65);
					
				int maxAgeIndex=0;
				int minAgeIndex=0;
				int maxHeightIndex=0;
				int minHeightindex=0;
				int maxWeightIndex=0;
				int minWeightIndex=0;
				
				System.out.println("출력 : ");
				for (int i = 0; i < studentArray.length; i++) {					
				if (studentArray[maxAgeIndex].getAge()< 
					studentArray[i].getAge()){
				maxAgeIndex=i;
				}							
				if (studentArray[maxHeightIndex].getHeight()< 
						studentArray[i].getHeight()){
					maxHeightIndex=i;
				}							
				if (studentArray[maxWeightIndex].getWeight()< 
						studentArray[i].getWeight()){
					maxWeightIndex=i;
			}				
		}
	    System.out.println("나이가 제일 많은 학생이름: "+studentArray[maxAgeIndex].getName());
		System.out.println("신장이 제일 큰 학생이름 : " + studentArray[maxHeightIndex].getName());
		System.out.println("몸무게가 제일 큰 학생이름: " +studentArray[maxWeightIndex].getName());
		}
       }
