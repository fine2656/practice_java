package my.day13;

public class MainTest2 {
	

	public static void main(String[] args) {
		Sungjuk[] sungjukArr = new Sungjuk[4];
		//Student class의 객체 생성 -> Name, Hakbun, Mobile 이 Private 이므로 set,get 활용하여 쓴다
		Student st1 = new Student();
		st1.setHakbun("kh001");
		st1.setName("한석규");
		st1.setMobile("01073132470");
		
		Sungjuk sj1 = new Sungjuk();
		sj1.setStuent(st1);
		sj1.setEng(90);
		sj1.setKor(80);
		sj1.setMath(85);
		
		if(sj1.getStudent() !=null) sungjukArr[0]=sj1;//sungjukArr[0]에 sj1객체 저장.
		
		Student st2 = new Student();
		st2.setHakbun("kh002");
		st2.setName("두석규");
		st2.setMobile("01073132222");
		
		Sungjuk sj2 = new Sungjuk();
		sj2.setStuent(st2);
		sj2.setEng(95);
		sj2.setKor(85);
		sj2.setMath(90);
		
		if(sj2.getStudent() !=null) sungjukArr[1]=sj2;
		
		Student st3 = new Student();
		st3.setHakbun("kh003");
		st3.setName("세석규");
		st3.setMobile("01073133333");
		
		Sungjuk sj3 = new Sungjuk();
		sj3.setStuent(st3);
		sj3.setEng(55);
		sj3.setKor(85);
		sj3.setMath(95);
		if(sj3.getStudent() !=null) sungjukArr[2]=sj3;
		
		/*
		 Student st2 = new Student();
		st2.setName("  ");
		st2.setMobile("0123456789");
		st2.setHakbun("  ");
		
		 성적이라는 객체 생성 
		Sungjuk sj2 = new Sungjuk();
		sj2.setStuent(st2);
		sj2.setKor(90);
		sj2.setEng(80);
		sj2.setMath(80);
		if(sj3.getStudent() !=null) sungjukArr[2]=sj3;
		만약 Student 객체의 null 값이 주어지면 sj2 객체에 저장 될 어 질 수 있으므로 
		Studetn 객체를 따로 검사해주어야 한다.
		*/
		System.out.println(sungjukArr[0].getStudent().getName());
		System.out.println(sungjukArr[1].getStudent().getName());
		System.out.println(sungjukArr[2].getStudent().getName());
		
		System.out.println("\n 학생 성적 입력 완료!!");
		System.out.println("\n-----------------------------");
		System.out.println("학생명	국어	영어	수학	총점	평균	학점");
		System.out.println("-------------------------------");
		
		
	}

}
