package my.day5;

import java.io.IOException;

public class SwitchCaseTest1 {

	public static void main(String[] args) throws IOException {
		
		
		
		System.out.println("글자 1개를 입력하세요.");
		int n = System.in.read();//리턴타입이 int 형
		
		//영문 대문자는 65 ~ 90
		//영문 소문자는 97 ~ 122
		
		switch (n) {
						case 65:
						case 66:
						case 67:
						case 68:
						case 69:
						case 70:
						case 71:
						case 72:
						case 73:
						case 74:
						case 75:
						case 76:
						case 77:
						case 78:
						case 79:
						case 80:
						case 81:
						case 82:
						case 83:
						case 84:
						case 85:
						case 86:
						case 87:
						case 88:
						case 89:
						case 90:
							System.out.println("입력하신 "+(char)n+"은 대문자 입니다");
							break;											
											
						case 97:				
						case 122:
							System.out.println("입력하신 "+(char)n+"은 대문자 입니다");
							
							break;
							
						case 48:
						case 49:
						case 50:
						case 51:
						case 57:
							System.out.println("입력하신 "+(char)n+"은 숫자 입니다");
							
						default:
							System.out.println("몰라");
							break;
			}
		
		
		

	}

}
