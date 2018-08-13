package my.day5;

public class StringEqualsTest {

	public static void main(String[] args) {
		
		String name1 = new String("이순신");//
		String name2 = new String("이순신");//
		
		String name3 = "강감찬";
		String name4 = "강감찬";
		
		if(name1 == name2) {
			
			System.out.println("name1과 name2는 같습니다.");
			
		}
		else {
			System.out.println("name1과 name2는 같지 않습니다.");
			
		}
		
		System.out.println("================================");
	if(name3 == name4) {
			
			System.out.println("name3과 name4는 같습니다.");
			
		}
		else {
			System.out.println("name3과 name4는 같지 않습니다.");
			
		//name1과 name2는 같지 않습니다.
		//================================
		//name3과 name4는 같습니다.
		//name 1과 name2는 주소값으로 비교하기 때문에 같지 않다고 나온다.
		//String 의 경우 '==' 이 아닌 'equals'를 사용한다.
			
			
						
		}
	System.out.println("================================");
	
	if(name1.equals(name2)) 

		//name1.equals(name2)은 String name1의 값(이순신)과 String name2의 값(이순신)을 비교해서 
		//값이 동일하면 true, 값이 동일 하지 않으면 false 를 return 시켜준다.
		System.out.println("name1과 name2는 같습니다.");
	
	else 
		System.out.println("name1과 name2는 같지 않습니다.");
	if(name3.equals(name4)) {
		
		System.out.println("name3과 name4는 같습니다.");
		
	}
	else {
		System.out.println("name3과 name4는 같지 않습니다.");
					
	}
	}
}

		
	


