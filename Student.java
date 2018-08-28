package my.day16;

import java.util.Scanner;

public class Student implements Inter1,Inter2,Inter3{
	
	private String hakbun;
	private String name;
	private int jumsu;
	private String hakjum;
	private String comment;
	private int point;
	
	
	public Student() {}
	
	/**
	 * @param hakbun
	 * @param name
	 * @param jumsu
	 * @param hakjum
	 * @param comment
	 */
	public Student(String hakbun, String name, int point) {
		this.hakbun = hakbun;
		this.name = name;
		setPoint(point);
	}

	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		if(point <0) {
			this.point = 0;
			
		}
		else if(point >100 ) {
			this.point = 100;
		}
		else this.point = point;
		
		switch (this.point/10) {
			case 10:
			case 9:	hakjum = "A"; break;
			case 8:	hakjum = "b"; break;
			case 7: hakjum = "C"; break;
			case 6: hakjum = "D"; break;
			default:hakjum = "F"; break;
		}
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJumsu() {
		return jumsu;
	}

	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}

	public String getHakjum() {
		return hakjum;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public Student search(String hakbun) {
		Student student = null;
		
		if(hakbun !=null && hakbun.equals(this.hakbun)) {
			student = this;//this는 자기의 객체
			//즉 student 객체
			
		}
		return student;
	}

	@Override
	public void printInfo() {
	
		System.out.println("1. 학번 : "+hakbun);
		System.out.println("2. 성명 : "+name);
		System.out.println("3. 점수 : "+point);
		System.out.println("4. 학점: "+hakjum);
		System.out.println("5. 코멘트 : ");
		System.out.println(comment);
	}

	@Override
	public void comment(String hakbun, Scanner sc) {
		Student student = search(hakbun);
		if(student != null) {//학번이 존재 한다면,
			System.out.println(" 성명 : "+student.name);
			System.out.println(" 점수 : "+student.point);
			System.out.println(" 학점 : "+student.hakjum);
			System.out.println(" 코멘트를  입력하세요 .(종료를 하려면 Enter key 입력 수 Exit를 입력하세요. ");
			
			StringBuilder sd =new StringBuilder();
			String str="";
			
			do {
				str = sc.nextLine();
				if("exit".equalsIgnoreCase(str.trim())) {
				break;					
				}
				else sd.append(str+"\n");// str의 입력된 정보를 sd 에 쌓아준다.	
			} while (true);
			student.comment = sd.toString();
		}
						
		else System.out.println(" 존재 하지 않는 학생입니다. 코멘트를 입력하실 수 없습니다.");
	}
}
