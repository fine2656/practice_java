package my.day17;

public class MemberMain {

	public static void main(String[] args) {
		Member mem1 = new Member();
		
		
		try {
			mem1.setId("admin22");
			mem1.setName("홍길동");
			mem1.setPasswd("abcd5555+");
		} catch (UserDefineExceptionID e) {//id exception
			
			//e.printStackTrace();//-> 어디서 오류가 났는지 확인 할 수 있음
			System.out.println(e.getMessage());//-> 오류 메시지만 보고 싶을 때
			/*
			 id : abc 일때 , 출력 :  my.day17.UserDefineExceptionID: ID명은 최소길이가 5글자 이상이어야 합니다. 
			 -> 내가 만든 Exception에 걸린다.
			 id: admin 일때, 출력 : ID: 아이디명은 admin/superman으로 사용하실 수 없습니다.
			 
			 */
		}
		 catch (UserDefineExceptionPassword e) {//passwd exception
			e.printStackTrace();
		}
	
				Member mem2 = null;
		
			try {
				mem2 = new Member("super", "aaaa5555", "홍길동");
			} catch (UserDefineExceptionID | UserDefineExceptionPassword e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	
		
		
		
		
		
	}
}
