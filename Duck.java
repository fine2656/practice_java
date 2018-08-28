package my.day15.sub2;

public class Duck  extends Animal{

	
	private int price;
	
	
	
	
	public Duck() {}
	/**
	 * @param name
	 * @param age
	 * @param price
	 */
	public Duck(String name, int age,int price) {
		super(name, age);
		this.price = price;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void crySound() {
		System.out.println("꽥꽥");
	}

	@Override
	public String run() {
		String result="오리 "+getName()+"가 두발로헤엄쳐서 간다.";
		return result;
		
	}


	@Override
	public String grade(String level) {
		// TODO Auto-generated method stub
		return null;
	}


}
