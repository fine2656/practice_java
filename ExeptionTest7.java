package my.day17;

public class ExeptionTest7 {

	public static void main(String[] args) {

		
			for(int i=0;i<=5;i++) {
				
				try {
						int result= 50/(3-i);
						System.out.println("result = 50/"+(3-i)+"="+result);
/*						result = 50/3=16
								result = 50/2=25
								result = 50/1=50
								result = 50/-1=-50
								result = 50/-2=-25*/

					
				}catch (ArithmeticException e) {
					
					
				/*	System.out.println("e.getMessage(오류메세지를 알려주는것) : "+e.getMessage());
					e.printStackTrace();//어디가 오류인지 추적해서 알려주는 기능.
*/				
				}
			/*	finally {
					System.out.println("오류가 발생하든지 안하던지 반드시 출력해야 할 내용.");
					}*/
			}
	
	}

}
