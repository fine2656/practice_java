package my.day7;

import java.util.Scanner;

import my.util.MyUtil;

public class gaybaybo {
	public void gameResult(String a, String b) {
		String gameResult = " ";
		if("1".equals(a) &&"3".equals(b) ||
		   "2".equals(a) &&"1".equals(b) ||
		   "3".equals(a) &&"2".equals(b))
			gameResult = "User가 이겼습니다.";
		else if	  ("1".equals(a) &&"2".equals(b) ||
				   "2".equals(a) &&"3".equals(b) ||
				   "3".equals(a) &&"1".equals(b))
			gameResult = "User가 졌습니다.";
		else 
			gameResult = "User와 PC 가 비겼습니다.";
		String userStr = "";
		String pcStr = "";
		if("1".equals(a) ) {
			userStr =" 가위";
			
		}
		else if("2".equals(a) ) {
			userStr =" 바위";
			
		}
		else if("3".equals(a) ) {
			userStr =" 보";
			
		}
		
		
		if("1".equals(b) ) {
			pcStr =" 가위";
			
		}
		else if("2".equals(b) ) {
			pcStr =" 바위";
			
		}
		else if("3".equals(b) ) {
			pcStr =" 보";
			
		}
		
			System.out.println(">> 사용자 : "+userStr+", 컴퓨터 : "+pcStr);
			System.out.println(gameResult);
	}
	public static void menu() {
		System.out.println("\n===가위, 바위, 보 게임===");
		System.out.println("1.가위\t2.바위\t3.보\t4.게임종료");
		System.out.print(">> 선택 하세요.(1,2,3,4)\t"); 
	
	}
	
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String userNo ="";
	 
	 gaybaybo obj = new gaybaybo();
	 
	
	 do {
		 	gaybaybo.menu();
		 	userNo = sc.nextLine();
		 	int num = MyUtil.random(1, 3);
			switch(userNo) {
			case "1": 
				//풀이 1
				/*System.out.println(num);
				if(num == 3) System.out.println("이겼습니다.");
				else if(num == 2) System.out.println("비겼습니다.");
				else System.out.println("졌습니다..");
				break;*/
			case "2":
				//풀이 1
				/*System.out.println(num);
				if(num == 3) System.out.println("졌습니다.");
				else if(num == 2) System.out.println("비겼습니다.");
				else System.out.println("이겼습니다.");
			break;	*/
			case "3": 
				//풀이 1
				/*System.out.println(num);
				if(num == 3) System.out.println("비습니다.");
				else if(num == 2) System.out.println("이겼습니다.");
				else System.out.println("졌습니다.");*/
				
				//풀이 2
				obj.gameResult(userNo,Integer.toString(num));//int 값을 string 으로 변환한다.
				
			case "4":
				break;
			default:
			System.out.println("메뉴 1,2,3,4  중 하나만 선택하세요.");
			break;//break 는 스위치문만 빠져나가는 것으로 해당 자리에는 continue 나 break 나 상관없음.
			// swich 에서 빠져나가도 while 문의 조건이 맞지 않아 반복 실행됨.
			}	
	} while (!"4".equals(userNo));//!조건 -> 조건이 참이라면 전체 거짓이기 때문에 while 문을 빠져나간다.
	 		System.out.print("프로그램 종료 시각 : ");
	 		MyUtil.currentTime();
	 
	 		
	 		
	 sc.close();
	}//end of main

}
