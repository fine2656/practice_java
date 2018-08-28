package my.day17;

public class ExeptionTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 종료");
		
		
		try {
			for(int i=0;i<=5;i++) {
				int result= 50/(6-i);
				System.out.println("result = 50/"+(3-i)+"="+result);
				//return; : finally 절 후에 종료 한다.
				/*출력 :	
				 * 		result = 50/3=8
						오류가 발생하든지 안하던지 반드시 출력해야 할 내용.

				 */
				//System.exit(0);
				//System.exit(0) : finally절 수행없이 바로 종료한다.
				//출력 : result = 50/3=8
				//관습상 '0'은 정상종료라 보고 '0'이 아닌 정수가 입력되어도 상관없다. 0이 아닌 정수는 비정상 종료로 본다.
				//-> 형태가 정상종료인지 비정상 종료인지 구분하기 좋게 하기위해서 0과 0이 아닌 값으로 구분을 하는것이지, 실행되어 지는 것은 같다.
				

			}	
			
		}
		finally {
			System.out.println("오류가 발생하든지 안하던지 반드시 출력해야 할 내용.");
			}
	
		
		try {
			for(int i=0;i<=5;i++) {
				int result= 50/(3-i);
				System.out.println("result = 50/"+(3-i)+"="+result);
				
			}
		} catch (ArithmeticException e) {
			System.out.println(" 분모가 0이면 출력할 수 없습니다.");
		
		}
	
		
	}

}
