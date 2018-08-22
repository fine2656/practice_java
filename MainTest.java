package my.day13;

public class MainTest {

	public static void main(String[] args) {
		
	
		Sungjuk[] sungjukArr = new Sungjuk[3];
		
		Student st1 = new Student();
		st1.setHakbun("kh001");
		st1.setName("한석규");
		st1.setMobile("01073132470");
				
		// 성적이라는 객체 생성 
		Sungjuk sj1 = new Sungjuk();
		sj1.setStuent(st1);
		sj1.setKor(90);
		sj1.setEng(91);
		sj1.setMath(93);
		if(sj1.getStudent() != null ) sungjukArr[0] = sj1;//sungjukArr[0]에 sj1객체 저장.
		/////////////////////////////////////////////////////
		/*Student st2 = new Student();
		st2.setName("  ");
		st2.setMobile("0123456789");
		st2.setHakbun("  ");
		*/
		// 성적이라는 객체 생성 
		/*Sungjuk sj2 = new Sungjuk();
		sj2.setStuent(st2);
		sj2.setKor(90);
		sj2.setEng(80);
		sj2.setMath(80);
		
		
		if(sj2.getStudent() != null ) sungjukArr[1] = sj2;//Student 값의 Null 값이 있으면 sj2에 값을 넣지 않는다. 
*/		////////////////////////////////////////////////
	
		
		
		Student st3 = new Student();
		st1.setName("세석규");
		st1.setMobile("01073132470");
		st1.setHakbun("kh003");
		
		// 성적이라는 객체 생성 
		Sungjuk sj3 = new Sungjuk();
		sj3.setStuent(st3);
		sj3.setKor(70);
		sj3.setEng(80);
		sj3.setMath(90);
		if(sj3.getStudent() != null ) sungjukArr[1] = sj3;//sungjukArr[0]에 sj1객체 저장.
		
/*
		
		Student st4 = new Student();
		st4.setName("네석규");
		st4.setMobile("01073132470");
		st4.setHakbun("2145");
		
		// 성적이라는 객체 생성 
		Sungjuk sj4 = new Sungjuk();
		sj4.setStuent(st4);
		sj4.setKor(70);
		sj4.setEng(70);
		sj4.setMath(70);
		if(sj4.getStudent() != null ) sungjukArr[3] = sj4;//sungjukArr[0]에 sj1객체 저장.
		
	*/
		
		
		//System.out.println(sungjukArr[0].getHakjum());
		//System.out.println(sungjukArr[1].getHakjum());//NullPointerException
		System.out.println("------------------------");
		System.out.println(sungjukArr[0].getStudent().getName());
		//System.out.println(sungjukArr[1].getStudent().getName());//NullPointerException
		//System.out.println(sungjukArr[2].getStudent().getName());
		/*System.out.println(sungjukArr[3].getStudent().getName());
		*/
		System.out.println("\n 학생 성적 입력 완료!!");
		System.out.println("\n-----------------------------");
		System.out.println("학생명	국어	영어	수학	총점	평균	학점");
		System.out.println("-------------------------------");
	
		}
		
	}

