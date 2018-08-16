package my.day8;

public class ArrayTest1 {
	/*
    === 배열(Array)이란 ? ===
        동일한 데이터타입을 가지는 여러개의 데이터를 담을 수 있는 데이터 타입을 말한다.
        그리고 배열 또한 객체라는 것을 꼭 기억하도록 하자!!!!  
*/
	public static void main(String[] args) {
	//시험 과목 성적(국어, 영어, 수학, 사회, 과학, 체육, 음악 ...)
	int kor = 100, eng = 90, math = 95, society = 70, science = 98, physical =100, music = 90 ;
	
	int total = kor+eng+math+society+science + physical+music;
	System.out.println("총점 : "+total);
	System.out.println("평균 : "+Math.round(((double)total/7)*10)/10);
	
	System.out.println("\n----------------------");
	System.out.println("\n=====배열=====");
	
	//1) 배열의 선언.
	int[] subject;// : int 타입을 가지는 배열
	//또는 int subject[];
	
	
	//2) 메모리에 할당.
	
	subject = new int[7];//7개의 배열을 갖는다. 하나의 객체
	/*
	배열로 선언된 변수에는 자동적으로 초기값이 들어가 있다.
	정수는 =0, 실수는 0.0, char 는 ' ', String을 포함한 객체는 null 이 들어간다.
	
	---------------------------------------------------------------------------
	1001호 | 1002호 | 1003호| -> 방하나의 번호를 인덱스라고 한다.
	0번째 방 | 1번째 방| 
	---------------------------------------------------------------------------
	0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
	-> 위의 숫자는 배열의 인덱스를 가리키는 번호로서 0부터 1씩 증가한다.
	----------------------------------------------------------------------------
	배열의 저장된 데이터를 표현 할때는 아래와 같이 배열명[인덱스번호]로 나타낸다.
	subject [0],subject [1],subject [2],subject [3],subject [4],subject [5],subject [6],subject [7]
	
	*/
	
	System.out.println("배열 subject 의 길이 : "+subject.length);
	System.out.println("");
	for(int i=0;i<subject.length;i++)
	{
		System.out.println("subject["+i+"]");
		/*
		 	subject[0]
			subject[1]
			subject[2]
			subject[3]
			subject[4]
			subject[5]
			subject[6]
 
		 */
	}
	System.out.println("\n----------------------");
	for(int i=0;i<subject.length;i++)
	{
		System.out.println("subject["+i+"] => "+subject[i]);
		/*	 배열의 초기 값.
				 	subject[0] => 0
					subject[1] => 0
					subject[2] => 0
					subject[3] => 0
					subject[4] => 0
					subject[5] => 0
					subject[6] => 0
 
		 */
	}
	System.out.println("\n----------------------");
	// 3)데이터 초기화.
	subject[0] = 100;
	subject[1] = 90;
	subject[2] = 95;
	subject[3] = 70;
	subject[4] = 98 ;
	subject[5] = 100;
	subject[6] = 90;
	for(int i=0;i<subject.length;i++)
	{
		System.out.println("subject["+i+"] => "+subject[i]);
		/*	 데이터 초기화
				 	subject[0] => 100
					subject[1] => 90
					subject[2] => 95
					subject[3] => 70
					subject[4] => 98
					subject[5] => 100
					subject[6] => 90
 
		 */
	}
	
	System.out.println("\n----------------------");
	total=0;
	for(int i=0;i<subject.length;i++)//subject.lengtn = 7 -> 7번 반복
	{
		total +=subject[i];
	}
	System.out.println("total = "+total);
	
	
	System.out.println("\n----------------------");
	/*
	 위의 1) 배열의 선언과 2)메모리에 할당 을 해주는 것을 따로 하지 않고, 아래와 같이 동시에 하는 것을 많이 사용한다.
	*/
	int[] guamok=new int[7];//guamok 은 int 타입을 가지는 배열인데 선언과 동시에 7개의 배열을 갖는다.
	
			guamok[0] = 100;
			guamok[1] = 90;
			guamok[2] = 95;
			guamok[3] = 70;
			guamok[4] = 98;
			guamok[5] = 100;
			guamok[6] = 90;
	
	for(int i=0;i<guamok.length;i++)
		{
			System.out.println("guamok["+i+"] => "+guamok[i]);
			/*	 데이터 초기화
					guamok[0] => 100
					guamok[1] => 90
					guamok[2] => 95
					guamok[3] => 70
					guamok[4] => 98
					guamok[5] => 100
					guamok[6] => 90
	 
			 */
		}
	
	System.out.println("\n----------------------");
	total=0;
	for(int i=0;i<guamok.length;i++)//subject.lengtn = 7 -> 7번 반복
	{
		total +=guamok[i];
	}
	System.out.println("total = "+total);
	System.out.println("평균 : "+Math.round(((double)total/7.0)*10)/10);
	
	System.out.println("\n----------------------");
	
	// 위의 1) 배열의 선언과 2)메모리에 할당 3) 데이터 초기화를  해주는 것을 따로 하지 않고, 아래와 같이 동시에 하는 것을 많이 사용한다.
	int[] course=new int[] {100,90,95,70,98,100,90};
	
	for(int i=0;i<course.length;i++)
	{
		System.out.println("course["+i+"] => "+course[i]);
		/*	 데이터 초기화
			course[0] => 100
			course[1] => 90
			course[2] => 95
			course[3] => 70
			course[4] => 98
			course[5] => 100
			course[6] => 90
 
		 */
	}
	total=0;
	for(int i=0;i<course.length;i++)//subject.lengtn = 7 -> 7번 반복
	{
		total +=course[i];
	}
	System.out.println("total = "+total);
	System.out.println("평균 : "+Math.round((double)total*10.0/7)/10);
	
	System.out.println("\n----------------------");
	
	/* 위의 1) 배열의 선언과 2)메모리에 할당 3) 데이터 초기화를  해주는 것을 따로 하지 않고, 아래와 같이 동시에 하는 것을 많이 사용한다.
	
	new int[]은 생략가능하다.
	
		*/
	
	int[] course2= {100,90,95,70,98,100,90};
	
	for(int i=0;i<course2.length;i++)
	{
		System.out.println("course2["+i+"] => "+course2[i]);
		/*	 데이터 초기화
			course2[0] => 100
			course2[1] => 90
			course2[2] => 95
			course2[3] => 70
			course2[4] => 98
			course2[5] => 100
			course2[6] => 90
 
		 */
	}
	total=0;
	for(int i=0;i<course2.length;i++)//subject.lengtn = 7 -> 7번 반복
	{
		total +=course2[i];
	}
	System.out.println("total = "+total);
	System.out.println("평균 : "+Math.round((double)total*10.0/7.0)/10.0);
	
	System.out.println("\n----------------------");
	//배열 또는 collection 에서 사용되어지는 개선된(확장된) for 문.
	
	//for(:) -> for(배열요소데이터형 변수형 : 다음에 배열명 또는 collcection 명) 	
		total =0;
		
		for(int jumsu: course2)//자동적으로 배열의 갯수만큼 반복.
		{
			//course2.length 만큼 반복
			//맨처음 int jumsu = course[0] ; course2에 있는 0번째 인덱스 값.
			//두번째 int jumsu = course[1]
			//...
			//마지막 int jumsu = course[6]
		total +=jumsu;
		}
		System.out.println("total = "+total);
		System.out.println("평균 : "+Math.round((double)total*10/7)/10.0);
	
	
	
	
	
	
	
	
	
	
	
	
	}//---end of main
}
