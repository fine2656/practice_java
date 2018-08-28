package my.day15;

public class Dog extends Animal{
	private int weight;
	@Override
	public void crySound() {
		System.out.println(" 멍멍 ~");
		
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight <0) {
		this.weight = 0;

		}
		else this.weight = weight;
			
	}
	/**
	 * @param weight
	 */
	public Dog() {}
	public Dog(String name, int age, int weight) {
		super(name, age);
		this.weight = weight;
	}
	public void printDog() {
		String str = "강아지의 이름은 "+getName()+", "+
					  "나이는 "+getAge()+"살, "+
					  "무게는 "+weight+"kg 입니다.";
		System.out.println(str+"\n");
	}
	
	@Override
	public String toString() {
		String result = "=== "+getName()+"님의 정보 ==="+"\n"+
						"1. 성명 : "+getName()+"\n"+
						"2. 나이 :  "+getAge()+"\n"+
						"3. 체중 : "+getWeight()+"\n";

		return result;
	}
}
