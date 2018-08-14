package my.day7;

public class DoWhileTest {
	/*
    === do ~ while() ===
    
         변수초기화;
    
    do{
               반복해서 실행할 명령문;
               증감식;
    } while(조건식);
    
    while 문의 경우 조건식이 true 일때만 반복 실행하지만,
    do ~ while 문의 경우는 조건식이 false 일지라도
        무조건 do{ } 속에 있는 명령문은 1번은 실행하고서 반복문을 벗어난다.
        
        그러므로 do ~ while 문은 무조건 do{ } 속에 있는 명령문을 실행하고서
    while(조건식) 속의 조건에 따라 참(true)이라면 계속 반복하고,
        조건이 거짓(false)이라면 중지한다.  
*/
	
	public static void main(String[] args) {
		int i=0;
		do {
			System.out.println("테스트테스트");
			
		} while (i>1);
		
		System.out.println("\n====================");
		//1부터 100까지 중 17의 배수만 출력 17, 34, 51, 68, 89 
		//1부터 100까지 중 17의 배수의 합 출력 255
		i=0;
		int num=0;
		int sum=0;
		String str = " ";
		do {		
			if(num>100) break;
			if(++num%17==0 ) {
				//17 배수라면
				String comma = (num>17)?", ":"";
				str +=comma+num;
				sum +=num;
				}
			
			}while(true);// 무한 루프		
		System.out.println("1부터 100까지 중 17의 배수만 출력 "+str);
		System.out.println("1부터 100까지 중 17의 배수만 출력 "+sum);
		
		System.out.println("\n====================");
		System.out.println("\n 퀴즈 ");
		
		// 아래의 출력 결과가 어떻게 나오는지 직접 손으로 적보세요.
		int m=1,n=10;
		do {
			if(m>n) break;
			n--;
			
		} while (++m<5);
		System.out.println("m = "+m+", n = "+n);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
