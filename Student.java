package my.day5;

public class Student {

	String hakbun;
	String name;
	byte kor;
	byte eng;
	byte math;
	String hakjum;

	
	public Student() { }
	//===================================================================
	public Student(String hakbun, String name, int kor, int eng, int math) { 
		this.hakbun = hakbun;
		this.name = name;
		this.kor = (byte)kor;
		this.eng = (byte)eng;
		this.math = (byte)math;
	
	}
	//=====================================================================
	public String showInfo() {
		String info = "=== "+name+"님의 정보 ===\n1. 학번 : "+hakbun+"\n2. 성명 : "+name+"\n3. 국어 : "+kor+"\n4. 영어 : "+eng+"\n5. 수학 : "+math+"";         
		return info;
	}
	//=====================================================================
	public String showTotal() {
		String result = ">> 총점 : " + (kor+eng+math);
		return result;
	}
	//======================================================================
	public String showAvg() {
		String result = (">> 평균 : " + Math.round((((double)(kor+eng+math)/3)*10)/10.0));
		return result;
	}
	//=======================================================================
	public String showHakjum2() {
		
		String hakjum2 ="";
		double avg = (Math.round((((double)(kor+eng+math)/3)*10)/10.0));
		
		//avg가 90이상이라면 90
		//avg가 90미만 80이상이라면 80
		//avg가 80미만 70이상이라면 70
		//avg가 70미만 60이상이라면 60
		
		//switch ((int)avg)->라면 avg 위 뒤엣값을 절삭한다. 예) 92.6->92
		//switch ((int)avg)-> 92.6/10, 96.5/10 => 몫이 9라고 나온다.
		
		switch ((int)(avg/10)) {
		//key 값은 정수형(byte, short,int) 또는 문자열(char)만 사용가능하다.
		//JDK 1.7 이후 버전부터 key값은 문자열 사용이 가능하다.
		case 10:
			 hakjum2 = "A";
			
			break;
		
		case 9: 
			hakjum2 = "A";
			break;
		case 8:
			hakjum2 = "B";
			break;
		case 7:
			 hakjum2 = "C";
			break;
		case 6:
			hakjum2 = "D";
			
			break;
		default:
			 hakjum2 = "F";
			break;
		}
		
		return "학점 : "+ hakjum2;
		
	}
	//================================================================
	public String showHakjum() {
		
		double avg = (Math.round((((double)(kor+eng+math)/3)*10)/10.0));
		
		
		
		if(avg >= 90 ) {
			//hakjum= "A";
			//System.out.println("A"); 
			 hakjum = "A";
		}
		else if(avg >= 80 ) {
			//hakjum= "B";
			//System.out.println("B"); 
			 hakjum = "B";
		
		}
		else if(avg >= 70 ) {
			//hakjum= "C";
			//System.out.println("C");
			 hakjum = "C";
		
		}
		else if(avg >= 60 ) {
			//hakjum= "D";
			//System.out.println("D");
			 hakjum = "D";
		}
		else  {
			//hakjum= "학점 : F";
			//System.out.println("F");
		 hakjum = "F";
		
		}
		return"학점 : "+ hakjum;//에러d
		
		
	}
	//======================================================
	public String getHakjum() {
		
		double avg = (Math.round((((double)(kor+eng+math)/3)*10)/10.0));
	String hakjum3="";
		switch ((int)avg/10) {//double 형인 avg로 int 형으로 바꿔줌으로써 소수점 뒷자리는 절삭된다.
		case 10:
		case 9:
			hakjum3="A";
			break;
		case 8:
			 hakjum3="B";
			break;
		case 7:
			 hakjum3="C";
			break;
		case 6:
			 hakjum3="D";
			break;
		default:
			 hakjum3="F";
			break;
			
			
			
		}
		return hakjum3;
	}
	//=================================================================
 public String getGift() {
	 
	 double avg = (Math.round((((double)(kor+eng+math)/3)*10)/10.0));
	
	 String gift="";
	 
				switch (getHakjum()) {
				case "A":
					gift +="놀이공원이용권, ";
				case "B":
					gift +="뷔페식사권, ";
				case "C":
					gift +="치킨, ";
				case "D":
					gift +="아이스크림 ";	
					break;
			
			
				default:
					gift = "꿀밤 3대";
					break;
					
				}
				return ">> "+gift;
					
	}
	 /*
	  
	  String hakgift = "";
	  
	 switch ((int)(avg/10)) {
	 
	case 10:
	case 9:
		hakgift = "	--학점 A--\n>>놀이공원 이용권, 뷔페 식사권, 치킨, 아이스크림\n" ;
			break;

	case 8:
		hakgift = "	--학점B--\n뷔페 식사권, 치킨, 아이스크림" ;
			break;
	default:
	case 7:
		hakgift = "	--학점C--\n>> 치킨, 아이스크림" ;
			break;
	case 6:
		hakgift = "	--학점D--\n>>아이스크림" ;
			break;
	
	case 5:
		hakgift = "	--학점D--\n>>아이스크림" ;
			break;
	
	//default:
	//hakgift ="꿀밤";
		//break;
	}
	 return hakgift;
	 
	 
 }
	*/
	
	
	
}
