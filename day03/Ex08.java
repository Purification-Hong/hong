package day03;
/* 	8. 랜덤하게 두개의 숫자를 발생시켜서 작은 숫자부터 출력하는 프로그램을 작성하세요   */
public class Ex08 {
	public static void main(String[] args) {
		
		//랜덤하게 숫자 두개 만들고
		int no1=(int)(Math.random()*(99-10+1)+10);
		int no2=(int)(Math.random()*(99-10+1)+10);
		
		//판별해서 결과 만들고
		/* 1. 삼항 조건 처리 연산자
		String result=(no1<no2)? no1+ " , " +no2 : no2 + ", " + no1;
		*/
		// 2. if-else 명령으로 처리하는 방법
		/*int min=no1;
		int max=no2;
		
		if (no1 > no2) { //조건식이 거짓인 경우는 이 블럭은 실행하지 않는다.
			min=no2;
			max=no1;
		} else {    
			min=no1;
			max=no2;
		}
	String result=min+ ","+max; */
		
	
		
		// 2-1 if-else
		String result="";   // 아직 result가 어떻게 될지 모르니 우선 이렇게..
		if(no1>no2) {
			result=no2 +","+no1;
			
			
		}else {
			result=no1 +","+no2;
			
		}
		
	

		
		//출력
		
		System.out.printf("랜덤하게 발생시킨 두 수 no1 : [%2d], no2 : [%2d]를 순서대로 나열하면 \n", no1, no2);
		System.out.printf(result + "입니다.");
		
		
		
	 }
	}

