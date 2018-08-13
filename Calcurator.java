package my.day5;

public class Calcurator {
	
	

	public String calc(double a, double b,String op) {
		
		double result = 0.0;
			
		switch (op) {
		case "+":result=a+b; break;
		case "-":result=a-b; break;
		case "/":	
				if(b==0) return "두번째 인자값b는 0이 될 수 없다. ";
				else result=a/b; break;//case 문을 빠져나가는 break 문 
					
			
			/*try {
					result=a/b;
					break;//case 문을 빠져나가는 break 문
				} 
			catch (ArithmeticException e) {//ArithmeticException은 어떤 숫자를 0으로 나눴을 때 발생하는 오류.
					return "두번째 인자값b는 0이 될 수 없다. ";
				}*/
			
						
		case "*":result=a*b; break;
				}	
		//소수부가 .0인경우
		if(result%(int)result==0) 
			return Integer.toString((int)result);
			
		//인트타입을 스트링 타입으로 변환. 소수부가 0일 때 0이 필요 없어 절삭함.
		//소수부가 존재하는데 .0이 아닌경우	 
		else 
			return Double.toString(result);
			// double 타입을 string 타입으로 전환.
			
			 
		
			//return Double.toString(result);//더블 타입을 스트링으로 변환 
			//String.valueOf(result);
				
	}
	

}
