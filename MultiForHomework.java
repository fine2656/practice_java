package my.day6;

public class MultiForHomework {

	public static void main(String[] args) {
		/*
			 문제 1.		(i,j)
			 ***** 		(0,0) (0,1) (0,2) (0,3) (0,4)
			 ****		(1,0) (1,1) (1,2) (1,3) (2,4)	
			 ***		(2,0) (2,1) (2,2) (2,3) (2,4)	
			 **			(3,0) (3,1) (3,2) (3,3) (3,4)	
			 *			(4,0) (4,1) (4,2) (4,3) (4,4)	
			 
		
		 풀이 1.
			 			(0,0) (0,1) (0,2) (0,3) (0,4)
			 		    (1,0) (1,1) (1,2) (1,3) 	
			 			(2,0) (2,1) (2,2) 	
						(3,0) (3,1) 	
						(4,0)
			=> i+j 의 합이 5 이상 일 경우 *이 찍히지 않는다. 
			 
		*/
		System.out.println("\n----------풀이 1------------");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i+j <=4) 
				 System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("\n----------풀이 2------------");
		//---------------------------------
		//풀이 2
		
		
		for(int i=5;i>0;i--) {
			System.out.println("");
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
		}
		System.out.println("\n----------풀이 3-----------");
		
		//---------------------------	
		//풀이 3
		for(int i=0; i<5;i++) {
			for(int j=(5-i);j>0;j--){
				System.out.print("*");
			}
			System.out.println(""); 
		}
	System.out.println("\n----------풀이 4-----------");
		
