package my.day4.quiz;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학번 :");
		String hakbun = sc.nextLine();
		
		System.out.print("성명 :");
		String name = sc.nextLine();
				
		System.out.print("국어 :");
		int kor = Integer.parseInt(sc.nextLine());//sc.nextLine 으로 받은 String 을 Integer.parseInt를 통해 Int 형으로 변환
			
		System.out.print("영어 :");
		int eng = Integer.parseInt(sc.nextLine());//sc.nextLine 으로 받은 String 을 Integer.parseInt를 통해 Int 형으로 변환
		System.out.print("수학 :");
		int math = Integer.parseInt(sc.nextLine());//sc.nextLine 으로 받은 String 을 Integer.parseInt를 통해 Int 형으로 변환
		
		
		Student st1 = new Student(hakbun,name,kor,eng,math);
		
		
		System.out.println(st1.showInfo());
		System.out.println(st1.showTotal());
		System.out.println(st1.showAvg());
		System.out.println(st1.showHakjum());
		/*
		   === 홍길동님의 정보 ===
		   1. 학번 : kh001
		   2. 성명 : 홍길동
		   3. 국어 : 90
		   4. 영어 : 91
		   5. 수학 : 93
		   >> 총점 : 274 
		   >> 평균 : 91.33333
		   >> 학점 
		 */

	}
		

}
