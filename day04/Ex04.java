package day04;

/*  1000~3000 사이의 숫자를 입력받아서     
   이 숫자를 년도로 하는 해가 윤년인지 평년인지 판별해주는 프로그램을 작성하세요.
  (참고) 윤년은 4로 나누어 떨어지고 100으로 나누어 떨어지지 않고, 400으로 나누어 떨어지는 해 */



import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		//입력도구 준비
		Scanner sc=new Scanner(System.in);
		//입력메세지 출력
		System.out.print("년도 입력: ");
		//입력내용 기억하고
		int year=sc.nextInt();
		//외부장치 연결 해제
		sc.close();
		
		//결과 변수 만들고
		String result="평년";
		
		//판별하고
		if(year % 400 ==0)  {
			result="윤년";
			
			
		}else if(year % 100==0) {
			result="평년";
			
			
		} else if(year % 4 == 0) {
		  result="윤년";	
		}
		
         System.out.printf("입력받은 연도는 %4d이고 \n  "   
        		 +  " 이 해는 %2s 입니다.  ", year,  result);
         
         
		//결과 출력

	}

}



























