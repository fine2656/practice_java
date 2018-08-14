package my.day7;

public class WhileTest {

	public static void main(String[] args) {
		
		/*
	    === while 문 형식 ===
	    
	       변수의 초기화;
	       
	    while(조건식) {
	             조건식이 참(true)이라면 반복해서 실행할 명령문 계속해서 실행하고,
	             조건식이 거짓(false)이라면 { } 이부분을 빠져나간다.       
	             
	             반복해서 실행할 명령문;
	             증감식;      
	    }
	*/
		
		int i=0;
		while(i<5) {
			System.out.println((i+1)+" 안녕자바~~");
			i++;
		}
		
		System.out.println("");
		
		
		i=0;
		while(i++<5) {//0 1 2 3 4 
			System.out.println(i+". Hello java~~");
								// 1 2 3 4 5
		}
		System.out.println("");
		

		System.out.println("\n=== 3단 출력 ===");
		
		int j = 1;
		
		while(j<10) {
			
			System.out.println("3 * "+j+"= "+(3*j));
			j++;
		}
		/*
		 === 3단 출력 ===
			3 * 1= 3
			3 * 2= 6
			3 * 3= 9
			3 * 4= 12
			3 * 5= 15
			3 * 6= 18
			3 * 7= 21
			3 * 8= 24
			3 * 9= 27 
		 */
		System.out.println("");
		j=0;
		while(j++<9) {
			
			System.out.println("3 * "+j+"= "+(3*j));
		}
		
		System.out.println("");
		System.out.println("\n=== 3단 출력(짝수만) ===");
		/*
		 3 * 2 = 6 
		 3 * 4 = 12
		 	
		 */
		i=0;
		while(i++<9)
		{
			if(i%2 !=0 ) continue;
			System.out.println("3*"+i+" = "+(3*i) );
		}
		
		System.out.println("");
		System.out.println("\n=== 3단 출력(6부터는 제외) ===");
		/*
		 3 * 1 = 3 
		 3 * 2 = 6
		 3 * 3 = 9
		 3 * 4 = 12
		 3 * 5 = 15
		 	
		 */
		i=0;
		while(i++<9)
		{
			if(i >5 ) break;
			System.out.println("3*"+i+" = "+(3*i) );
			
			
		}
		
		System.out.println("====구구단====");
		int row=0, col=0;
		
		while(row++<9) {//행
			col =0;// row =1 일때 col 은 이미 8번 돌 았기 때문에 col 값은 8이므로 while 이 돌지 않아 col을 초기화 해준다.
			while(col++<8) {
			String str = ((col+1)<9)?"\t":"\n"; 
			System.out.print(col+1+" * "+row+" = " +(row*(col+1))+str);
			}
		}//end of while
		
		/*
					 ====구구단====
			2 * 1 = 2	3 * 1 = 3	4 * 1 = 4	5 * 1 = 5	6 * 1 = 6	7 * 1 = 7	8 * 1 = 8	9 * 1 = 9
			2 * 2 = 4	3 * 2 = 6	4 * 2 = 8	5 * 2 = 10	6 * 2 = 12	7 * 2 = 14	8 * 2 = 16	9 * 2 = 18
			2 * 3 = 6	3 * 3 = 9	4 * 3 = 12	5 * 3 = 15	6 * 3 = 18	7 * 3 = 21	8 * 3 = 24	9 * 3 = 27
			2 * 4 = 8	3 * 4 = 12	4 * 4 = 16	5 * 4 = 20	6 * 4 = 24	7 * 4 = 28	8 * 4 = 32	9 * 4 = 36
			2 * 5 = 10	3 * 5 = 15	4 * 5 = 20	5 * 5 = 25	6 * 5 = 30	7 * 5 = 35	8 * 5 = 40	9 * 5 = 45
			2 * 6 = 12	3 * 6 = 18	4 * 6 = 24	5 * 6 = 30	6 * 6 = 36	7 * 6 = 42	8 * 6 = 48	9 * 6 = 54
			2 * 7 = 14	3 * 7 = 21	4 * 7 = 28	5 * 7 = 35	6 * 7 = 42	7 * 7 = 49	8 * 7 = 56	9 * 7 = 63
			2 * 8 = 16	3 * 8 = 24	4 * 8 = 32	5 * 8 = 40	6 * 8 = 48	7 * 8 = 56	8 * 8 = 64	9 * 8 = 72
			2 * 9 = 18	3 * 9 = 27	4 * 9 = 36	5 * 9 = 45	6 * 9 = 54	7 * 9 = 63	8 * 9 = 72	9 * 9 = 81 
		 */
		
		System.out.println("====구구단(3단 7단 제외)====");
		  col = 0;
		row = 0;
		while(row++<9) {//세로
			col = 0;
			while(col++<8) {//가로,col =o
				//col =1
				if(col+1==3 ||col+1 ==7) continue;
				String str = (col+1)<9?"\t":"\n";//col =2
				System.out.print((col+1)+" * "+row+" = "+ (col+1)*row+"\t");
				
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
