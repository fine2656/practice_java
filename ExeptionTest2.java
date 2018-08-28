package my.day17;

public class ExeptionTest2 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			int result= 50/(3-i);

			System.out.println("result = 50/"+(3-i)+"="+result);
		}
		System.out.println("오류가 발생하든지 안하던지 반드시 출력해야 할 내용.");

	}

}
