package day08;
/* 1. 반지름 (1~20) 5개를 기억할 배열을 만들고 랜덤하게 반지름을 채워서 원의 넓이, 둘레를 출력하는 프로그램을 작성하시오 
   2. double[][] circle = new double[3][5]; 의 배열에 반지름, 둘레, 넓이를 기억시키고 출력
   3. 2번에서 완성한 2차원 배열을 double[][] dongl = new double[5][3];
   								dongl 배열에 채워넣으세요   */

public class Ex02_circle_array {

	public static void main(String[] args) {
		//1. 반지름 (1~20) 5개를 기억할 배열을 만들고 랜덤하게 반지름을 채워서 원의 넓이, 둘레를 출력하는 프로그램을 작성
		int[] rad = new int[5];  //반지름 기억할 배열 준비
		
	//반지름을 랜덤하게 만들어서 채워준다
		for(int i = 0 ; i < 5 ; i ++) { 
			
			//랜덤한 반지름 만들고
			int r= (int)(Math.random()  * 20 +1   );
			//만들어진 반지름 채우기
			rad[i]=r;
		}
			//원의 둘레 계산해서 출력
			// 공식] 2*3.14*반지름
			for (int i = 0 ; i < 5 ; i ++) {
				int r = rad[i];
				double pi=3.14;
				//넓이 계산
				double area = 2 * pi * r;
				//계산 결과 출력
				System.out.printf("반지름 :   %2d, 둘레 : %6.2f \n " , r, area );
			}
			System.out.println("****************");
			System.out.println();
			double[] arround= new double[5];
			for(int i = 0 ; i < 5 ; i++) {
				int r = rad[i];
				double pi=3.14 ;
				double ar = 2 * pi * r;   // i번째 반지름으로 계산한 결과를 i번째 둘레에 채워준다
				arround[i]= ar;
			}
			//결과출력
			for ( int i= 0 ; i < 5 ; i++) {
				int r = rad[i];
				double ar=arround[i];
				System.out.printf("반지름: %2d, 둘레: %6.2f  \n"   , r, ar);
			}
			
			//넓이
			 double pi=3.14;   //전역으로 빼놓으면 매번 pi안만들어도됨
			 for ( int i= 0 ; i < 5 ; i++) {
				 //반지름 꺼내고
				 int r = rad[i];
				 //넓이 계산하고
				 double area=r * r * pi;
				 //출력하고
				 System.out.printf("반지름 : % 2d , 둘레 : % 6.2f\n", r, area);
				 
				 
				 
			 }
			//넓이를 배열에 채워보자
			 //넓이 배열 준비
			 double[] area= new double[5];
			 	for(int i = 0 ; i < 5 ; i ++) {
			 		
			 		
			 		
			 		
			 	}
			
			
			
			
			
		}
	}




















