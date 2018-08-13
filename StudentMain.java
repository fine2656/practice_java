package my.day5;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//키보드에서 받아온 글을 sc 에 저장
		
		System.out.print("학번 :");
		String hakbun = sc.nextLine();// 키보드 에서 받아온 글을(sc.nextLine) 학번에 저장한다.
		
		System.out.print("성명 :");
		String name = sc.nextLine();
				
		System.out.print("국어 :");
		int kor = Integer.parseInt(sc.nextLine());//sc.next라인에 저장된 String 을 Int 형으로 변환 한 값이 kor 이다 
			
		System.out.print("영어 :");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 :");
		int math = Integer.parseInt(sc.nextLine());
		
		
		Student st1 = new Student(hakbun,name,kor,eng,math);
		
		
		System.out.println(st1.showInfo());
		System.out.println(st1.showTotal());
		System.out.println(st1.showAvg());
		System.out.println(st1.showHakjum());
		System.out.println(st1.showHakjum2());
		System.out.println(st1.getGift());
		/*
		   학번 :555
	성명 :chl
	국어 :90
	영어 :80
	수학 :70
	=== chl님의 정보 ===
	1. 학번 : 555
	2. 성명 : chl
	3. 국어 : 90
	4. 영어 : 80
	5. 수학 : 70
	>> 총점 : 240
	>> 평균 : 80
	B
	B
	--학점 A--
	>>놀이공원 이용권, 뷔페 식사권, 치킨, 아이스크림
	--학점B--
	>>뷔페 식사권, 치킨, 아이스크림
	--학점C--
	>> 치킨, 아이스크림
	--학점D--
	>>아이스크림
	--학점F--
	학점 F 꿀밤3
		 */

	}
		

}
