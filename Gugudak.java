package my.day6;

import java.util.Scanner;

public class Gugudak {
	
	
	//매소드
	//입력 값 받아서 구구단 출력하기
	public void showInfo(int num){
		
		System.out.println("==="+num+"단===");
	
			for(int i=1,j=num;i<10;i++) {
				
				System.out.println(j+"*"+i+" = "+(j*i)+" ");
				}	
	}
	
	//누적치 합 구하기
	
	public void showSum(int strnum, int strnum2) {
		int sum=0;
		for(int i = strnum;i<=strnum2;i++) {
			//2 4
			sum +=i;
		}
		System.out.print("결과 : "+strnum+"부터 "+strnum2+"까지 누적의 합은 "+sum+" 입니다. "+"\n");
	}
		
		

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" 구구단 ");
 /* 2*1 = 2 	3*1=3 	4*1=4	....	8*1=8	9*1=9
	2*2 = 4 	3*2=6 	4*2=4	....	8*1=8	9*1=9
	2*3=  6 	3*3=9 	4*3=4	....	8*1=8	9*1=9
	2*4 = 8 	3*4=12 	4*4=4	....	8*1=8	9*1=9
	2*5 = 10 	3*5=15 	4*5=4	....	8*1=8	9*1=9
	2*6 = 12 	3*6=18 	4*6=4	....	8*1=8	9*1=9
	2*7 = 14 	3*7=21 	4*7=4	....	8*1=8	9*1=9
	2*8 = 16 	3*8=24 	4*8=4	....	8*1=8	9*1=9
	2*9 = 18 	3*9=27 	4*9=4	....	8*1=8	9*1=9
	*/

	for(int i=0;i<9;i++) {//9행
		
		for(int j=0;j<8;j++) {//8열
			String str = (j+2<9)?"\t":"\n";
			System.out.print((j+2)+"*"+(i+1)+ "= "+((j+2)*(i+1))+str);
		}
		
	}	
	
	
	System.out.println(" -------------------------------------- ");
	
	/*
	 >> 몇단 볼래? => 
	 ===7단===
	 7*1=7
	 7*2=14
	  
	 */
	for(;;) {
		/*
		for(;;){// 무한 루프
		 
			break;
		}
		*/
	try {
		
		
			Gugudak gd = new Gugudak();
		
		System.out.println(">> 몇단 볼래 ? ");
		int num = Integer.parseInt(sc.nextLine());
		gd.showInfo(num);
		
		break;// try 가 정상적으로 실행 되었으면 break 를 만나서 무한루프를 빠져나올 수 있다.
	} catch (NumberFormatException e) {
		System.out.println("정수만 입력하시오. ");
		
	  }
	}	
	//end of for---------------------------------
	System.out.println("-----------------------");
	
	/*
	 
	 누적치 합 구하기
	>> 시작 수 
	2
	>> 종료 수 
	6
	결과 : 2부터 6까지 누적의 합은 20 입니다. 
	 
	 */
	System.out.println("\n누적치 합 구하기");
	for(;;) {
	System.out.println(">> 시작 수 ");
	try {
		int strnum = Integer.parseInt(sc.nextLine());
		System.out.println(">> 종료 수 ");
		int strnum2 = Integer.parseInt(sc.nextLine());
		
		Gugudak sum2 = new Gugudak();
		
		sum2.showSum(strnum, strnum2);
		break;
		
	} catch (NumberFormatException e) {
		System.out.println("정수만 입력하시오. ");
	 }
	
	}
	
	System.out.println("-----------------------");
			
	sc.close();
	
	
	
	
		}

}
