package my.day17;

public class ExeptionTest3 {

	public static void main(String[] args) {
	/*	try {
			for(int i=0;i<=5;i++) {
				int result= 50/(3-i);
				System.out.println("result = 50/"+(3-i)+"="+result);
			}
		} catch (ArithmeticException e) {
			System.out.println("오류가 발생하든지 안하던지 반드시 출력해야 할 내용.");
		}*/
		//finaly는 try 부분의 실행에 있어서 오류가 발생하든지 아니면 안하는지 
		//관계없이 try 구분의 실행이 끝나고나서 무조건 실행 되어지는 구분이 바로 finally 구분이다
		
		try {
			for(int i=0;i<=5;i++) {
				int result= 50/(3-i);
				System.out.println("result = 50/"+(3-i)+"="+result);
			}
		}
		finally {
			System.out.println("오류가 발생하든지 안하던지 반드시 출력해야 할 내용.");
			}
		
		
		
		
		
	}
}
