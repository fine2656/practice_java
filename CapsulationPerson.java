package my.day12;

public class CapsulationPerson {
	
	//접근 제한다.
	private String name;//private = 다른 클래스에서는 볼 수 없다.
	
	private int age;
	private double height;
	
	public void setName(String name) {
		if(name.trim().isEmpty()) {
			System.out.println("이름에는 공백만으로는 불가합니다.");
		}
		else {
			this.name = name;
			System.out.println("이 름 : "+name);
		}
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHegiht() {
		return height;
	}
	public void setAge(int age) {
		if(age<=0) {
				System.out.println(">>나이는 0보다 많아야 합니다.");
		}
		else {
			this.age = age;
			System.out.println("나 이 : "+age);
		}
	}
	public void setHeight(double height) {
		if(height<=0) {
			System.out.println(">>키는 0보다 커야 합니다.");
		}
		else {
			this.height = height;
			System.out.println("신 장 : "+height);
		}
		
		
	}
	//CapsulationPerson 객체의 속성 저보값을 출력해주는 메소드 생성

	public void showInfoPerson() {
		System.out.println("1. 성명 : "+name);
		System.out.println("2. 나이 :  "+age);
		System.out.println("3. 신장 : "+height+"cm");
	
	}
}
