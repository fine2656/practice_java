package my.day12;

public class UnCapsulationPersonMain {

	public static void main(String[] args) {
		
		UnCapsulationPerson person1 = new UnCapsulationPerson();
		person1.name = "홍길동";
		person1.age = 25;
		person1.height = 175.7;
		
		person1.showInfoPerson();
		System.out.println("==================================\n");
		
		UnCapsulationPerson person2 = new UnCapsulationPerson();
		person2.name = "이순신";
		person2.age = -236;
		person2.height = -0.77;
		
		person2.showInfoPerson();
		
	}

}
