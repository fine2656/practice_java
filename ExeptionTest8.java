package my.day17;
/*
try 블럭 한개에 catch 절은 여러개가 올 수 있다. 그러나 이때 catch 순서에 주의 해야한다.
먼저 자식 Execption을 먼저 기술하고, 부모 Exception을 나중에 기술해야한다.
*/

public class ExeptionTest8 {
	
	public static void main(String[] args) {


		// TODO Auto-generated method stub
	
		int[] array = {10,20,30,40};
		
		String str = "1";
		for(int i=0;i<array.length+1;i++) {
			try {
				int no1 = array[i];
				no1 = array[i]/(3-i)*Integer.parseInt(str);
				System.out.println("result = array.length/"+(3-i)+"="+no1);

			}catch (ArithmeticException e) {
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 크기를 초과했으므로 안됩니다.");
			}catch (Exception e) {
				System.out.println("기타 오류 발생");
				System.out.println(e.getMessage());
			}
			finally {
				if(i==array.length)		System.out.println("프로그램 종료");
			}
		 }//end of for
	}//end of main
}
