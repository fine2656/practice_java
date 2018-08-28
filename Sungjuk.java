package my.day14;

public class Sungjuk {
	
	private String hakbun;
	private String yearQuarter;
	private int kor;
	private int eng;
	private int math;
	private int science;
	private int society;
	
	public Sungjuk() {}

	/**
	 * @param hakbun
	 * @param yearQuarter
	 * @param kor
	 * @param eng
	 * @param math
	 * @param science
	 * @param society
	 */
	public Sungjuk(String hakbun, String yearQuarter, int kor, int eng, int math, int science, int society) {
		super();
		this.hakbun = hakbun;
		this.yearQuarter = yearQuarter;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.science = science;
		this.society = society;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getYearQuarter() {
		return yearQuarter;
	}

	public void setYearQuarter(String yearQuarter) {
		this.yearQuarter = yearQuarter;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getSociety() {
		return society;
	}

	public void setSociety(int society) {
		this.society = society;
	}
	
	// === 매소드의 오버로딩(OverLoading) ===
	//=> 매소드 명은 같아도 되나, 파라미터의 타입과 갯수는 달라야 한다.
	
	public void setJumsu(int kor, int eng, int math) {
	
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		
	}
	public void setJunsu(int kor, int eng, int maht, int society,int sience ) {//매소드 명이 같아도 파라미터의 갯수가 다르면 다른 매소드로 인식함.
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.society=society;
		this.science=science;
		
		
		
	}
	public void setJunsu(int kor, int eng, int maht, int society, String comment) {//매소드 명과 파라미터의 갯수가 같아도 위치와 타입이 다르면  다른 매소드로 인식함.
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
