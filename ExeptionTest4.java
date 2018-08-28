package my.day17;

public class ExeptionTest4 {

	public static void main(String[] args) {

		try {
			for(int i=0;i<=5;i++) {
				int result= 50/(6-i);
				System.out.println("result = 50/"+(3-i)+"="+result);
			}
		}
		finally {
			System.out.println("오류가 발생하든지 안하던지 반드시 출력해야 할 내용.");
			}
/*		result = 50/3=8
				result = 50/2=10
				result = 50/1=12
				result = 50/0=16
				result = 50/-1=25
				result = 50/-2=50
				오류가 발생하든지 안하던지 반드시 출력해야 할 내용.
		*/
		
		
		try {
			for(int i=0;i<=5;i++) {
				int result= 50/(3-i);
				System.out.println("result = 50/"+(3-i)+"="+result);
			}
		} catch (ArithmeticException e) {
			System.out.println(" 분모가 0이면 출력할 수 없습니다.");
		}
		
		
		
	}//end of main

}
