package day08;

public class Ex02_01 {

	public static void main(String[] args) {
		double pi=3.14;
	double [][] circle = new double[3][5];
	//반지름 입력하고 circle[0][0~4]
	for(int i=0 ; i < 5 ; i ++) {
	
		circle[0][i]=(int)(Math.random()  * 20 +1);
		
	}
			//둘레 계산해서 입력하고
	for(int i = 0 ; i < 5 ; i ++) {
		//double d=   2 * pi  *  circle[0][i]  ;
		circle[1][i]= 2 * pi  *  circle[0][i]  ;
	}
	for(int i = 0 ; i < 5 ; i ++) {
		
		circle[2][i]= circle[0][i] * circle[0][i] * pi;
	
	}
	for(int i = 0 ; i < 5 ; i ++) {
		System.out.printf("반지름 : %2.0f, 둘레 : % 5.2f, 넓이 : %7.2f\n " , 
				circle[0][i], circle[1][i], circle[2][i]);
		
	}
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	