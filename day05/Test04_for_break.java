package day05;
/* 연산식을 입력하면 연산식의 결과를 출력해주는 계산기를 출력
  단,  Q가 입력되면 프로그램 종료 
 */

import java.util.*;   //스캐너준비해야되니.
public class Test04_for_break {

	public static void main(String[] args) {
	//입력도구 준비하고
		Scanner sc=new Scanner(System.in);
		//반복해서 작업
		for(;;)   {    //for명령의 (;;)안에 조건식을 기술하지 않으면 항상 true로 처리한다.
			
		
		// 입력메세지
			System.out.print("계산식 입력 : ");
		//연산식 기억
		String sik=sc.nextLine();
		
		//프로그램 종료 조건
		if(sik.equals("Q")) {   //종료명령이 입력됬으므로 반복문을 즉시 종료   [sik==o]처럼 하지 마세요
			System.out.println("%%%계산기를 종료%%%");
			System.out.println("====================");
			break;
			
			
		}
		
		//연산기호 위치 알아내고
		int idx=0;
		for (int i=0 ; i<sik.length();i++) {
			char ch=sik.charAt(i);
			if(ch <'0'  || ch >'9') {   //연산기호를 찾은 경우이므로 위치값을 기억시키고 반복문을 즉시 종료
				idx=i;
				break;
				
			}
			/*
			 * 문자열 잘라내기
			 * substring(int beginIndex)
			 * : 시작위치를 지정해서 시작
			 * substring(int beginIndex, int endIndex)
			 * : 시작위치에서부터 종료위치 직전까지 추출
			 */
			
		}
		
		//숫자 꺼내서 변환하고
	
		
		String sno1=sik.substring(0, idx);
		String sno2=sik.substring(idx+1);
		char giho=sik.charAt(idx);
		
		//정수변환
		int no1=Integer.parseInt(sno1);
		int no2=Integer.parseInt(sno2);
		//연산
		double result=0;  //자동형변환
				switch(giho) {
				case '+':
					result=no1+no2;
					break;
				
					case '-':
						result=no1-no2;
						break;
						
					case '*':
						result=no1*no2;
						break;
				
					case '/':
						result=no1/(double)no2;  //강제형변환
						break;
				
					case '%':
						result=no1%no2;
						break;
		
				}
		//출력
				System.out.printf("%s %c %10.2f" , no1, giho, no2, result);
				
		}
	}
}
