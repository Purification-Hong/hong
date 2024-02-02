package day02;

public class Test06 {
	public static void main(String[] args) {
		double pi=3.1415;
		float pi1; 
		/* 작은 형태의 데이터를 기억할 변수에 큰 형태의 데이터를 기억하는 경우 에러가 발생한다.
		  담을 그릇이 더 크기 때문에 넘쳐나서 문제가 되기 때문이다.
		 이런 경우, 해결방법은
		  1) 강제형변환  2) 리터럴 형변환
		 */
		
		pi1=3.14F;
		/* 리터럴 형변환의 경우,
		  이 경우 3.14는 float형태로 리터럴 풀에 기억하게 된다.
		 
		 */
//		float pi2=pi;
		/*
		 강제형 변환의 경우,
		 이 경우 pi에 기억된 데이터는 double형태의 데이터이기 때문에 안된다. 따라서 강제로 데이터의 형태를 변형해서 
		 기억시키는 방법이 강제 형변환이다.
		 
		 */
		long no = 10L;
		int no1;  //리터럴
		no1=(int)no;
		
		
		short no2;
		no2=(short)no;
	
		
	}
}
