package my.day17;

public class ExeptionTest1 {

	public static void main(String[] args) {
		
		
		String[] subjectArr = {"java","Oracle","JSP"};
		try {
			for(int i=0; i<subjectArr.length+1;i++) {
				System.out.println(subjectArr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {//예외절 or 오류
			System.out.println("배열의 인덱스 범위 초과되었습니다.");
		}
		
		

	}

}
