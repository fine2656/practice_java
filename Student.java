package my.day14;

public class Student extends Common {

	private String hakbun;
	private String guardEmail;	//보호자 이메일
	private String awardsCareer;//수상경력
	/**
	 * @param hakbun
	 * @param guardEmail
	 * @param awardsCareer
	 */
	public Student () {
		//super(); 생략되어져 있음.
	}
	public Student(	String id, String passwd, String email, String name,String hakbun, String guardEmail, String awardsCareer) {
		super(	id,passwd,email,name);
		this.hakbun = hakbun;
		this.guardEmail = guardEmail;
		this.awardsCareer = awardsCareer;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getGuardEmail() {
		return guardEmail;
	}
	public void setGuardEmail(String guardEmail) {
		this.guardEmail = guardEmail;
	}
	public String getAwardsCareer() {
		return awardsCareer;
	}
	public void setAwardsCareer(String awardsCareer) {
		this.awardsCareer = awardsCareer;
	}
	//=== 매소드의 오버라이딩. 재정의
	
	@Override//애노테이션(어노테이션) : 부모클래스로부터 물려받은 것을 재정의한다 
	//접근 제한자를 줄 떄 오버라이딩 하는 쪽에서는 점점 커져야한다.
	// -> 접근 제한자가 부모같던지 부모보다 커야한다.
	
	public void showInfo() {
		System.out.println("학생 "+getName()+"님 정보 ");
		System.out.println("1. 학  번 : "+hakbun);
		System.out.println("2. 성  명 : "+getName());
		System.out.println("3. 이메일 : "+getEmail());
		System.out.println("4. 수상경력 : "+awardsCareer);
		System.out.println("");
		

	}
	@Override
	public Common login(String id, String passwd) {
		
		if(getId()!=null && getPasswd()!= null) {
			if(getId().equals(id) && getPasswd().equals(passwd)) {
				System.out.println("학생 "+getName()+"님 환영합니다. ");
				return this;	
			}
			else System.out.println("로그인 실패 !");
	 		return null;
			
		}
		else {
			System.out.println(">>회원 정보가 없습니다. 회원 가입부어 하세요!");
			return null;
		}
	
	}//end of login
}
