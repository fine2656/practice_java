package my.day17;

import my.util.MyUtil;

public class Member {
	private String id;
	private String passwd;
	private String name;
	/**
	 * @param id
	 * @param passwd
	 * @param name
	 */
	
	public Member() {}
	public Member(String id, String passwd, String name) throws UserDefineExceptionID, UserDefineExceptionPassword {
		setId(id);
		setPasswd(passwd);
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id)throws UserDefineExceptionID {// 이 매소드는 UserDefineExceptionID 오류가 발생 할 수 있다.
		if(id ==null ||id.length()<5) {
		throw new UserDefineExceptionID	();// 생성자를 만든다.-> super("ID명은 최소길이가 5글자 이상이어야 합니다. "); 이 나온다.
		}
		else if("admin".equals(id) || "superman".equals(id)) {
			throw new UserDefineExceptionID	("아이디명은 admin/superman으로 사용하실 수 없습니다.");// super(errorMsg);
		}
		else this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) throws UserDefineExceptionPassword{
		if(MyUtil.checkPassword(passwd)) this.passwd = passwd;
		else throw new UserDefineExceptionPassword();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
