package my.day15;
//=== 메소드의 오버라이딩(재정의) ===
	// 조건이 부모클래스에 존재하는 메소드이어야 한다.
	// 또한 부모클래스에 존재하던 메소드의 내용물을 뺀 나머지(껍데기)는 똑같아야 한다.
	// 단, 접근지정자(접근제한자)은 부모클래스의 것과 동일하든지 아니면 
	// 부모클래스의 것보다는 제한범위가 더 큰쪽으로 해야한다.
	// 예를들어, 
	// - 부모클래스의 메소드 접근지정자가 public 이라면
	//   자식클래스에서 오버라이딩하는 메소드의 접근지정자는 public 만 가능하다.
	// - 부모클래스의 메소드 접근지정자가 protected 이라면
	//   자식클래스에서 오버라이딩하는 메소드의 접근지정자는 public 또는 protected 만 가능하다.
	// - 부모클래스의 메소드 접근지정자가 public 이라면
	//자식클래스에서 오버라이딩하는 메소드의 접근지정자는 protected 는 불가하다.
public class TestMain {

	public static void main(String[] args) {
		
		TestMain testMain = new TestMain();	
		Animal[] aniArr = new Animal[10];
		Dog dog = new Dog("뽀삐", 9, 10);	
		Cat cat = new Cat("톰", 3, "검정");
		Duck duck = new Duck("도널드", 5, 50000);
		
		aniArr[0] = dog;
		aniArr[1] = cat;
		aniArr[2] = duck;
		
		for(int i=0; i<Animal.count;i++) {
			aniArr[i].crySound();
		}
		
		
		((Dog)aniArr[0]).printDog();
		((Cat)aniArr[1]).printCat();
		((Duck)aniArr[2]).printDuck();
		
		for(int i=0;i<Animal.count;i++) {
			if(aniArr[i] instanceof Dog)
				((Dog)aniArr[i]).printDog();
			else if(aniArr[i] instanceof Cat)
				((Cat)aniArr[i]).printCat();
			else if(aniArr[i] instanceof Duck)
				((Duck)aniArr[i]).printDuck();
		}
		
		System.out.println("");

		System.out.println(dog.toString());//16진수
		System.out.println(cat.toString());
		System.out.println(duck.toString());
		
		//객체의 정보를 알려줌
		//my.day15.Dog@7852e922 -> 
		//my.day15.Cat@4e25154f
		//my.day15.Duck@70dea4e
		
		System.out.println(dog.hashCode());//10진수
		System.out.println(cat.hashCode());
		System.out.println(duck.hashCode());
		//
		//Integer.toHexString(10진수)-> 10진수를 16진수로 변경해서 문자열 형태로 보여주는것
		/*	2018699554
			1311053135
			118352462
		*/
		
		System.out.println(dog.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
