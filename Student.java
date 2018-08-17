package my.day8;

public class Student {
	
	static int count;
	
	String hakbun;
	String passwd;
	String name;
	int kor,eng,math;
	double avg = 0;
	int total =0;
	String hakjum = "";
	
	public Student () {
		count++;//객체 생성시마다 count 값 증가.
	}// 기본 생성자
	
	public void getStudentInfo() {
		System.out.println("1. 학번 : "+hakbun);
		System.out.println("2. 비밀번호: "+passwd);
		System.out.println("3. 이름 :  "+name);
		System.out.println("4. 국어 :"+kor);
		System.out.println("5. 수학 : "+math);
		System.out.println("6. 영어 : "+eng);
		System.out.println("7. 총점 : "+total);
		System.out.println("6. 평균 : "+avg);
		System.out.println("6. 학점 : "+hakjum);
		System.out.println("");
	}
	
}
