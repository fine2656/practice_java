package my.day11;

import java.util.Scanner;

import my.util.MyUtil;

public class JobMain2 {

	Gujikja[] gujikjaArr = new Gujikja[10];// 새로 저장된 구직자 정보를 Gujikja 의 gujikjaArr 배열 객체에 저장
	

	// 1. 초기 메뉴보여주는 기능
	public static void startMenu() {
		System.out.println("====== 초기 Menu ======");
		System.out.println("1. 구직자 등록");
		System.out.println("2. 구인회사 등록");
		System.out.println("3. 로그인(구직자)");
		System.out.println("4. 로그인(구인회사)");
		System.out.println("5. 로그인(관리자)");
		System.out.println("6. 종료 ");
		System.out.println("=====================");
		System.out.print(" >>> 메뉴 번호 선택 :");

	}// end of menu

	// 4-1.구직자로 로그인 했을시 보여지는 메뉴 매소드
	public static void gujikjaMenu() {
		System.out.println("====== 구직자 Menu ======");
		System.out.println("1. 나의 정보 조회");
		System.out.println("2. 나의 정보 변경");
		System.out.println("3. 모든 재용공고 조회");
		System.out.println("4. 구인회사 ID 검색");
		System.out.println("5. 특정 업종 채용공고 조회");
		System.out.println("6. 로그아웃 ");
		System.out.println("7. 회원탈퇴 ");
		System.out.println("======================");
		System.out.print(" >>> 메뉴 번호 선택 :");

	}// end of menu
		// 관리자로 로그인 했을시 보여주는 메소드

	public static void adminMenu() {
		System.out.println("====== 관리자 Menu ======");
		System.out.println("1. 모든 구직자 정보 출력");
		System.out.println("2. 모든 구직회사 정보 출력");
		System.out.println("3. 특정 구직자 삭제");
		System.out.println("4. 특정 구인회사 삭제");
		System.out.println("5. 로그아웃 ");
		System.out.println("======================");
		System.out.print(" >>> 메뉴 번호 선택 :");

	}// end of menu

