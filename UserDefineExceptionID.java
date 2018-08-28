package my.day17;
/**** 사용자 정의 예외(오류)절 만들기 ***
1. Exception 클래스를 상속 받는다.
2. 생성자를 구성해서 예외 메시지(오류메시지)를 등록해주면 끝난다.


*/
public class UserDefineExceptionID extends Exception{


		//기본생성자
		public UserDefineExceptionID() {
			super("ID명은 최소길이가 5글자 이상이어야 합니다. ");
			
		}
		
		public UserDefineExceptionID(String errorMsg) {
			super(errorMsg);
			
		}
			
	
}
