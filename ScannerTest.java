package my.day4;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// System.in ==> 키보드
		
		System.out.println("정수를 입력하세요 => "); // 98엔터 
		int n = sc.nextInt();  // 98, int 형으로 입력된 값을 넣는다
		System.out.println("입력한 정수 : " + n);
		
		System.out.println("문자열 단어를 입력하세요 => "); // 서울시 종로구엔터 
	 	String word = sc.next(); // 서울시, String 값을 받아 word 에 넣는다.
	 	System.out.println("입력한 단어 : " + word);
	 
	 	System.out.println("\n================\n");
	 	System.out.println("문자열을 입력하세요 => ");
		String str = sc.nextLine();  // 종로구엔터
		System.out.println("입력한 문자열 : " + str);
		
		sc.close();  // 스캐너 종료
	}

}
