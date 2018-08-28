package my.day15.sub2;

public class Cat   extends Animal{


	private String color;

	
	
	/**
	 * @param color
	 * @param age
	 * @param name
	 */
	public Cat() {}
	
	public Cat(String name, int age,String color ) {
		super(name,age);
		this.color = color;

	
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void crySound() {
		System.out.println("야옹야옹");
		
	}

	@Override
	public String run() {
		String result="고양이 "+getName()+"가 네발로 달린다.";
		return result;
	}


	@Override
	public String grade(String level) {
		// TODO Auto-generated method stub
		return null;
	}

}
