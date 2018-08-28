package my.day15.sub2;

public class TestMain {

	public static void main(String[] args) {
		Animal[] aniArr = new Animal[5];//미완성 클래스로 받기만 할 수 있을뿐 객체를 만들 수 없다.
		//-> Animal a = new Animal(); X 만들어진 객체를 만드는 역할 일 뿐
		

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
		
		for(int i=0; i<Animal.count; i++) {
			if(aniArr[i] instanceof Dog) {
				
				System.out.println("1.성명 : "+ (aniArr[i]).getName());
				System.out.println("2.나이 : "+(aniArr[i]).getAge());
				System.out.println("");
				
			}
			else if(aniArr[i] instanceof Cat) {
				System.out.println("1.성명 : "+ (aniArr[i]).getName());
				System.out.println("2.나이 : "+ (aniArr[i]).getAge());
				System.out.println("");
			}
			else if(aniArr[i] instanceof Duck) {
				System.out.println("1.성명 : "+ (aniArr[i]).getName());
				System.out.println("2.나이 : "+ (aniArr[i]).getAge());
				System.out.println("");
			}
				System.out.println(aniArr[i].run());
				System.out.println("");
				aniArr[i].crySound();
			}
			
		}
	}

