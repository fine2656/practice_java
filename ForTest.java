package my.day6;

import java.util.Scanner;

public class ForTest {

	public void loopName(int n, String name) {// 매소드
		
		for(int i=1;i<=n;i++) {
			System.out.println(+i+". "+name);
		}
	}

	public static void main(String[] args) {
		/*
	      **** 반복문(loop) ==> for 문 ****
	      
	              ※ for 문의 형식
	       
	        for(초기화; 조건식; 증감식) {
	           	반복해서 실행할 문장;
	        }  
	        
	                   ▣ 순서
	        1) 초기화;
	        2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
	                                  조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
	                   } 을 빠져나간다.)
	        3) 증감식
	        4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
	                                  조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
	                   } 을 빠져나간다.) 
	        5) 증감식
	        6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
	                                  조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
	                   } 을 빠져나간다.)                                                  
	        
	 */
		
		/*
		 
		 1. 안녕자바~ 10번반복
		  ~
		 10. 안녕자바~ 
		 */
				
		for (int i=1;i<11;i++)//i는 지역변수
		{
			System.out.println(i+". 안녕 자바");
			
		}
		System.out.println("---------------");
		ForTest ft = new ForTest();
		
		ft.loopName(5,"설현");// loopName(int, Sprint)
		/*
		 예제 3) '설현'을 다섯번 반복출력
			1. 설현
			2. 설현
			3. 설현
			4. 설현
			5. 설현
					 
		 */
	
		System.out.println("---------------");
		
		/*
		 예제 3) 박보검 출력
		 1.박보검
		 3.박보검
		 5.박보검
		 7.박보검
		 9.박보검
		 */
		for(int i=0,j=1;i<5;i++, j+=2) {//초기식, 증감식 여러개 가능.
			System.out.println(j+". 박보검");
		
				
		}
	System.out.println("---------------");
		/*
		 예제 4)  'Hello 이클립스 감소 출력
		10. Hello 이클립스 
		9. Hello 이클립스 
		8. Hello 이클립스 
		7. Hello 이클립스 
		6. Hello 이클립스 
		5. Hello 이클립스 
		4. Hello 이클립스 
		3. Hello 이클립스 
		2. Hello 이클립스 
		1. Hello 이클립스 
		 */
		for(int i=10;i>0;i--) {//초기식, 증감식 여러개 가능.
			System.out.println(i+". Hello 이클립스 ");
		}
		
	System.out.println("---------------");
	/*
	 예제 5)  'Hello 이클립스 감소 출력
	10. Hello 이클립스 
	9. Hello 이클립스 
	8. Hello 이클립스 
	7. Hello 이클립스 
	6. Hello 이클립스 
	5. Hello 이클립스 
	4. Hello 이클립스 
	3. Hello 이클립스 
	2. Hello 이클립스 
	1. Hello 이클립스 
	 
		*/
	
	Scanner sc = new Scanner(System.in);
	System.out.print("문자열을 입력하세요. " );
	String str = sc.nextLine();//str 은 키보드에서 받아온 문자열을 저장하는 변수.
	
	
	int i=0;
	
	try {
		System.out.print("반복할 횟수 : " );
		int n=Integer.parseInt(sc.nextLine());
		
		for(;i<n;i++) {//초기식을 밖으로 뺄 수 있다.
			System.out.println((i+1)+" "+str);
		}
	} catch (NumberFormatException e) {
		System.out.println("반복할 횟수는 숫자만 입력가능.. " );
		System.exit(0);
		//return ;
		//System.exit(0), System.exit(1) 프로그램 종료
	}
	System.out.println("\n 반복을 마친 이후의 i = "+i);
	System.out.println("---------------");
	
	for(; i>0;i--) {
		System.out.println(i+" . "+str);
	
	sc.close();
	}
	
 
	
	
	}
}



