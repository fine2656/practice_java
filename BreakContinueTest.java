package my.day6;

public class BreakContinueTest {

	public static void main(String[] args) {
	
		System.out.println(">>1.=====================");
	
		for(int i=0;i<4;i++) {
			if(i==2)break;//break 가장 가까운 반복문을 벗어난다.
			System.out.println("i=>"+i);
		}
		
		System.out.println("\n>>2.=====================");
		/*
		 
		 <출력>
		 1 2 3 
		 4 5 6
		 
		 */
		System.out.println("--------- 풀이 1-----------");
		for(int i=0,n=0;i<10;i++) {
			if(i==2) break;
			for(int j=0;j<3;j++) {
				System.out.print(++n+" ");//n++이므로 n값이 계속 높아지며, 변수 n 을 외부 for 문에 둠으로써 n값을 유지시킨다.
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("--------- 풀이 2-----------");
		for(int i=0,n=0;i<10;i++) {
			if(i==2) break;
			for(int j=0;j<3;j++) {
				String str = (++n%3==0)?"\n":" ";
				System.out.print(n+str);//n++이므로 n값이 계속 높아지며, 변수 n 을 외부 for 문에 둠으로써 n값을 유지시킨다.
			}
					
		}
		System.out.println("");
		System.out.println("--------- 풀이 3-----------");

		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				if(j==3) break;
				System.out.print(" ["+i+","+j+"]");
			}
			System.out.println("");
		}
		/* 	출력 
		     [0,0] [0,1] [0,2]
			 [1,0] [1,1] [1,2]
			 [2,0] [2,1] [2,2]
			 [3,0] [3,1] [3,2]
			 [4,0] [4,1] [4,2]
			 [5,0] [5,1] [5,2]
			 [6,0] [6,1] [6,2]
			 [7,0] [7,1] [7,2]
			 [8,0] [8,1] [8,2]
			 [9,0] [9,1] [9,2]*/
		
		System.out.println("");
		System.out.println("--------- 풀이 4-----------");
		outer://레이블명, Label 명
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				if(j==3) break outer;//break 레이블명; 을 하면 가장 가까운 레이블명이 붙은 반복문을 빠져나간다.
				System.out.print(" ["+i+","+j+"]");
			}
			System.out.println("");
		}
		// 출력 ->  [0,0] [0,1] [0,2]
		/*
		  레이블명은 outer 라고 하겠다.
		 레이블명 뒤에 ':' 붙이며, 반드시 반복문 앞에 써야한다.
		 
		 */
		System.out.println("\n>>3.=====================");
		for(int i=0;i<10;i++) {
			String str = (i<9)?",":"\n";//i가 9보다 작다면, 아니면 줇꿈해라.
			System.out.print((i+1)+str);
			// 출력 -> 1,2,3,4,5,6,7,8,9,10
			
		}
		
		System.out.println("");
		
		for(int i=0;i<10;i++) {
			if ((i+1)%2==0) continue;
			//continue ; 는 아래의 명령줄을 실행하지 말고 증감식으로 올라가라는 말이다.
			String str = (i<8)?",":"\n";//i가 9보다 작다면, 아니면 줄바꿈해라.
			
			System.out.print((i+1)+str);
			// 출력 -> 1,3,5,7,9,
			
		}
		
		System.out.println("");
		for(int i=0;i<10;i++) {
			if ((i+1)%2!=0) continue;
			//continue ; 는 아래의 명령줄을 실행하지 말고 증감식으로 올라가라는 말이다.
			
			String str = (i<9)?",":"\n";//i가 9보다 작다면, 아니면 줄바꿈해라.
			System.out.print((i+1)+str);
			// 출력 -> 2,4,6,8,10
			
			
		
		}
		
		System.out.println("\n>>4.=====================");
		System.out.println("1부터 10까지의 누적의 합 : ");
		
		int sum=0;
		for(int i=0;i<10;i++) {
			sum +=(i+1);
			//sum = sum+1; i=0 sum=1
			//sum = sum+2; i=1 sum=1+1+1=3
			//sum = sum+3; i=2 sum=3+2+1=6
			
		String plus = (i<9)?"+":"=";
		System.out.print(i+1+plus);
		}
		System.out.print(sum);
		//출력
		//1부터 10까지의 누적의 합 : 
		//1+2+3+4+5+6+7+8+9+10=55
		System.out.println("\n>>5.=====================");
		System.out.println("1부터 10까지의 짝수 누적의 합 : ");
		
		sum = 0;		
		for(int i=0;i<10;i++) {
			if((i+1)%2 !=0) continue;
			
			sum =sum+(i+1); // 2 4 6 8 10
				
			
		}
		System.out.print(sum);
		System.out.println("");
				
		
		System.out.print("1부터 10까지의 홀수 누적의 합 : ");
	
		sum = 0;		
		for(int i=0;i<10;i++) {
			if((i+1)%2 ==0) continue;
			
			sum =sum+(i+1); // 1 3 5 7 9
		}
		System.out.print(sum);
		System.out.println("");
		/*
		 	1부터 10까지의 짝수 누적의 합 : 
			30
			1부터 10까지의 홀수 누적의 합 : 
			25
		 */
		System.out.println("\n----------------------\n");
		
		System.out.println("\n>>6.=====================");
		System.out.print("5와 7을 제외한 1부터 10까지의 누적의 합 : ");
		
		sum = 0;		
		for(int i=0;i<10;i++) {
			if((i+1)%5 ==0 || (i+1)%7==0) continue;// i+1의 값이 5또는 7이라면 건너 뛰어라
			
			sum =sum+(i+1); // 1 2 3 4 6 7 8 9 
		}
		System.out.print(sum+10);
		System.out.println("");
		/*
		  >>6.=====================
			5와 7을 제외한 1부터 10까지의 누적의 합 : 33
		 */
		System.out.println("\n----------------------\n");
		System.out.println("\n>>7.=====================");
		
		
		int sum2=0;
		sum = 0;		
		for(int i=0;i<100;i++) {
			if((i+1)%3 !=0) continue;
			 sum =sum+(i+1);  
			 if((i+1)%9==0) sum2 +=(i+1); 
			
			 
		}
		System.out.print("1부터 100까지 중 3의 배수의 합 : ");
		System.out.println(sum);
		System.out.print("1부터 100까지 중 9의 배수의 합 : ");
		System.out.println(sum2);
		System.out.println("");
		
		/*
		 1부터 100까지 중 3의 배수의 합 : 1683
		 1부터 100까지 중 9의 배수의 합 : 594
 	  
		 */
		
		System.out.println("\n----------------------\n");
		System.out.println("\n>>8.=====================");
		
	    
		sum=0;
		for(int i=0;i<10;i++) {
			sum +=(i+1);
			//sum = sum+1;
			//sum = sum+2;
			//sum = sum+3;
			
		String plus = (i<9)?"+":"=";
		System.out.print(i+1+plus);
		}
		System.out.print(sum+"\n");
		/////////////////////////////////////////////////////////////////////////
		
		sum = 0;		
		for(int i=0;i<10;i++) {
			if((i+1)%2 !=0) continue;
			
			sum =sum+(i+1); // 2 4 6 8 10
			String str = (i<9)?"+":" ";
			System.out.print(i+1+str);	
			
		}
		System.out.print("="+sum);
		System.out.println("");
		/////////////////////////////////////////////////////////////////////////		
		
		sum = 0;		
		for(int i=0;i<10;i++) {
			if((i+1)%2 ==0) continue;
			sum =sum+(i+1); // 1 3 5 7 9
			
			String str = (i<8)?"+":"=";
			System.out.print(i+1+str);
		}
		System.out.print(sum);
		System.out.println("");
		
		/////////////////////////////////////////////////////////////////////////

		sum = 0;		
		for(int i=0;i<10;i++) {
			if((i+1)==5  || (i+1)==7) continue;// i+1의 값이 5또는 7이라면 건너 뛰어라
			
			sum =sum+(i+1); // 1 2 3 4 6 7 8 9 
			String str = (i<8)?"+":"=";
			System.out.print(i+1+str);
		}
		System.out.print(sum);
		System.out.println("");
		
		/*
		 	출력
		  	1+2+3+4+5+6+7+8+9+10=55
			2+4+6+8+10 =30
			1+3+5+7+9=25
			1+2+3+4+6+8+9=43
		 */
		
		
		System.out.println("\n----------------------\n");
		System.out.println("\n>>9.=====================");
		
		//1+2+3+4+5+6+7+8+9+10=55
				
		sum=0;
	
		
		for(int i=0; ;i++) {// 조건식이 없으면 무한루프이다.
			if(i==10) break;
			
			sum +=(i+1);
			String str = (i<9)?"+ ":"=";//초기값 null
			System.out.print(i+1+str);
			
		}
		System.out.println(sum);
		//1+ 2+ 3+ 4+ 5+ 6+ 7+ 8+ 9+ 10=55
		
		System.out.println("\n=====숙제 1.=====");
		/*
		 301호 302호 303호 305호
		 201호 202호 203호 205호
		 101호 102호 103호 105호 
		 */
		
		for(int i=3;i>0;i--) {
			for(int j=0;j<5;j++) {
			if(j+1==4) continue; 	
			System.out.print(i+"0"+(j+1)+"호  ");
			}
		System.out.println("");
		}
		
		
		System.out.println("\n=====숙제 2.=====");
		
					/*
					 501호 502호 503호 505호 
					 301호 302호 303호 305호
					 201호 202호 203호 205호
					 101호 102호 103호 105호 
					 */
		for(int i=5;i>0;i--) {
			if(i==4) continue;
			for(int j=0;j<5;j++) {
			if(j+1==4) continue; 	
			System.out.print(i+"0"+(j+1)+"호 ");
			}
		System.out.println("");
		}
		
		
		
		
		
		
		
	}

}
