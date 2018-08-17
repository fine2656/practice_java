package my.day8;

import java.util.Scanner;

import my.util.MyUtil;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] stdArr = new Student[3];//객체 배열 생성
		
	do {		
	
		
		if(stdArr.length>Student.count) {
		System.out.println(">> 학생 정보를 입력하세요.");
		System.out.print("1. 학  번");
		String hakbun = sc.nextLine();
		System.out.print("2. 비밀번호");
		String passwd = sc.nextLine();
		System.out.print("3. 이  름");
		String name = sc.nextLine();
		System.out.print(" 국어");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print(" 수학  ");
		int math = Integer.parseInt(sc.nextLine());
		System.out.print(" 영어  ");
		int eng = Integer.parseInt(sc.nextLine());
		
		double avg = 0;
		int total =0;
		String hakjum = "";
		
		total = kor+math+eng;
		avg = Math.round((double)total*10/7)/10.0;
	
		
		switch ((int)avg/10) {
			case 10:
			case 9: hakjum= "A 학점";
			case 8: hakjum= "B 학점";
			case 7: hakjum= "C 학점";
			case 6: hakjum= "D 학점";
			default : hakjum= "F 학점";
			 break;
		 }
		
		if(MyUtil.checkPassword(passwd)) {//입력 받은 pw가 조건에 만족 한다면,
			Student student = new Student();//객체 생성.
			
			student.hakbun = hakbun;
			student.passwd = passwd;
			student.name   = name  ;
			student.kor    = kor   ;
			student.math   = math  ;
			student.eng    = eng   ;
			student.avg = avg;
			student.total = total;
			student.hakjum = hakjum;
			System.out.println("[ 학생 수 "+student.count+" 명 / 정원 "+ stdArr.length+" 명]");
			stdArr[student.count-1] = student;
			
		}
		
		else {
			System.out.println(">> 학생 생성 실패!!");
			System.out.println("");
		}		
		}
		else {
			
			System.out.println(">> 정원 초과. 학생정보 입력 불가!");
			System.out.println("");
			break; 
			}
		
	} while (true);
	
	System.out.println(">>1.입력한 학생 정보 보기<<");

	for(int i=0;i<stdArr.length;i++) {
	
	stdArr[i].getStudentInfo();//학생 객체
	}
	System.out.println(">>2.입력한 학생 정보 보기<<");
	//=========================
	//개선되어진 for 문
	for(Student st :stdArr) {//stdArr의 정보를 가져와 st에 배열의 수만큼 반복하여 저장한다.
		st.getStudentInfo();
	}
		
	
		sc.close();
		
	}//end of main

}
