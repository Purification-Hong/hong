package day09;
/*
 Circle타입의 데이터를 5개 관리하는 배열을 만들어서 정보를 출력해보자
  
 
 */
public class Test02_CircleArray {

	public static void main(String[] args) {
		Circle[] won= new Circle[5];
		
		//각 방에 Circle을 만들어서 채워넣는다
		for (int i = 0 ; i < 5 ; i++) {
			//원의 반지름 준비하고
			int r = (int)(Math.random() * 20 +1);
			//원 만들고
			Circle c= new Circle() ;
			//원의 둘레 싯팅하고
			c.setArround();
			//원의 면적 셋팅하고
			c.setArea();
			//배열의 각방에 채워넣는다
			won[i]=c;
			
		}
		
		//정보출력
		for(int i = 0 ; i < 5 ; i++) {
			System.out.printf("%d번째 원의 반지름 :   %2d, 둘레 :  %6.2f,  넓이 : %7.2f \n ",
					(i+1), won[i].rad, won[i].arround, won[i].area);
			
			
			
		}

	}

}