	// 1. 초기 Menu 구직자 등록(생성) 기능
	public void registerGujikja(Scanner sc) {

		String userid = "";
		String passwd = "";
		String name = "";
		String birthday = "";// 생년월을 ex)199300820
		int gender = 0;// 성별 "남"--1, "여"--2 유추할 수 있는 데이터 값을 반드시 코드화 해라.
		String addr = "";
		int school = 0;// 대졸이상--1, 초대졸--2, 고졸--3,고졸미만--4
		String mobile = "";// 휴대폰 번호.
		String hopejob = "";// 희망 직종.("사무직","생산직","일용직"...)
		int hopemoney = 0;

		boolean useridBool = false;// birthdayBool이 참인경우는 userid가 공백일 때
		boolean nameBool = false;
		boolean pwBool = false;
		boolean birthdayBool = false;
		boolean mobileBool = false;
		boolean hopemoneyBool = false;

		// 1. 아이디값 입력받기
		/*
		 * System.out.print("▷아이디 : "); userid = sc.nextLine(); //반드시 글자만 들어와야함.
		 * 
		 * 
		 * do { useridBool = userid.trim().isEmpty(); if(useridBool ==true) {//-> 이게 참이면
		 * "" && "    ": 아이디로 쓸 수 없음
		 * System.out.println(">>>아이디는 공백만으로 사용불가합니다.. 다시입력해주세요."); } else { for(int
		 * i=0;i<Gujikja.count-1;i++) { if(!gujikjaArr[i].userid.equals(userid)) {
		 * useridBool = false; break; }
		 * 
		 * } useridBool = false; break;//end of else } } while (!useridBool);
		 */

		do {
			// 1. 아이디값 입력받기
			System.out.print("▷아이디 => ");
			userid = sc.nextLine();
			useridBool = userid.trim().isEmpty();// boolUserid 이 참인경우는 userid 가 "" or " " 이다.
			if (useridBool) // "" or " "
				System.out.println(">>> 아이디는 공백만으로 사용불가합니다. 다시입력하세요!!");
			else {// userid가 공백이 아닌 값을 넣을 경우
				int flag = 0;
				for (int i=0; i<Gujikja.count; i++) {// 최초 가입시 Gujikja.count =0;
					if (gujikjaArr[i].userid.equals(userid)) {
						System.out.println(">>>이미 사용중인 ID 이므로 새로운 ID를 입력하세요.");
						flag = 1;
						break;
					}
				} // end of for
					// 이때 break는 userid 가 올바른 값이라면 do - while 을 빠져나간다.
				if (flag == 0) break;
			}

		} while (true); // end of while-----------

		// 2. 비밀번호 입력받기.
		do {
			System.out.println("▷비밀번호 : ");
			passwd = sc.nextLine();
			pwBool = MyUtil.checkPassword(passwd);// 암호가 정삭적일 때 -> true
			if (pwBool)
				break;// 참이면 do - while문을 나온다.
		} while (true);// pwBool 값이 거짓이면 무한 반복.

		// 3. 이름 입력받기.
		do {
			System.out.print("▷성   명 : ");
			name = sc.nextLine();
			nameBool = userid.trim().isEmpty();// 성명의 공백 검사. 공백이 있으면 true.

			if (nameBool == true) {// -> 이게 참이면 "" && " ": 아이디로 쓸 수 없음
				System.out.println(">>>성명은 공백만으로 사용불가합니다.. 다시입력해주세요.");
			} else// nameBool == flase;
				break;
		} while (nameBool);// 참이라면 공백이 들어갔다는 말로 계속 반복됨.

		// 4.생년월일 입력받기.

		do {
			System.out.println("▷생년월일 (예 : 19930820 : ");
			birthday = sc.nextLine();// 입력받은 생년월일
			birthdayBool = birthday.length() == 8 && MyUtil.checkNumber(birthday);// 생년월일이 8자이고, 숫자로만 이러어 져있으면 참

		} while (!birthdayBool);// 거짓일때 무한반족.
		// 5. 성별 입력받기.
		// 1) 내가짠것
		/*
		 * boolean genderBool = false; do {
		 * System.out.println("▷성   별 : (남자 : 1, 여자 : 2) "); gender = sc.nextInt();
		 * 
		 * switch (gender) { case 1: case 2: genderBool = true; break;
		 * 
		 * default: genderBool = false;
		 * System.out.println("성별을 다시 입력하세요.(남자 : 1, 여자 : 2)"); }
		 * if("1".equals(strGender)||"2".equals(strGender)) { break;//while 문을 빠져나감. } }
		 * while (!genderBool);
		 */
		// 2)선생님이 짠것.
		do {
			System.out.print("▷성   별 : (남자 : 1, 여자 : 2) ");
			String strGender = sc.nextLine();

			switch (strGender) {
				case "1":
				case "2":
					break;
			default:
					System.out.println("성별을 다시 입력하세요.(남자 : 1, 여자 : 2)");
					continue;
				}
				if ("1".equals(strGender) || "2".equals(strGender)) {
					gender = Integer.parseInt(strGender);
					break;// while 문을 빠져나감.
				}
		} while (true);

		// 6. 주소 입력받기.

		do {
			System.out.print("▷ 주   소");
			addr = sc.nextLine();

			if (!addr.trim().isEmpty())
				break;
			else
				continue;

		} while (true);

		// 7. 학력 입력받기.
		do {
			System.out.print("▷학   력 (1. 대졸 이상/2. 초대졸 이상/ 3. 고졸 이상/4. 고졸 미만)");
			school = sc.nextInt();

			switch (school) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.print("1. 대졸 이상/2. 초대졸 이상/ 3. 고졸 이상/4. 고졸 미만");
				continue;
			}
			// String strSchool = String.valueOf(school);
			// if("1".equals(strSchool)||"2".equals(strSchool)||"3".equals(strSchool)||"4".equals(strSchool))
			// break;
			if (school == 1 || school == 2 || school == 3 || school == 4)
				break;
		} while (true);
		// 8. 휴대폰 입력받기.
		do {
			System.out.print("▷휴대폰번호 :(예 : 01044445555)");
			mobile = sc.nextLine();
			int length = mobile.length();
			mobileBool=MyUtil.checkNumber(mobile) && (length == 10 || length == 11);
			
		} while (!mobileBool);
		// 9. 희망 직종

		do {
			System.out.print("▷희망직종 : (\"사무직\",\"생산직\",\"일용직\"...)");
			hopejob = sc.nextLine();

			if (!hopejob.trim().isEmpty())
				break;
			else
				continue;

		} while (true);

		// 10. 희망 연봉

