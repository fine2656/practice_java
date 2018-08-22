package my.day12;

public class Woman extends Human{//Human으로 부터 상속을 받는다.

	
		String childBirthDay;//출산 예정일
	

	public Woman() {
		//super();//부모 클래스인 Human 의 기본생성자를 호출한다.
		//super();은 생략되어져 있을 뿐 작동을 한다
		System.out.println("=== Woman Class 의 기본 생성자 호풀함 !!===");
	}


	public Woman(String name, float height, int weight, String childBirthDay) {
		
		super(name,height,weight);
		
		this.childBirthDay = childBirthDay;
	}
	public void showChildBirthDay() {
		System.out.println(">>> "+super.name+"님의 출산일 자 : "+childBirthDay);
	}


	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("4. 출산일정 : "+childBirthDay);
	}
	
}
