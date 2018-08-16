package my.day7;

import java.util.Scanner;

import my.util.MyUtil;

public class NumberBingo {
	static int count=0;//모든 객체에서 사용가능.
	
	public void bingo(int random,int userNum) {
		String str = "";
		
		
		if(random<userNum){
			str = userNum +" 보다 작습니다";
			System.out.println(str);
			count ++;
		}
		
		else if(random>userNum){
			str = userNum +" 보다 큽니다";
			
			System.out.println(str);
			count ++;
		}
		else if(random == userNum) {
			str = (userNum +"빙고~~ "+ ++count+" 번 만에 맞추었습니다.");
			System.out.println(str);
		}
		
	
	}
	
	
	public static void main(String[] args) {
		//컴퓨터가 1부터 100사이의 랜덤한 숫자를 가지도록 한다.
		int random = MyUtil.random2(1, 100);
		int userNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		 NumberBingo  obj = new  NumberBingo();//기본 생성자.
		System.out.println("1부터 100까지 숫자 맞추기 !");
		outer:
		do {
				System.out.print("1부터 100 사이의 정수를 입력하세요 : ");
				try {				
					userNum = Integer.parseInt(sc.nextLine());
					if(userNum>100 || userNum<1) {
						System.out.println("1부터 100까지만 입력 하세요.");
						continue;
					}
					//숫자를 맞추는 매소드 호출.
					obj.bingo(random,userNum);// 인스턴스 매소드는 객체가 필요하다.-> 객체.매소드명();	
				
					if(random == userNum) {//if2
						System.out.println("게임을 더 하시겠습니까? (예 : Y, 아니오 :N)");
						
						 String str2 = sc.nextLine();
						 if("N".equals(str2) || "n".equals(str2)) {
								System.out.print("프로그램 종료.");
								break outer;
						}
						else if("Y".equals(str2) || "y".equals(str2)) {
								obj.count=0;//초기화
								random = MyUtil.random2(1, 100);//초기화
								break;
						}
						else {//else 3
							other2 :
							while(true) {
									System.out.println("입력 값은 'Y' 또는 'N' 만 입력하세요 .");
									System.out.println("게임을 더 하시겠습니까? (예 : Y, 아니오 :N)");
									 str2 = sc.nextLine();
									 if("Y".equals(str2) || "y".equals(str2)||"N".equals(str2) || "n".equals(str2))
									 {
										 break other2;
									 }
							 }
							if("N".equals(str2) || "n".equals(str2)) {
									System.out.print("프로그램 종료.");
									return ;
							}
							else if("Y".equals(str2) || "y".equals(str2)) {
									obj.count=0;//초기화
									random = MyUtil.random2(1, 100);//초기화
									continue;
							}
						}//---end of else3---
							
						}//if ---2
					}/*---end of try---*/catch (NumberFormatException e) {
					System.out.println("1부터 100까지의 정수만 입력하세요!!");
					//continue; continue 를 안 적더라도 하단의 다른 조건이 없으므로 try 문을 벗어나게 되어 무한루프로 인해 다시 반복된다.
					}//---end of catch---				
		} /*--end if do1---*/while (true);// 무한 루프

}//---end of main---
}//---end of class---

