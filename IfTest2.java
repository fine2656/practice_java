/*package my.day4;

import java.io.IOException;
//import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) throws IOException {

//		Scanner sc = new Scanner(System.in);

		//System.out.print("글자 1개를 입력하세요 :");

		int n = System.in.read();

		//System.in : 키보드, System.in.read()은 키보드로부터 입력받은 글자 중 첫번째 글자 한개만 읽어들이는 것이다.
		//return 타입은 int 타입이다.
		//System.out.print(n);// abce -> 97, 1234 -> 49

		IfTest2 obj = new IfTest2();

		//obj.showInfo(n);

	public void	showInfo(int n){
		if(65<=n && n<=90) {//영문 대문자 이라면,

			System.out.print("입력하신 글자" +(char)n+" 영문 대문자 입니다. " );
		}
		else if (97<=n && n<=122) {//영문 소문자 이라면,
			System.out.print("입력하신 글자" +(char)n+" 영문 소문자 입니다. " );


		}
		else if (48<=n&& n<=57) {//숫자 이라면,
			System.out.print("입력하신 글자" +(char)n+" 숫자 입니다. " );
		}
		else//영문자 , 숫자를 제외한 나머지
			System.out.print("입력하신 글자" +(char)n+" 특수 문자 입니다. " );


	public void showInfo(int n) {
		char ch = (char)n;

		if('A'<=ch && ch<='B') //영문 대문자 이라면,

			System.out.print("입력하신 글자" +(char)ch+" 영문 대문자 입니다. " );

		else if ('a'<=ch && ch<='a') //영문 소문자 이라면,
			System.out.print("입력하신 글자" +(char)ch+" 영문 소문자 입니다. " );



		else if ('0'<=ch&& ch<='9') //숫자 이라면,
			System.out.print("입력하신 글자" +(char)ch+" 숫자 입니다. " );

		else//영문자 , 숫자를 제외한 나머지
			System.out.print("입력하신 글자" +(char)ch+" 특수 문자 입니다. " );

	}
	}

}

*/
