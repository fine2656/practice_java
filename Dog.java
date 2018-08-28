package my.day15.sub2;

public class Dog  extends Animal{


	private int weight;
	
	
	public Dog() {}
	
	
	public Dog(String name,int weight) {
		this(name,1,weight);//생성자 내에서 또 다른 생성자를 호출한다.
		//this는 자기 자신 . 자기자신의 생성자 Dog 를 호출.

		//생성자의 오버로딩
		// 값을 주고 값을 안준 나머지는 기본값이다.
	
		}
		
	
	
	public Dog(String name, int age,int weight) {
	super(name,age);
	this.weight = weight;
	}
	
	
	@Override
	public void crySound() {
		System.out.println("멍멍");
	}



	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String run() {
		String result="강아지 "+getName()+"가 네발로 달린다.";
		return result;
	}



	@Override
	public String grade(String level) {
		// TODO Auto-generated method stub
		return null;
	}

}
