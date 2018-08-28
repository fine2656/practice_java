package my.day15.sub;

public class Dog implements InterAnimal {

	private String name;
	private int age;
	private int weight;
	
		/**
	* @param name
	* @param age
	*/
	
	public Dog() {}
	public Dog(String name, int age,int weight) {

	this.name = name;
	this.age = age;
	this.weight = weight;
	}
	
	
	@Override
	public void crySound() {
		System.out.println("멍멍");
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String run() {
		String result="강아지 "+name+"가 네발로 달린다.";
		return result;
	}

	@Override
	public int getAge() {
		
		return age;
	}

	@Override
	public String grade(String level) {
		// TODO Auto-generated method stub
		return null;
	}

}
