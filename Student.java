package my.day13;

import my.util.MyUtil;

public class Student {

	private String hakbun="" ;
	private String name="";
	private String mobile="";
	

	public String getHakbun() {
		
		return hakbun;
	}
	public void setHakbun(String hakbun) {
	
		if(hakbun.trim().isEmpty()) System.out.println("학번에는 0이상의 숫자만 가능합니다."); 
		else this.hakbun = hakbun;

		
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		if(name.trim().isEmpty()) {
			System.out.println("이름에는 공백을 넣을 수 없습니다.");
		}
		else this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		int length = mobile.length();
	
		if(MyUtil.checkNumber(mobile) && (length ==10) || (length==11) && mobile.startsWith("010"))
			this.mobile = mobile;
		else System.out.println(">>>휴대폰번호로 사용 불가능합니다.");

	}
	

}
