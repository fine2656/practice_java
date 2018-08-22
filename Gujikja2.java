package my.day11;
import java.text.DecimalFormat;
import java.util.Calendar;
public class Gujikja2 {





	/*
		 ======== 객체지향 프로그래밍(Objected Programming ) 이란?  ========
		  ※ OOP의 4가지 특징(!!!필수 암기!!!)
		 1. --> 상속성
		 2. --> 추상화
		 3. -->	캡슐화
		 4. -->	다형성
		 
		 구인구직 어플리케이션 프로그래밍 제작시 필요한 요소(부품)이 있는지 생각해보자.
		 아주 다양하고, 많은 요소들이 필요할 것이다.
		
		 예를 들어, 구직자, 구인회사, 채용 등.
		 
		 이러한 요소(부품)들이 바로 객체인데, 이 객체를 만드는 설계도면이 클래스이다.
		 
		  위와 같이 (구인구직 어플리케이션 프로그래밍 제작시) 같이 현실 세계에 존재하는 다양한 객체들을 하나하나 추상화 시켜서 
		 클래스로 옮기는 것을 객체지향 프로그래밍(OOP)라고 한다. 
		 
		 여기서 추상화란? 
		 --> 일반적인 의미의 (abstraction)란? 어떤 물체(object)에서 주된 특징을 부각시켜 표현하고 , 나머지 부분은 과감하게 생략하는것을 말한다.
		 추상화의 반대는 아주 시시콜콜한 것(세세한 것)까지 전부 묘사하는 것을 말하는데 ,이것을 '정밀화'라고 한다.
		  
		 객체지향 프로그래밍(OOP)에서 사용되는 추상화도 이와 비슷하다.
		 어떤 하나의 물체를 대표하는 속성( 명사, 인스턴스 멤버변수)과 기능(동사, 매소드)을 추출해내는 것을 객체지향프로그래밍(OOP)에서 '추상화' 라고 한다.
		 
		 
		 >>예를 들어, 구인구직 프로그래밍 제작시 필요한 부품(요소)중 하나인 "구직자"에 대해서 알아보자.
		 	"구직자"가 가지고 있는 속성(명사, 멤버변수)과 행동 양식(동사, 매소드)을 뽑아보자.
		 	1) 속성(property, attribute,field)은 멤	버변수가 되고,
		 	2) 행동양식(기능)은 매소드가 되는 것이다.
		 	
		 	Gujikja (클래스) 
		 		|													  										  	|			
		 		|--- 속성(property, attribute,field) : 아이디, 암호, 성명, 연락처, 주소, 이메일, 학력, 희망 구직 직종 , 희망 연봉 ---	|
		 		|--- 행동 양식(동사, 매소드) : 구직자정보조회 기능, 구직자정보변경 기능, 구직자로 접속(로그인) 기능...						|
		 		=> 추상화
		 */

		
		static int count ;
	
		//Gujikja 클래스의 속성정하기(추상화 작업)
		String userid;
		String passwd;
		String name;
		String birthday;//생년월을 ex)199300820
		int	   gender;//성별 "남"--1, "여"--2 유추할 수 있는 데이터 값을 반드시 코드화 해라.
		String addr;
		int school;//대졸이상--1, 초대졸--2, 고졸--3,고졸미만--4
		String mobile;//휴대폰 번호.
		String hopejob;//희망 직종.("사무직","생산직","일용직"...)
		int hopemoney;//희망 급여
		//유효성검사 -> 올바른 정보가 들어갔는지 확인.
		public Gujikja2() {count ++;};
		
		public Gujikja2(String userid, String passwd, String name, String birthday, int gender, String addr, int school,
						String mobile, String hopejob, int hopemoney) {
			
			this.userid = userid;
			this.passwd = passwd;
			this.name = name;
			this.birthday = birthday;
			this.gender = gender;
			this.addr = addr;
			this.school = school;
			this.mobile = mobile;
			this.hopejob = hopejob;
			this.hopemoney = hopemoney;
			
			
			
		}

		
		/*//1) 구직자가 로그인 할수 있는 기능.
		public boolean login(String userid, String passwd) {//static 은 this. 사용불가.
			
			if(userid.equals(this.userid)&&passwd.equals(this.passwd)) return true;
			else return false;
			
		}*/
		//2)
		public Gujikja2 login2(String userid, String passwd) {//Gujikja[] gujikjaArr = new Gujikja로 선언된 구직자 배열에서 해당 매소드를 돌린다.Gujikja 클래스의 배열객체에서 로그인 검사.
			if(this.userid.equals(userid)&&this.passwd.equals(passwd)) {//입력받은 지역변수 userid와 passwd와 객체의 멤버변수userid와 passwd를 비교해라.
				return this;
			}
			else return null;
			
				
		}
		
		//구직자의 현재 나이 조회 기능
		public int getAge() { 
			
			Calendar currentdate = Calendar.getInstance();
			int currentYear = currentdate.get(Calendar.YEAR);
			int birthYear = Integer.parseInt(birthday.substring(0,4))+1;
			return currentYear-birthYear+1;
		}
		//성별을 알아보는 기능
		public String getGender() {
			
			String result = "";
			
			switch (gender) {
			case 1: result = "남자";
			 break;
			case 2: result = "여자";
			 break;
			}
				
			return result;
						
						
						
		}
		public String getSchool() {
		String result ="";
		switch (school) {
		case 1 : result = "대졸이상"; break;
		case 2 : result = "초대졸"; break;
		case 3 : result = "고졸"; break;
		case 4 : result = "고졸미만"; break;
			
		}
			return result;
		}
		//희망 급여알아 보는 기능
		public String getHopemoney() {
			DecimalFormat df = new DecimalFormat("#,###");
			return df.format(hopemoney) + "만원";
			
		}
		//휴대폰에 -붙여 보여주는 기능
		public String getMobile() {
			String result ="";
			if(mobile.length()==10)//모바일의 길이가 10이라면
			result = mobile.substring(0, 3)+"-"+mobile.substring(3,6)+"-"+mobile.substring(6);
			else
			result = mobile.substring(0, 3)+"-"+mobile.substring(3,7)+"-"+mobile.substring(7);
			
			return result;
			
		}	

		//구직자의 정보 조회 기능
		public String getGujikjaInfo() {
			String info = "=== "+name+"님 프로필\n " + 
						 "1. 아이디    : "+userid+"\n"+
						 "2. 암   호    : "+passwd+"\n"+
						 "3. 성   명    : "+name+"\n"+
						 "4. 현재나이 : "+getAge()+"\n"+
						 "5. 성  별     : "+getGender()+"\n"+
						 "6. 주   소    : "+addr+"\n"+
						 "7. 학   력    : "+getSchool()+"\n"+
						 "8. 연락처    : "+getMobile()+"\n"+
						 "9. 희망직종 : "+hopejob+"\n"+
						 "10.희망급여 : "+getHopemoney()+"\n";
						 
			return info;
		}
}

