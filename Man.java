package my.day12;

public class Man extends Human{
	String goArmyDay;//입대일자 
	
	
	
	public Man() {
		super();
		
	}
	

	public Man(String name, float height, int weight,String goArmyDay) {
		super(name,height,weight);
		this.goArmyDay = goArmyDay;
	}

	
	public void showGoArmyDay() {
		System.out.println(name+">>>입대 일자 "+goArmyDay);
	}

	//source -> override Methods -> 메소드 재정의, 부모 클래스의 메소드의 정보를 추가할때.
	@Override
	public void showInfo() {
		super.showInfo();//일단 부모의 메소드 사용, 공통된 메소드는 사요한다.-> Man에서 추가한다.
		System.out.println("4. 입대일자 : "+goArmyDay);
		System.out.println("===================");
	}
	
}
