package my.day5;

import java.util.Scanner;

public class CalcuratorMain {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);// 메인 매소드 안에서 다 쓰임.
		
		try {//시도 . 오류검사.
			Calcurator cl = new Calcurator();//기본 생성자.
			
			
			System.out.print(" 첫번째 수를 입력하시오 : ");
			String str1 = sc.nextLine();
			double a =  Double.parseDouble(str1);//String 형을 입력받아서 double 형으로 변환 ,Double 형을 string 형으로 변환
			
			System.out.print(" 두번째 수를 입력하시오 : ");
			String str2 = sc.nextLine();
			double b =  Double.parseDouble(str2);//키보드에서 입력한 값을  str2에서 받아 이것을 Double.parseDouble이 더블형으로 변환한다.
				
			System.out.print(" 연산자(+,-,*,/) 입력하시오 : ");
			String op=sc.nextLine();
					
/* 
			  1-1. 연산자를 잘못 입력 하였을 경우 - Switch 문
			  switch (op) {
			case "*"://op = "*"; break;
			case "-"://op = "-"; break;
			case "+"://op = "+"; break;
			case "/"://op = "/"; break;
				break;
						
			default:// 연산자를 잘못 입력하였을 경우 프로그램 종료
				System.out.print("연산자를 잘못 입력하였습니다\n");
				sc.close();return 에서 프로그램 종료를 하기 때문에 써준다.
				return ;//=	System.exit(0) : 프로그램 종료, return 값이 없다면 종료.
*/				
				// 1-2. 연산자를 잘못 입력 하였을 경우 - if 문
			 	
			 	if(!("+".equals(op) ||"*".equals(op)||"-".equals(op)||"/".equals(op)) )
			 	//문자열 비교는 .equlas 로 하기
			 	//+,-,/,* 기가 아니라면	
			 	{	
			 		System.out.print("연산자를 잘못 입력하였습니다\n");
			 		
			 		sc.close();//return 에서 프로그램 종료를 하기 때문에 써준다.
			 		
			 		return ;//=	System.exit(0) : 프로그램 종료, return 값이 없다면 종료.
			 	}
										
			String result =cl.calc(a, b, op);//cl. 시 calc(a,b,op) 가 발생됨.
				
			// result 가 7.0이라면 7이라고 나타내고자 한다.
			// result 가 7.5라면 7.5라고 나타내고자 한다.
			
			//=> result가 소수부가 있는지 없는지 판단.
			//7.0%7 = 0 -> 7.0%(int)7.0 -> 7.0%7=0
			//7.5%7 !=0  -> 7.5%(int)7.5
			
			System.out.println("====계산 결과===");
			if(b==0 && "/".equals(op)) {
				System.out.print(result);
			}
			else {
				System.out.print("\n" + str1+ op + str2 + " = " + result);
			}
			/*if (result%(int)result ==0)
			
				System.out.print("\n" + str1+ op + str2 + " = " + (int)result);
			
			else 
				System.out.print("\n" + str1+ op + str2 + " = " + result);*/
			
			
			
		} catch (NumberFormatException e) {
			//System.out.print(">>>숫자로만 입력하세요!!!");
			//System.out.print(e.getMessage());
			//자바에서 기본적으로 제공하는 메세지.생략가능
			e.printStackTrace();
			//어디가 잘못되었는지를 잡아주는 안내를 해줌.생략 가능.
			/* <<출력>>
			   	 첫번째 수를 입력하시오 : 5
				 두번째 수를 입력하시오 : ssss
				>>>숫자로만 입력하세요!!!For input string: "ssss"java.lang.NumberFormatException: For input string: "ssss"
					at sun.misc.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2043)
					at sun.misc.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
					at java.lang.Double.parseDouble(Double.java:538)
					at my.day5.CalcuratorMain.main(CalcuratorMain.java:21)
			 */
			
		}
		
		sc.close();//try 안에서 쓰이기 때문에 try 안에서 close
	
		
	}//end of main

}
