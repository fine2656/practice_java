package my.day17;

import java.io.IOException;

public class Test {


	public static void main(String[] args) {
	
		String str = "25";
		String str2 = "똘똘이";
		//run type  exeption : 처음부터 오류인지 아닌지 모르나 실행 시 오류인지 알수잇음.
		int a1 = Integer.parseInt(str);
		int a2 = Integer.parseInt(str2);
		System.out.println(a1);
		System.out.println(a2);
		
		int[] arr = {10,20,30};
		
		for(int i=0;i<arr.length+1;i++) {
			System.out.println(arr[i]);
		}
		
		//checked exeption :실행 해보지 않아도 처음부터 오류인지 알수 있다.
		//IOException -> 코딩 할때 부터 나오는 오류
		
		try {
			int no = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
