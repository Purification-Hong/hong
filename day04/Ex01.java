package day04;
/* 랜덤하게 0~ 100까지 숫자를 세개를 발생시켜 큰 숫자만 출력해주는 프로그램을 작성하여라. 
    
    숫자를 순서대로 나열해서 출력하세요.
 */
public class Ex01 {
	
	
	
	public static void main(String[] args) {

	 /* int no1=(int)(Math.random()* (99-1+1)+0);
		//System.out.println(a);
		
		int no2=(int)(Math.random()* (99-1+1)+0);
		//System.out.println(c);
		
		int no3=(int)(Math.random()* (99-1+1)+0);
		//System.out.println(d);
		
     int max=no1;
     if(no2> max) max=no2;
     if(no3 > max)  max=no3;
     
     System.out.println(max);     */
     
		
		
		// 1. 랜덤한 숫자 세개 만들기
		
		int no1=(int)(Math.random()*101);
		int no2=(int)(Math.random()*101);
		int no3=(int)(Math.random()*101);
		
		
		// 2. 가장 큰 수 판별하기
		// 2.1 제일 큰 수 기억할 변수 준비
		int max= -1;
		
		//판별
		//1. 삼항 조건 처리 연산자
		  /* max=(no1>no2) ? 
				 ((no1 > no3) ? no1:no3 ) :  ( (no2>no3) ? no2:no3  ) ; // 거짓인 경우
				 //참인경우   */
		
		if (no1>no2) {  //no1이 no2보다 큰 경우
			
			if(no1>no3) {
				
				max=no1;
				
			}else {    //no1<=no3
				max=no3;
			}
		}else {   //no1이 no2보다 크지 않은 경우 : no1<=no2
			      // no1은 max의 대상에서 제외된 상황
			if(no2>no3) {
				max=no2;
			}else { 
				max=no3;

			}
			
		}
			
		
		// 3. 출력
		 System.out.println("no1 : "  +no1);
		 System.out.println("no2 : "  +no2);
		System.out.println("no3 : "  +no3);
		 System.out.println("제일 큰 수: "  +max);
						 
	
		
	}    
	
}
			
	
		
		

