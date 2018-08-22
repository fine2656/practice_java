package my.day12;

public class CapsulationPersonMain {

	public static void main(String[] args) {
		 CapsulationPerson person1 = new  CapsulationPerson();
		 person1.setName("홍길동");//private 변수는 불러 올 수 없으므로 매소드를 대신 불러온다.
		 person1.setAge(27);
		 person1.setHeight(176.7);
		 
		 System.out.println(person1.getName()+"님의 나이는 "+person1.getAge()+"세 신장은 "+person1.getHegiht()+"cm 입니다.");
		 /*
		  홍길동 님의 나이는 26세 신장은 178.9cm 입니다.
		  */
	}

}
