package day04;
/*  1000~3000 사이의 숫자를 입력받아서     
이 숫자를 년도로 하는 해가 윤년인지 평년인지 판별해주는 프로그램을 작성하세요.
(참고) 윤년은 4로 나누어 떨어지고 100으로 나누어 떨어지지 않고, 400으로 나누어 떨어지는 해 */

import java.util.*;

public class Ex04_01 {

	public static void main(String[] args) {
		//입력 도구 준비
		Scanner sc=new Scanner(System.in);
		//입력 메시지
		System.out.print("년도 입력: ");
		//입력 내용 기억
		int year=sc.nextInt();
		
		//결과 변수 준비
		String result="";
		
		//삼항 조건 처리 연산자로 판별하고
		result=(year%400==0)   ?  //조건식이 참인경우
				"윤년": //조건식이 거짓인 경우
			          (year%100==0)? //100으로 나누어 떨어지는 경우
							"평년": //100으로 나누어 떨어지지 않는 경우
								(year % 4 == 0 ) ?	
										"윤년":  "평년";
			
		//출력
		System.out.printf("입력된 게시글 수는 %3d이고 \n" +  
				 "필요한 페이지 수는 %2d입니다", year, result);
		
		
	}
	
}