		do {
			System.out.print("▷희망연봉 ");

			String strMoney = String.valueOf(sc.nextInt());

			hopemoneyBool = MyUtil.checkNumber(strMoney);

			if (hopemoneyBool) {
				hopemoney = Integer.parseInt(strMoney);
				break;
			} else {
				System.out.println("희망연봉을 다시 기입하세요. ");

			}

		} while (true);

		System.out.print(">>> 회원가입여부 확인(1.예 / 2.취소) => ");
		String yn = sc.nextLine();

		if (!"1".equals(yn)) {
			System.out.println(">>> 구직자 회원가입을 취소 했습니다. <<<");
		} else if ("1".equals(yn) && Gujikja.count == gujikjaArr.length) {
			System.out.println(">>> 정원이 초과했으므로 구직자 회원가입이 불가합니다.");
		} else {
			// Gujikja 객체 생성(회원가입)
			Gujikja gujikja = new Gujikja(userid, passwd, name, birthday, gender, addr, school, mobile, hopejob,
					hopemoney);
			gujikjaArr[Gujikja.count - 1] = gujikja;
			System.out.println(">>> 구직자 회원가입 성공!!! <<<");
			System.out.println("[" + Gujikja.count + "번째 / 전체 : " + gujikjaArr.length + "명]");
		}

	}

	// 로그인 매소드 1)
	/*
	 * public void login(Scanner sc) {
	 * 
	 * System.out.print("아이디 : "); String userid = sc.nextLine();
	 * System.out.print("비밀번호 : "); String passwd = sc.nextLine();
	 * 
	 * for(int i=0;i<=Gujikja.count-1;i++) {
	 * 
	 * if(gujikjaArr[i].login(userid, passwd)) { System.out.println("로그인 되었습니다."); }
	 * else System.out.println("해당 정보가 없습니다."); } }
	 */
	// 로그인 매소드2)
	// 초기 메뉴 로그인(구직자)을 해주는 매소드 생성.
	public Gujikja loginGujikja(Scanner sc) {
		Gujikja gujikja = null;

		System.out.print("\n 아이디 => ");
		String userid = sc.nextLine();
		System.out.print("\n 비밀번호=> ");
		String passwd = sc.nextLine();
		boolean isLogin = false;
		for (int i = 0; i < Gujikja.count; i++) {
			gujikja = gujikjaArr[i].login(userid, passwd);// 배열 속에 저장되어진 구직자 한명한명.
			// Gujikja 클래스의 저장되어진 배열객체로 login2 매소드를 불러올수 있다.
			// login2->this.userid : 위의 배열에 저장된 객체의 this.userid와 해당 매소드의 userid 를 비교한다.
			// gujikjaArr[i]의 this.userid와 this.passwd가 내가 입력한 userid와 passwd 같다면 gujkaja
			// 객체에 저장한다.
			if (gujikja != null) {
				isLogin = true;
				break;// 위의for문의 gujkaja 의 정보가 저장되어있자면 null값이 아니기 때문에 break;
			}
		}
		if (isLogin)
			System.out.println(">>>로그인 성공!!");
		else
			System.out.println(">>>로그인 실패!!");
		return gujikja;

	}

	// 나의 정보 변경
	public void updateMeGujikja(Scanner sc, Gujikja me) {

		System.out.println("▷암호 =>");
		String passwd = sc.nextLine();
		MyUtil.checkPassword(passwd);

		System.out.println("▷성명 =>");
		String name = sc.nextLine();

		System.out.println("▷생년월일 (예 : 19920422) => ");
		String birthday = sc.nextLine();

		System.out.println("▷주소 =>");
		String addr = sc.nextLine();

		System.out.println("▷학력  (1. 대졸 이상/2. 초대졸 이상/ 3. 고졸 이상/4. 고졸 미만)=>");
		String strschool = sc.nextLine();
		int school = Integer.parseInt(strschool);
		do {
			switch (strschool) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			default:
				System.out.print("1. 대졸 이상/2. 초대졸 이상/ 3. 고졸 이상/4. 고졸 미만");
				continue;
			}
			// String strSchool = String.valueOf(school);
			// if("1".equals(strSchool)||"2".equals(strSchool)||"3".equals(strSchool)||"4".equals(strSchool))
			// break;
			if (school == 1 || school == 2 || school == 3 || school == 4)
				break;
		} while (true);

		System.out.println("▷희망직종=>");
		String hopeJob = sc.nextLine();

		System.out.println("▷희망급여=>");
		String strhopeMoney = sc.nextLine();
		int hopeMoney = Integer.parseInt(strhopeMoney);

		me.passwd = passwd;
		me.address = addr;
		me.name = name;
		me.birthday = birthday;
		me.hopejob = hopeJob;
		me.hopemoney = hopeMoney;

		for (int i = 0; i < Gujikja.count; i++) {
			if (gujikjaArr[i].userid.equals(me.userid)) {
				gujikjaArr[i] = me;// 배열의 userid 와 해당 userid와 같다면 me의 정보를 배열의 정보로 한다.
				break;
			}
		} // end of for
	};

	public void changeInfo(Gujikja a, Scanner sc) {
		System.out.println("=== 변경 할 정보 메뉴===");
		System.out.println("1. 암호");
		System.out.println("2. 이름");
		System.out.println("3. 생년월일");
		System.out.println("4. 주소");
		System.out.println("5. 학력");
		System.out.println("6. 희망직종");
		System.out.println("======================");
		System.out.println(">> 변경할 정보를 입력하세요 (예: 이름 -1 입력)");
		String change = sc.nextLine();
		switch (change) {
		case "1":
			System.out.println("변경할 암호 입력 : ");
			String changePw = sc.nextLine();
			a.passwd = changePw;
			break;
		case "2":
			System.out.println("변경할 이름 입력 : ");
			String changeName = sc.nextLine();
			a.name = changeName;
			break;
		case "3":
			boolean birthdayBool = false;
			System.out.println("▷변경할 생년월일 입력 (예 : 19930820) : ");
			String changeBirthday = sc.nextLine();
			do {
				birthdayBool = changeBirthday.length() == 8 && MyUtil.checkNumber(changeBirthday);// 생년월일이 8자이고, 숫자로만
																									// 이러어 져있으면 참

			} while (!birthdayBool);
			a.birthday = changeBirthday;

			break;
		case "4":
			System.out.println("변경할 주소 입력 : ");
			String changeAddr = sc.nextLine();
			a.address = changeAddr;
			break;
		case "5":
			String strschool = sc.nextLine();
			int school = Integer.parseInt(strschool);
			do {
				switch (strschool) {
				case "1":
					break;
				case "2":
					break;
				case "3":
					break;
				case "4":
					break;
				default:
					System.out.print("1. 대졸 이상/2. 초대졸 이상/ 3. 고졸 이상/4. 고졸 미만");
					continue;
				}
				// String strSchool = String.valueOf(school);
				// if("1".equals(strSchool)||"2".equals(strSchool)||"3".equals(strSchool)||"4".equals(strSchool))
				// break;
				if (school == 1 || school == 2 || school == 3 || school == 4)
					break;
			} while (true);

			break;
		case "6":
			System.out.println("변경할 희망 직종 입력 : ");
			String changeHopeJob = sc.nextLine();
			a.hopejob = changeHopeJob;

		default:
			System.out.println("번호를 다시 입력해주세요.");
			break;
		}
	}

	/*
	 * public void regisgerAdmin(Scanner sc) { Gujikja admin = new Gujikja();
	 * 
	 * System.out.print(">>>메뉴 번호 선택 : "); int menuNo
	 * =Integer.parseInt(sc.nextLine());
	 * 
	 * switch (menuNo) { case 1: System.out.println("1. 모든 구직자 정보 출력 "); for(int
	 * i=0;i<Gujikja.count;i++) {
	 * System.out.println(gujikjaArr[i].getGujikjaInfo());
	 * 
	 * } break; case 2: System.out.println("2. 모든 구인회사 정보 출력"); break; case 3:
	 * System.out.println("3. "); break; case 4: System.out.println("4. "); break;
	 * case 5:{ System.out.println("5. 로그아웃 "); break; } }
	 * 
	 * }
	 */
	// 구직자 메뉴 의 7번. 회원 탈퇴
	public void deleteGujikja(String userid) {
		int deleteIndex = 0;

		for (int i = 0; i < Gujikja.count; i++) {
			if (gujikjaArr[i].userid.equals(userid)) {
				deleteIndex = i;
				break;
			}
		} // end of for

		/*
		 * Gujikja.count 가 5인 배열의 방번호가 0 1 2 3 4 일때 0번째 방이 삭된다라면 deleteIndex는 0이 되고 방을
		 * 옮기는 4번의 작업이 일어나야 한다. 2번째 방이 삭제된더라면 deleteIndex는 2이되고 방을 옮기는 2번의 작업이 일어나야 한다.
		 * 3번째 방이 삭제된더라면 deleteIndex는 3이되고 방을 옮기는 1번의 작업이 일어나야 한다. 4번째 방이 삭제된더라면
		 * deleteIndex는 4이되고 4번째 방은 null 이 들어오는 작업을 해야한다.
		 */
		if (deleteIndex == Gujikja.count - 1) {
			gujikjaArr[deleteIndex] = null;
		} else {
			for (int i = 0; i < (Gujikja.count - 1 - deleteIndex); i++, deleteIndex++) {
				gujikjaArr[deleteIndex] = gujikjaArr[deleteIndex + 1];
				gujikjaArr[deleteIndex + 1] = null;

			}

		}
		Gujikja.count--;// 회원 탈퇴를 했기때문에 구직자카운트는 감소한다.
		System.out.println("회원 탈퇴 성공");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String startMenuNo = "";
		
		Gujikja jobMain = new Gujikja();// Gujikja 에 jobMain 객제 생성
		// Gujikja loginGujikja = null;//로그인 되어진 구직자.

		JobMain jobapp = new JobMain();
		Gujikja loginGujikja = null;
		

		do {

			JobMain.startMenu();// static 매소드 => 클래스명.매소드명
			startMenuNo = sc.nextLine();

			switch (startMenuNo) {
				case "1":// 구직자 등록(생성)
					jobapp.registerGujikja(sc); // Scanner 재활용
	
					break;
				case "3": {
				loginGujikja = jobapp.loginGujikja(sc);// 로그인 되어진 구직자 정보
					// 로그인 정보가 틀리면 loginGujikja 에 널값을 넣어줌.
					// 구직자 메뉴 보여주기
	
					if (loginGujikja != null) {// 로그인 성공 했으면
						do {// 구직자 메뉴보여주기
							JobMain.gujikjaMenu();
							String gujikjaMenuNo = sc.nextLine();
							boolean isBreak = false;
							
							switch (gujikjaMenuNo) {
								case "1":// 나의 정보 조회
									System.out.println(loginGujikja.getGujikjaInfo());
									break;
								case "2":// 나의 정보 변경
									System.out.println(loginGujikja.getGujikjaInfo());
									// jobapp.updateMeGujikja(sc, loginGujikja);
									jobapp.updateMeGujikja(sc, loginGujikja);
									break;
								case "3":// 모든 채용공고 보기
									break;
								case "4":// 구인 회사 ID 검색
									break;
								case "5":// 특정 업종 채용공고조회
		
									break;
								case "6":// 로그아웃
									isBreak = true;
									break;
								case "7":// 회원탈퇴(구직자배열에서 gujikjaArr[]에서 자신의 객체를 null로 만든다.)
									jobapp.deleteGujikja(loginGujikja.userid);// 고유한값.
		
									isBreak = true;
									break;
								default:
									break;// swtich
								}
								if (isBreak)
									break;
							} while (true);
		
						} // end of if
					} // end of case
						break;// switch break
		
					case "4":
		
						break;
					case "5": {
						System.out.println("관리자로 로그인");
						System.out.print("ID : ");
						String adminId = sc.nextLine();
						System.out.print("PassWord : ");
						String adminPw = sc.nextLine();
		
						if ("admin".equals(adminId) && "qwerty123.".equals(adminPw)) {
							System.out.println("로그인 성공!!");
		
							adminMenu();
							Gujikja admin = new Gujikja();
		
							System.out.print(">>>메뉴 번호 선택 : ");
							int menuNo = Integer.parseInt(sc.nextLine());
		
							switch (menuNo) {
							case 1:
								System.out.println("1. 모든 구직자 정보 출력 ");
								for (int i = 0; i < Gujikja.count; i++) {
									System.out.println(jobapp.gujikjaArr[i].getGujikjaInfo());
		
								}
								break;
							case 2:
								System.out.println("2. 모든 구인회사 정보 출력");
								break;
							case 3:
								System.out.println("3. ");
								break;
							case 4:
								System.out.println("4. ");
								break;
							case 5: {
								System.out.println("5. 로그아웃 ");
								break;
							}
							}
		
						} else
							System.out.println("잘못 입력 하였습니다.");
						break;
					}
					case "6":
		
						break;
		
					default:
						break;
					}// end of switch
		
				} while (!"6".equals(startMenuNo));// 메뉴번호가 6번이 아니라면 무한 반복
		
				System.out.println("프로그램 종료.");
				sc.close();

	}// end of main

}
