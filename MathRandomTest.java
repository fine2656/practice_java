package my.day7;

import my.util.MyUtil;

public class MathRandomTest {

	public static void main(String[] args) {
		/*
	    java.lang.Math.random() 메소드는
	    0.0 이상 1.0 미만의 실수(double)값을 랜덤하게 나타내어주는 메소드이다.
	       즉, 0.0 <= 임의의 난수(실수) < 1.0  
	 */
		
		double rand = Math.random();
		System.out.println(rand);//0<rand<1
		
		
/*
                랜덤(1부터 10까지의 범위를 구한다. ==> 구간범위 : 10-1+1 = 10)// 범위의 최대값에서 최소값을 빼고 더하기 1을 한다.
         0.0 * 구간범위(10)  ==> 0.0  (int)0.0 ==> 0 + 시작값(1) ==> 1   
         0.34 * 구간범위(10) ==> 3.4  (int)3.4 ==> 3  + 시작값(1) ==> 4 
         0.567 * 구간범위(10) ==> 5.67  (int)5.67 ==> 5  + 시작값(1) ==> 6 
         0.99999 * 구간범위(10) ==> 9.9999  (int)9.9999 ==> 9 + 시작값(1) ==> 10
         
                랜덤(13부터 18까지의 범위를 구한다. ==> 구간범위 : 18-13+1 = 6)
         0.0 * 구간범위(6)  ==> 0.0  (int)0.0 ==> 0 + 시작값(13) ==> 13   
         0.34 * 구간범위(6) ==> 2.04  (int)2.04 ==> 2  + 시작값(13) ==> 15 
         0.567 * 구간범위(6) ==> 3.402  (int)3.402 ==> 3  + 시작값(13) ==> 16 
         0.99999 * 구간범위(6) ==> 5.99994  (int)5.99994 ==> 5 + 시작값(13) ==> 18       
           
                랜덤한 정수 = (int)(Math.random()*구간범위) + 시작값;            
     */
		System.out.println("1 부터 10까지 중에서 랜덤하게 발생한 값");
		//System.out.println((int)(Math.random()*10) + 1);  
		System.out.println(MyUtil.random(10,100));//MyUtil 의 새로운 매소드 생성.
		System.out.println("");
		System.out.println("13 부터 18까지 중에서 랜덤하게 발생한 값");
		System.out.println(MyUtil.random(13,18));
		
		System.out.println("");
		System.out.println("a 부터 z까지 중에서 랜덤하게 발생한 값");
		System.out.println((char)MyUtil.random('a','z'));
		
		
		
	
	}

}
