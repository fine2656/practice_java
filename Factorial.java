//==== 입사문제====
package my.day6;

import java.util.Scanner;

public class Factorial {
	
	public static int calc1(int num) {//static 매소드.
		
		System.out.println(num+"!");
		int gob=1;
		for(int i=num;i>0;i--) {
		
			gob *=i;
			
		}
		return gob;
		
	}
	
	public static int calc2(int num) {// !!재귀 호출!! -> 매소드 안의 자기 매소드가 또 있는 것.
		if(num==1)
			return 1;
		else 
			return num*calc2(--num);
			//5*calc(4)
			//=5*4*calc(3)
			//=5*4*3*calc(2)
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문제 1
		
		//>> 알고 싶은 팩토리얼 수를 입력 :5 
		//5!
		//정답  5! = 120 (5 * 4 *3 *2 *1)
		//계속 할래요?(예 Y, 아니오 N)
		
		//-----------------------------------
		//풀이 1번
		
		for(;;) {// 무한루프
			
				System.out.println(">> 알고 싶은 팩토리얼 수를 입력 : ");
				try {
					int num = Integer.parseInt(sc.nextLine());
					if(num < 1) {
						System.out.println(">> 입력하는 값은 1이상의 정수 이여야 합니다. ");
						continue;
					}
					calc1(num);//static 매소드
					System.out.println("정답 "+num+"! = "+Factorial.calc1(num));
					//Factorial.calc1
				
				} catch (NumberFormatException e) {
					System.out.println("정수만 입력하세요. ");
					continue;//continue 하지 않으면 하단의 '계속 할래요' 출력이 되어진다.
					//continue 를 넣음으로 써 정수만 입력하세요 출력 후 다시 위로 올라가서 실행한다.
				}
			
				System.out.print("계속 할래요? (예:Y , 아니오:N)");
				String yn = sc.nextLine();
				if("N".equals(yn)||"n".equals(yn)) {
				System.out.println("프로그램 종료");
				break;// 입력 값이 n, N 이면 for 문을 나온다.
				}		 
		}
		//--------------------------------------------
		//풀이 2번

		for(;;) {// 무한루프
			
				System.out.println(">> 알고 싶은 팩토리얼 수를 입력 : ");
				try {
					int num = Integer.parseInt(sc.nextLine());
					if(num < 1) {
						System.out.println(">> 입력하는 값은 1이상의 정수 이여야 합니다. ");
						continue;}
					//Factorial.calc2(num);
					System.out.println(">> 정답 : "+num+"! = "+Factorial.calc2(num));
					
					System.out.println("정답 "+num+"! = "+Factorial.calc1(num));
				} catch (NumberFormatException e) {
					System.out.println("정수만 입력하세요. ");
					continue;//continue 하지 않으면 하단의 '계속 할래요' 출력이 되어진다.
					//continue 를 넣음으로 써 정수만 입력하세요 출력 후 다시 위로 올라가서 실행한다.
				}
			
				System.out.println(" 계속 할래요? (예:Y , 아니오:N)");
				String yn = sc.nextLine();
				if("N".equals(yn)||"n".equals(yn)) {
				System.out.println("프로그램 종료");
				break;// 입력 값이 n, N 이면 for 문을 나온다.
				}		 
		}
		//--------------------------------------------
		sc.close();
		
	}

}
