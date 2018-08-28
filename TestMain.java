package my.day15.sub;

public class TestMain {

	public static void main(String[] args) {
		InterAnimal[] aniArr = new InterAnimal[5];

		Dog dog = new Dog("뽀삐", 9, 10);	
		
		Cat cat = new Cat("톰", 3, "검정");
		Duck duck = new Duck("도널드", 5, 50000);
		
		aniArr[0] = dog;
		aniArr[1] = cat;
		aniArr[2] = duck;
		
		for(int i=0; i<3; i++) {
			System.out.println(aniArr[i].run());
			aniArr[i].crySound();
		}
		
		System.out.println("--------------------------");
		
		for(int i=0; i<3; i++) {
			if(aniArr[i] instanceof Dog) {
				System.out.println("1.성명 : "+ ((Dog)aniArr[i]).getName());
				System.out.println("2.나이 : "+((Dog)aniArr[i]).getAge());
				System.out.println("");
				
			}
			else if(aniArr[i] instanceof Cat) {
				System.out.println("1.성명 : "+ ((Cat)aniArr[i]).getName());
				System.out.println("2.나이 : "+ ((Cat)aniArr[i]).getAge());
				System.out.println("");
			}
			else if(aniArr[i] instanceof Duck) {
				System.out.println("1.성명 : "+ ((Duck)aniArr[i]).getName());
				System.out.println("2.나이 : "+ ((Duck)aniArr[i]).getAge());
				System.out.println("");
			}
				System.out.println(aniArr[i].run());
				aniArr[i].crySound();
			}
			
		}
	}

