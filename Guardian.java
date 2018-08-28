package my.day14;

public class Guardian extends Common{

	private String jobType;		//직업군
	private String officeTel;	//사무실 전화번호
	/**
	 * @param jobType
	 * @param officeTel
	 */
	public Guardian() {
		//super();가 생략 되어져 있음
	}
	public Guardian(String id,String passwd,String email,String name,String jobType, String officeTel) {
		super(id,passwd,email,name);
		this.jobType = jobType;
		this.officeTel = officeTel;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getOfficeTel() {
		return officeTel;
	}
	public void setOfficeTel(String officeTel) {
		this.officeTel = officeTel;
	}
	
	//=== 매소드의 오버라이딩. 재정의
	
	@Override//애노테이션(어노테이션) : 부모클래스로부터 물려받은 것을 재정의한다
	public void showInfo() {
		System.out.println("학무보 "+getName()+"님 정보 ");
		System.out.println("1. 성  명 : "+getName());
		System.out.println("2. 근무지 연락처 : "+officeTel);
		System.out.println("3. 이메일 : "+getEmail());
		System.out.println("4. 직업군 : "+jobType);
		System.out.println("");

	}
}
