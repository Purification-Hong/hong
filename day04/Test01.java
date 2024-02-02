package day04;
/* 1~99 사이 까지의 랜덤한 숫자 하나를 만들어서 나이라고 가정하고 나이대가 어떻게 되는지 판별해주는 프로그래밍 작성
    유년기
    10대
    20대
    30대
    40대
    장년기   로 구분처리하시오.
 */
public class Test01 {
	public static void main(String[] args) {
		/*int num=(int)(Math.random()*(99-9+1)+1);
		int age;
		
		switch(num) {
	
		case 0:
			age= num
			break;
			
case 1:
			
			break;
case 2:
	
	break;
case 3:
	
	break;
case 4:
	
	break;
case 5:
		
		
		}
	} */
	
		//할일
		//1.랜덤하게 나이 만들고
		int age=(int)(Math.random()*99+1);
		//2.결과변수 만들고
		String result="";
		//3.조건처리해서 결과만들고
		/*if(age <10) {
		result="유년기";
		} else if( age <20){  
			result="10대";
		}else if(age <30){
			result="20대";
		}else if(age <40){
			result="30대";
		}else if(age <50){
			result="40대";
		}else {
			result="장년기";
			
		} */
		
		/*if(age >=50) {
		}else if(age>=40) {
			
			result="장년기";
		}else if(age>=30) {
			result="40대";
		}else if(age>=20) {
			result="30대";
		}else if(age >=10) {
			result="20대";
		}else {
			result="유년기";
		}*/
		
		switch(age/10) {
		case 0:
			result="유년기";
			break;
			
		case 1:
			result="10대";
			break;

		case 2:
			result="20대";
			break;

		case 3:
			result="30대";
			break;

		case 4:
			result="40대";
			break;

		default :
			result="장년기";
			break;

		

		
		}
		
		//4.결과 출력
		System.out.printf("랜덤하게 만든 나이 %2d는 %3s 입니다.", age, result);
		
		}
	
		
	
		
		
		
		
		
		
}
