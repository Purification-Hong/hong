package day02;
/*
  main 함수를 작성하고 실행 내용은 오늘 데이터 [ 날짜_문자열, 수업시작 후 일 수_정수, 오늘 수업 시간 수_정수,
                                     오늘 요일_문자, 오늘 출석 여부_논리형]를 기억할 변수를 만들고, 이 변수들을 출력하시오
                                     
 */
public class Ex01 {
	public static void main(String[] args) {
		String date;
		int days;
		int hours;
		char day2;
		boolean onoff;
		
		date="2024년 01월 30일";
		days=2;
		hours=16;
		day2= '화';
		onoff= true;
		
			System.out.println("DATE: "+ date);
			System.out.println("DAYS: "+ days);
			System.out.println("HOURS: "+ hours);
			System.out.println("오늘 요일: "+ days);
			System.out.println("출석했어?: "+ onoff);
		
		
	}
}
