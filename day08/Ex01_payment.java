package day08;


import java.util.Arrays;

/*   1.  79456원을 지불하려하는데 위에 준비된 화폐단위로 몇 장 씩 지불해야 하는지 계산해서 출력해주는 
프로그램을 작성하세요

2. 지불될 장수를 기억할 배열을 만들어서 채우고 내용을 출력하세요 

*/
public class Ex01_payment {

	public static void main(String[] args) {
		int [] coin= {10000,5000,1000,500,100,50,10,1};
		int [] pay = new int[coin.length];

	/*	for(int c : coin) {   //배열에 있는 데이터를 순차적으로 하나씩 꺼내서 변수 c에 입력
			System.out.println(c);
			
			int a=79456;	
		} for (int i = 0 ; i < 7 ; i ++) {
		  int b=a /10000;
		  System.out.println(b);
		
		}  */
		
		int money=79456;
		int calc=money;
		
		/*  for(int i = 0 ; i < coin.length ; i ++){   
			int qt=calc/coin[i];
			System.out.printf("%5d :  %2d  \n", coin[i], qt);
			calc=calc%coin[i];   */
		
		for (int i = 0 ; i <coin.length ; i++) {   //배열로 작성
		pay[i]=calc/coin[i];
		calc = calc % coin[i];
		}
		for(int i = 0 ; i <coin.length ; i++) {
			System.out.printf("%6d : %2d \n", coin[i], pay[i]);
			
			
			//2차원 배열에 기억
			int[][] payment = new int [2][coin.length];  //이 배열은 int배열을 관리하는 배열
			payment[0] = coin;
			payment[1] = pay;
			
			System.out.println();
			
			
				
			}
		for(int i = 0 ; i < payment[i].length ; i++) {
			System.out.printf("%6d : %2d \n", payment[0][i], payment[1][i]);
		}
		System.out.println("********************");
		
		int[][] jibool=new int[2][coin.length];
		//coin 깊은 복사
		System.arraycopy(coin, 0, jibool[0], 0, coin.length);
		
	/*	jibool[0][coin.length -1]=50000;
		System.out.println("jibool :  "+ Arrays.toString(jibool[0]));  
		System.out.println("coin :  "+ Arrays.toString(jibool[0]));  */
		
		for(int i = 0 ; i < jibool[0].length ; i++) {
			
			
			
		}
		
		
	}
}
	



















	

