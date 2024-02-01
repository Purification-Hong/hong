package day04;
/* 랜덤하게 0~ 100까지 숫자를 세개를 발생시켜 큰 숫자만 출력해주는 프로그램을 작성하여라. 
    
    숫자를 순서대로 나열해서 출력하세요.
 */
public class Ex01 {
	
	public static void main(String[] args) {

		int a=(int)(Math.random()* (99-1+1)+0);
		//System.out.println(a);
		
		int c=(int)(Math.random()* (99-1+1)+0);
		//System.out.println(c);
		
		int d=(int)(Math.random()* (99-1+1)+0);
		//System.out.println(d);
		
     int max=a;
     if(c> max) max=c;
     if(d > max)  max=d;
     
     System.out.println(max);
     
	}
	
}
			
	
		
		

