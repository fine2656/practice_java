package my.day16;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] studentArr = new Student[3];
		
		studentArr[0] = new Student("kh001", "홍길동", 90);
		studentArr[1] = new Student("kh002", "한석규", 78);
		studentArr[2] = new Student("kh003", "두석규", 80);
		
		
		for(Student st:studentArr) {
			st.comment(st.getHakbun(), sc);
			
		}
		for(Student st:studentArr) {
			st.printInfo();
		}
		
		System.out.print(" 학번 검색 : ");
		String hakbun = sc.nextLine();
		for(int i=0;i<3;i++) {
			
			if(studentArr[i].getHakbun().equals(hakbun)) {
			
				int idd = i;
				studentArr[idd].printInfo();
				break;
			}
		}
		
		System.out.print("> 검색하실 학번을 입력하세요/");
		String searchHakbun = sc.nextLine();
		Student searchStudent =null;
		
		for(Student st : studentArr) {
			searchStudent= st.search(searchHakbun);
			if(searchStudent !=null) {
				searchStudent.printInfo();
				break;
				
			}if(searchStudent == null) System.out.println("검색 하신 학번 "+searchHakbun+"은 존재하지 않습니다.");
			
		}
		
		
	}

}
