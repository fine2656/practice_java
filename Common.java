package my.day14;

public class Common {

	private String id;
	private String passwd;
	private String email;
	private String name;
	static int count;
	/**
	 * @param id
	 * @param passwd
	 * @param email
	 * @param name
	 */

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Common() { count++; }
	
	public Common(String id, String passwd, String email, String name) {
		
		this.id = id;
		this.passwd = passwd;
		this.email = email;
		this.name = name;
		count++;
	}
	
	
	public Common login(String id, String passwd) {
		//동일 패키지 내에는 protected , default 모두 사용 가능하다.
		if(this.id !=null && this.passwd != null) {
			if(this.id.equals(id) && this.passwd.equals(passwd)) {
				System.out.println(name+"님 환영합니다. ");
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
	
	
	public void showInfo() {
		System.out.println("===========================");
		System.out.println(">>> "+ getName()+"님 정보 <<<");
		System.out.println("1. 성  명 : "+getName());
		System.out.println("2. 이메일 : "+getEmail());
			

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
