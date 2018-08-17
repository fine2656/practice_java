package my.day7;

import java.util.Random;

import my.util.MyUtil;

public class RandomTest {

	public static void main(String[] args) {
		Random rnd = new Random();
		System.out.print("1부터 10가지 중 랜덤한 수 : ");
		int rndnum = rnd.nextInt(10);
		//rnd.nextInt(10) 은 0부터 9 사이의 랜덤한 수를 
		
		System.out.println(rndnum);//출력 -> 1부터 10가지 중 랜덤한 수 : 3
		System.out.print("13부터 18가지 중 랜덤한 수 : ");
		/*
		 min 부터 max 사이의 랜덤한 정수를 얻으려면  
		 rnd.nextInt(max-min+1)+min;=> 공식!!
		 int rndnum = rnd.nextInt(18-13+1)+13;
		 int rndnum = rnd.nextInt(6)+13;
		 				0 1 2 3 4 5
		 			+   13	
		 				------------
		 				13 14 15 16 17 18,,
		 				
		  
		 */
		
		 int random2 = rnd.nextInt(6)+13;
		 System.out.println(random2);
		 
		 System.out.print("1부터 100까지중 랜덤한 수 : "+MyUtil.random2((100),1));
		 System.out.print("A부터 Z 까지중 랜덤한 문자 : "+(char)MyUtil.random2('A','Z'));
		 
		 
		 
	}

}
