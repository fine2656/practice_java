package my.day15;

public class Cat extends Animal{
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void crySound() {
		System.out.println(" 야옹야옹 ~");
		
	}
	/**
	 * @param color
	 */
	public Cat() {}
	public Cat(String name, int age,String color) {
		super(name, age);
		this.color = color;
	}
	public void printCat() {
		String str = "고양이의 이름은 "+getName()+", "+
					  "나이는 "+getAge()+"살, "+
					  "색상은 "+ color+" 입니다.";
		System.out.println(str+"\n");
	}


}
