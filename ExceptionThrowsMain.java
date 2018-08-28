package my.day17;

public class ExceptionThrowsMain {

	
	public static void main(String[] args) {
	
		ExceptionThrows obj = new ExceptionThrows();
	
				
		try {
			obj.setName("홍길동");
			obj.setPoint("50");
			//throws NumberFormatException 유발 시킬 수 있다.(설명)
			//setPoint를 받아오는 곳에서 예외처리를 해준다.
			System.out.println("성명 : "+obj.getName());
			System.out.println("점수 : "+obj.getPoint());
			System.out.println("학점 : "+obj.getHakjum());
			
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요.");
			
		}
		
		
		
	}

}
