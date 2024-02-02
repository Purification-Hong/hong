package day03;
/* 	7. 랜덤하게 숫자 하나를 발생시켜서 이 숫자에 가장 가까운 10의 배수를 찾아서 출력하여라  
  예) 27->30이 가깝고, 52-->50이 가깝다 
       27%10==> 7>=5
       52%10==> 2<5    */
public class Ex07 {
	public static void main(String[] args) {
		//랜덤한 숫자 만들고
		int num=(int)(Math.random()*(99-10+1)+10);
		//10으로 나눈 나머지를 알아내고
		int rest=num%10;
		//10으로 나눈 몫을 알아낸다
		int result=num/10;
		//조건 처리 한다
		
		/*
		//1. 삼항 조건 처리 연산자 이용
		
		result=(rest>=5)? (result+1)*10:result*10;     */
		/*
		// 2. if를 이용
		
		if(rest>=5) {
			
			result=(result+1)*10;
		}
		result=result*10;
		
		
		*/
		/*
		//3.if-else
		
		if(rest<5) {
			result=result*10;
		}else {
			result=(result+1)*10;
			
		}  */
		//4. if-else if-else
		/*
		if (rest < 5) {
			result=result*10;
		}else if(rest >= 5) {
			
			result=(result+1)*10;
		}   */
		
		
		//5. switch-case
		switch(rest / 5) {
		case 0:
		  result=result*10;
		  break;
		case 1:
		  result=(result+1)*10;
		  break;
		
		}
		
		//결과출력
		
	System.out.println("랜덤한 숫자:  "  +num);
	System.out.println("가까운 10의 배수 :  "  + result);
	}
}






















