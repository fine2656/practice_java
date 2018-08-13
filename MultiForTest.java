package my.day6;

public class MultiForTest {

	public static void main(String[] args) {
		//1 2 3 4 5 6 7 8 9 ~ 20
		
		for(int i=0;i<20;i++) {
			System.out.print((i+1)+" ");
		}
	System.out.print("\n\n");
	

	for(int i=0;i<20;i++) {
		String str = (i+1)%5==0?"\n":" ";//5의 배수 면 줄바꿈 , 아니면 공백 : 삼항 연산자.
		System.out.print(+i+1+str);		
		/*
		 
		예제 1)
		출력
		1 2 3 4 5
		6 7 8 9 10
		11 12 13 14 15
		16 17 18 19 20
		 */
		
	}
		System.out.print("\n------------------\n");
		System.out.print("\n=== 필수 암기 ===\n");
		
		/*
		  === 필수 암기 ===
		 외부 loop ==> 행의 갯수 
		 내부 loop ==> 열의 갯수
		 
		
		예제 2)
		출력
		1 2 3 4 5
		6 7 8 9 10
		11 12 13 14 15
		16 17 18 19 20
		 
		*/
	
		int n=0;
		for(int j=0;j<4;j++) {//4행
			for(int k=0;k<5;k++) {//5열
				System.out.print(++n+" ");
				
				//1 2 3 4 5
				//6 7 8 9 10
				//11 12 13 14 15
				//16 17 18 19 20
				
				//n의 값은 For 루프를 도는 동안 계속 그 값이 저장 되어 1~20 까지 증가
				//내부 for 문이 다섯번 증가하면 밖의 for 문이 다시 하나 증가하여 이과정을 네번 반복.
				
				
			}
			System.out.print("\n");// 위의 n 이 5번 출력되면 줄바꿈 해라.
		}
		
		
		System.out.println("-------------------------");
		/*
		 예제 3)
		 
		*****
		*****
		*****
		*****
		*****
		*/
		
		for(int a=0;a<5; a++) {//5행
			System.out.println("");
			for(int b=0;b<5;b++) {//5열
				System.out.print("*");
				
			}
		}
	System.out.println("\n--------------------\n");
	/*
	 ***
	 ***
	 ***
	 ***
	 */
		for(int i=0;i<3; i++) {//4행
			System.out.println("");
			for(int j=0;j<3;j++) {//3열
				System.out.print("*");
				
			}
		}
		
		System.out.println("\n--------------------\n");
		
		for(int i=0;i<12;i++) {
			
			String str =(i+1)%3==0?"\n":"";
			System.out.print("*"+str);
		}
		
		
		System.out.println("\n--------------------\n");
		/*
		 출력
		 
		*****
		*****
		*****
		*****
		 */
		for(int i=1,j=1; i<21; i++,j++) {
			System.out.print("*");
			if(j%5==0) System.out.println("");
		}
		
	
		
	}

}


