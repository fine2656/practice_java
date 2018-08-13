package my.day4;

import java.io.IOException;

public class RoundTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		double db1=93.45678, db2=86.87654;
		
		System.out.println("\n===반올림 후 ===\n");
		System.out.println("db1 = > "+Math.round(db1)+"\tdb2 = "+Math.round(db2));
		/*
		  ===반올림 후 ===

		db1 = > 93	db2 = 87
		 */
	
		System.out.println("\n===특정 소수부 자리에서 반올림 후 ===\n");
		/*
		93.45678을 소수부 2번째 자리에서 반올림을 하려고 한다.  
		93.45678 * 10 ==> 934.5678
		Math.round(934.5678); => 935
		935/10.0 ==> 93.5
		
		
		86.87654을 소수부 2번째 자리에서 반올림하려고 한다.
		 ==>86.88 *100 ==> 8687.654
		 Math.round => 8688
		 8688/100.0 = 86.88
		 
		 
		 
		 */
		
		System.out.print("db1 = "+Math.round(db1*10)/10.0);//소수부 첫번째 자리에서 반올림 하기위해 10을 곱한 뒤 Math.round 한 후 다시 10.0 으로 나눠준다
		System.out.print("\tdb2 = "+Math.round(db2*100)/100.0);//소수부 첫번째 자리에서 반올림 하기위해 10을 곱한 뒤 Math.round 한 후 다시 10.0 으로 나눠준다
		
	}

}
