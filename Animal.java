package my.day15.sub2;

public abstract class Animal implements InterAnimal {

	
	
	static int count;
	
	
	private String name;
	private int age;
	
	
		
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	
	
	public Animal() {count++;}
	
	/**
	 * @param name
	 * @param age
	 */
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		count++;
	}

	@Override
	public void crySound() {
		// TODO Auto-generated method stub

	}

	@Override
	public String run() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String grade(String level) {
		// TODO Auto-generated method stub
		return null;
	}

}
