package my.day15;

public class Duck extends Animal{
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price<0) {
			this.price = 0;
		}
		else this.price = price;
	}

	@Override
	public void crySound() {
		System.out.println(" 꽥 꽥 ");
		
	}

	/**
	 * @param price
	 */
	public Duck() {}
	public Duck(String name, int age, int price) {
		super(name,age);
		this.price = price;
	}
	public void printDuck() {
		String str = "오리의 이름은 "+getName()+", "+
					  "나이는 "+getAge()+"살, "+
					  "가격은 "+price+"원 입니다.";
		System.out.println(str+"\n");
	}

}
