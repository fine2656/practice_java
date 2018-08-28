package my.day15.sub;

public class Duck implements InterAnimal {

	
	
	private String name;
	private int age;
	private int price;
	
	
	
	
	public Duck() {}
	/**
	 * @param name
	 * @param age
	 * @param price
	 */
	public Duck(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void crySound() {
		System.out.println("꽥꽥");
	}

	@Override
	public String run() {
		String result="오리 "+name+"가 두발로헤엄쳐서 간다.";
		return result;
		
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public String grade(String level) {
		// TODO Auto-generated method stub
		return null;
	}


}
