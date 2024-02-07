package day07;
/* 피보나치 수열의 숫자 10개를 기억하는 배열을 완성하고 출력  */
 
public class Ex03_Fibonacci {

	public static void main(String[] args) {
			/* int abc[]= {1,2,3,4,5,6,7,8,9,10};
			int fi=0;
			int se=0;
			
			while 
			
			
			System.out.println();   */
		
		int[] fib = new int[10];
		
		fib[0]=1;
		fib[1]=1;
		
		for(int i = 2; i < 10 ; i ++) {
			int no1=fib[i-2]; //현재 위치의 전전 데이터
			int no2=fib[i-1];  //현재 위치의 전 데이터
			fib[i] = no1 + no2;
		}
		for(int no :fib) {
			System.out.printf(" %2d  |  ", no);
		}
		//System.out.printf(" %2d  |  ", no);
		}
}
