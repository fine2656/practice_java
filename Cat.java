package my.day15.sub;

public class Cat  implements InterAnimal{

	private String name;
	private String color;
	private int age;
	
	
	
	/**
	 * @param color
	 * @param age
	 * @param name
	 */
	public Cat() {}
	
	public Cat(String name,int age,String color ) {
		super();
		this.color = color;
		this.age = age;
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void crySound() {
		System.out.println("야옹야옹");
		
	}

	@Override
	public String run() {
		String result="고양이 "+name+"가 네발로 달린다.";
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
