package my.day8;

import java.util.Scanner;

import my.util.MyUtil;

public class ArrayTest2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] foodArr = {"돈까스","김밥","제육덮밥","서브웨이","햄버거","라면","고기국수","떡볶이"};
		int index = MyUtil.random2(0, 7);
		System.out.println("오늘의 점심메뉴는 "+foodArr[index]+"입니다");
		System.out.println("--------------------------");
		//int index2 = MyUtil.random2(1, 2);
		/*System.out.println("1번 싼것, 2번 고급진 것 => "+index2);
		if(index2 ==1 ) {
			int cheap = MyUtil.random2(1, 7);
			System.out.println("오늘의 점심 메뉴는 : "+cheapfoodArr[cheap]+"입니다");
		}
		else if(index2 ==2 ) {
			int royal = MyUtil.random2(1, 6);
			System.out.println("오늘의 점심 메뉴는 : "+ royalfoodArr[royal]+"입니다");
		}
		
		*/
		String str =" ";
		
		String [] cheapfoodArr = {"돈까스","김밥","제육덮밥","서브웨이","햄버거","라면","떡볶이"};
		String [] royalfoodArr = {"스테이크","피자","삼계탕","추어탕","스타벅스","고기국수"};
		
		System.out.println("1번 싼것, 2번 고급진 것 : ");
		str =sc.nextLine();
		
		if("1".equals(str) ) {
			int cheap = MyUtil.random2(0, 6);
			System.out.println("오늘의 점심 메뉴는 : "+cheapfoodArr[cheap]+"입니다");
		}
		else if("2".equals(str) ) {
			int royal = MyUtil.random2(0, 5);
			System.out.println("오늘의 점심 메뉴는 : "+ royalfoodArr[royal]+"입니다");
		}
	
		
		
		
	}//---end of  main
}
