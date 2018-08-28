package my.day14;


public class Main {
	//=== 메소드의 오버라이딩(재정의) ===
		// 조건이 부모클래스에 존재하는 메소드이어야 한다.
		// 또한 부모클래스에 존재하던 메소드의 내용물을 뺀 나머지(껍데기)는 똑같아야 한다.
		// 단, 접근지정자(접근제한자)은 부모클래스의 것과 동일하든지 아니면 
		// 부모클래스의 것보다는 제한범위가 더 큰쪽으로 해야한다.
		// 예를들어, 
		// - 부모클래스의 메소드 접근지정자가 public 이라면
		//   자식클래스에서 오버라이딩하는 메소드의 접근지정자는 public 만 가능하다.
		// - 부모클래스의 메소드 접근지정자가 protected 이라면
		//   자식클래스에서 오버라이딩하는 메소드의 접근지정자는 public 또는 protected 만 가능하다.
		// - 부모클래스의 메소드 접근지정자가 public 이라면
		//자식클래스에서 오버라이딩하는 메소드의 접근지정자는 protected 는 불가하다.
	
	public static void main(String[] args) {
		Common[] commonArr = new Common[10];//인스턴스 -> 메인 객체를 만들어야만 사용가능하다.
		//동일 패키지 이기 때문에 main 안에 넣을 수 있다.
		//접근 제한자가 public 이기 때문에 mina 안에 넣을 수 있다.
		
		Main main = new Main();
	
		 commonArr[0] =new Student("stu01","qwerty123.", "stu01@gmail.com","홍길동", "kh001","guard@gmail.com", "수상경력");
		 
		// commonArr[1] =new Student("stu02","qwerty123.", "stu02@gmail.com","이길동", "kh002","kh002@gmail.com", "수상경력");
			
		 commonArr[2] = new Guardian("guard01", "qwerty123.", "guard01@gmail.com", "홍길동부", "회사원", "121454787896");
				
		 for(int i=0;i<commonArr.length;i++) {
			 if(commonArr[i] instanceof Student) {//Student commonArr 만 보겟다.
				 ((Student)commonArr[i]).showInfo(); //showInfo는 Student Class의 매소드 임으로 commonArr를 Student 로 형변환 하여 Student의 매소드를 불러온다.
			 }

		 else if(commonArr[i] instanceof Guardian) {//Student commonArr 만 보겟다.
				 ((Guardian)commonArr[i]).showInfo(); //showInfo는 Student Class의 매소드 임으로 commonArr를 Student 로 형변환 하여 Student의 매소드를 불러온다.
			 }
		 }	 
		 //=== 오버 라이딩 ===
		System.out.println("============================");
		System.out.println("");
		
		for(int i =0;i<Common.count;i++) {
			if(commonArr[i] instanceof Student ) {
			commonArr[i].showInfo(); //showInfo는 Student Class의 매소드 임으로 commonArr를 Student 로 형변환 하여 Student의 매소드를 불러온다.
			}
		}
		
		System.out.println("============================");
		System.out.println("");
		
		//=== 학생으로 로그인 한다는 가정하에 한다.===
		//=== 오버라이딩 ===
		
		String studentid = "stu01";
		String password = "qwerty123.";
		
		for(int i =0;i<Common.count;i++) {
			if(commonArr[i] instanceof Student ) {
				Common common = (Student)commonArr[i].login(studentid, password);
				Student stu = (Student)common;
				stu.showInfo();
			}
		}
		System.out.println("||");
		
		for(int i =0;i<Common.count;i++) {
			if(commonArr[i] instanceof Student ) {
				Common common =commonArr[i].login(studentid, password);
				common.showInfo();
			}
		}
		
		System.out.println("");
		
		for(int i =0;i<Common.count;i++) {
			if(commonArr[i] instanceof Student ) {
				commonArr[i].login(studentid, password);
			}
		}
		
		System.out.println("");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}