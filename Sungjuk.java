package my.day13;

public class Sungjuk {

	private Student student;
	
	private int kor =-1;
	private int eng =-1;
	private int math=-1;
	
	private int total ;
	private double avg;
	private String hakjum;
	

	public Student getStudent() {
		return student;
	}
	public void setStuent(Student st) {
		if(	st !=null && 
			!st.getHakbun().isEmpty() &&
			!st.getName().isEmpty() &&
			!st.getMobile().isEmpty()) {
			this.student = st;
		}
		else {
			System.out.println("학생으로 사용불가한 사람입니다.");
		}
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(0<=kor && kor<=100) this.kor = kor;
		else System.out.println(">>성적은 음수 입력이 불가능 합니다.");
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		if(0<=eng && eng<=100) this.eng = eng;
		else System.out.println("성적은 음수 입력이 불가능 합니다.");
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(0<=math && math<=100) this.math = math;
		else System.out.println("성적은 음수 입력이 불가능 합니다.");
		
		
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	public double getAvg() {
		return ((Math.round((double)getTotal()*10)/3)/10.0);
	}
	public String getHakjum() {
		switch((int)getAvg()/10) {
		 case 10:
		 case 9 : hakjum = "A"; break;
		 case 8 : hakjum ="B"; break;
		 case 7 : hakjum = "C"; break;
		 case 6 : hakjum = "D"; break;
		 default : hakjum = "F"; break;
		}
		return hakjum;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

