package day03;
/* 숫자가 짝수인지 홀수인지 판별하세요. */
public class Test12 {
	public static void main(String[] args) {
		int no= (int) (Math.random() * (200-50+1)+50);
		
		/*
		
		String result="";
		
		if (no % 2 ==0){
			
			result="짝수";
			
			
		}
		
		if(no % 2 ==1) {
		
		result="홀수";
		
		
		
		  }   */
		
		String result="홀수";
		if(no % 2 == 0) {
			
			result="짝수";
		}
		
		// 출력
		
		System.out.printf ("랜덤한 숫자 %3d은  %2s입니다.  ",  no, result );
		}
		
		
		
	}