		//---------------------------	
		//풀이4
		for(int i=0; i<5;i++) {
			for(int j=0;j<5-i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	
		System.out.println("\n=====문제 2=====");
		/*
		 문제 2
		  *********1
		  ********2
		  *******3
		  ******4
		  *****5
		  ****6
		  ***7
		  **8
		  *9
		   
		 */
		System.out.println("\n----------풀이 1------------");
		
		for(int j=1;j<10;j++) {
			
			for(int i=10-j;i>0;i--) {
				System.out.print("*");
			}
			System.out.print(j);
			System.out.println("");
		}
		System.out.println("\n----------풀이 2------------");
		
		for(int i=9;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
				
			}
			System.out.print(10-i);
			System.out.println("");
		}
			
		System.out.println("\n=====문제 3=====");
		
		/*
		 문제 3.			(i,j)
		 * 				(0,0) (0,1) (0,2) (0,3) (0,4)
		 **				(1,0) (1,1) (1,2) (1,3) (2,4)	
		 ***			(2,0) (2,1) (2,2) (2,3) (2,4)	
		 ****			(3,0) (3,1) (3,2) (3,3) (3,4)	
		 *****			(4,0) (4,1) (4,2) (4,3) (4,4)	
		 
			 
	*/
		System.out.println("\n----------풀이 1------------");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i>=j) System.out.print("*");
				
			}
			System.out.println("");
		}
		System.out.println("\n----------풀이 2------------");
	
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("\n----------풀이 3------------");
		for(int i=0;i<5;i++) {
			for(int j=i+1;j>0;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("\n----------------------");
		System.out.println("\n=====문제 4=====");

		
		/*
		
		 문제 4.					(i,j)
		     * 				(0,0) (0,1) (0,2) (0,3) (0,4)
		    **				(1,0) (1,1) (1,2) (1,3) (2,4)	
		   ***				(2,0) (2,1) (2,2) (2,3) (2,4)	
		  ****				(3,0) (3,1) (3,2) (3,3) (3,4)	
		 *****				(4,0) (4,1) (4,2) (4,3) (4,4)	
		 
		 */
		System.out.println("\n----------풀이 1------------");
		for(int i=0;i<5;i++) {
			 for(int a=5-i;a>0;a--) {
				 System.out.print(" ");
			 }
			 for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			 System.out.println("");
		}	
			
		System.out.println("\n----------풀이 2------------");
		
		for(int i=0;i<5;i++) {
			for(int j=5-i;j>0;j--){//공백 출력
				System.out.print(" ");
			}
			for(int k=5;k>=5-i;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}	
		System.out.println("\n----------풀이 3------------");
		for(int i=0;i<5;i++) {//5행
			for(int j=0;j<5;j++) {//5열
				if (i+j<4) System.out.print(" ");//공백 출력 후 루프 끝낸후
				else System.out.print("*");//별 출력
				
			}
			System.out.println("");
		}
		
		System.out.println("\n----------풀이 4------------");
		for(int i=0;i<5;i++) {
			//" " 을 4번 출력 ,"*"을 1번 출력 ->1번
			//" " 을 3번 출력 ,"*"을 2번 출력 ->2번
			for(int j=0;j<4-i ;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1;j++) {
				System.out.print("*");
				
			}
			System.out.println("");
		
		}
		
		
		System.out.println("\n=====문제 5=====");
		
		/*문제 5
		   * 
		  *** 
		 *****
	   1) "*" 을 출력해 주는 경우
		i+j>=2&& j-i<=2  
		
		 		   (0,2)
		 	  (1,1)(1,2)(1,3)
		 (2,0)(2,1)(2,2)(2,3)(2,4)		
		 
		 
		2) " " 을 출력해 주는 경우
		
		(0,0)(0,1)   (0,3)(0,4)
		(1,0)             (1,4)
		
		!(i+j>=2&& j-i<=2  )->"*" 을 출력해 주는 경우
		
		i+j <2 || j-i >2  ->"*" 을 출력해 주는 경우
		
		*/
		System.out.println("\n----------풀이 1------------");
		
		for(int i=0;i<3;i++) {//3 행
			for(int j=0;j<5; j++) {//5열
				if(i+j>=2&& j-i<=2 )	System.out.print("*");
				else	System.out.print(" ");
			}
			System.out.println("");
		}
		
		System.out.println("\n----------풀이 2------------");
		for(int i=1;i<=3;i++) {
			// " " 이 2번
			// "*" 이 1번
			// " " 이 2번 -> 1번 회전 할떄
			// " " 이 1번
			// "*" 이 3번
			// " " 이 1번 -> 2번 회전 할떄
			// " " 이 0번
			// "*" 이 5번
			// " " 이 0번 -> 3번 회전 할떄
			for(int j=0;j<(5-(i*2-1))/2;j++) {//j<2, j<1, j<0
				System.out.print(" ");
			}
			for(int j=0;j<(i*2-1) ; j++) {//i<1, i<3, i<5
				System.out.print("*");
			}
			for(int j=0;j<(5-(i*2-1))/2;j++) {//j<2, j<1, j<0
				System.out.print(" ");
			}
			System.out.println("");
		}
			
		/*
		  문제 6
		*****
		 ***
		  * 
	   1) "*" 을 출력해 주는 경우
		i+j>=4 && j>=i  
		
		 	(0,0)(0,1) (0,2) (0,3)(0,4)
		 	      (1,1)(1,2)(1,3)
		               (2,2)		
		  
		 
		2) " " 을 출력해 주는 경우
		
						
		
		!(i+j>=4&& j>=i )->" " 을 출력해 주는 경우
		
		i+j <4 || j<i ->" " 을 출력해 주는 경우
		
		*/
		System.out.println("\n=====문제 6=====");
		System.out.println("\n----------풀이 1------------");
		for(int i=0; i<3; i++) {
			for(int j=0;j<5;j++) {
				if(i+j<=4 &&j>=i)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		
		
		
		
		
		System.out.println("\n----------풀이 2------------");
		
		for(int i=0;i<3 ;i++) {
			for(int j=0;j<3+i;j++) {
				System.out.print(" ");
			}
			for(int j=(5-(2*i));j>0;j--) {//
				 System.out.print("*");
								
			}
			for(int j=0;j<3+i;j++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("\n----------풀이 3------------");
		for(int i=3;i>0;i--) {
			// " " 이 0번
			// "*" 이 5번
			// " " 이 0번 -> 1번 회전 할떄
			// " " 이 1번
			// "*" 이 3번
			// " " 이 1번 -> 2번 회전 할떄
			// " " 이 2번
			// "*" 이 1번
			// " " 이 2번 -> 3번 회전 할떄
			for(int j=(5-(i*2-1))/2;j>0;j--) {//j=0, j=1, j=2
				System.out.print(" ");
			}
			for(int j=((i*2)-1);j>0 ; j--) {//j<5, j<3, j<1
				System.out.print("*");
			}
			for(int j=(5-(i*2-1))/2;j>0;j--) {//j=0, j=1, j=2
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("\n=====문제 7=====");
		/*
		  문제 7
		  *
		 ***
		*****
		 ***
		  * 
	   		
		*/
		for(int i=1;i<=3;i++) {
			for(int j=0;j<(5-(i*2-1))/2;j++) {//j<2, j<1, j<0
				System.out.print(" ");
			}
			for(int j=0;j<(i*2-1) ; j++) {//i<1, i<3, i<5
				System.out.print("*");
			}
			for(int j=0;j<(5-(i*2-1))/2;j++) {//j<2, j<1, j<0
				System.out.print(" ");
			}
			System.out.println("");
		}
		for(int i=2;i>0;i--) {
		
			for(int j=(5-(i*2-1))/2;j>0;j--) {// j=1, j=2
				System.out.print(" ");
			}
			for(int j=((i*2)-1);j>0 ; j--) {// j<3, j<1
				System.out.print("*");
			}
			for(int j=(5-(i*2-1))/2;j>0;j--) {// j=1, j=2
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
		
	


