package day04;
/* 10~50까지의 숫자를 랜덤하게 만들어서 출력하고 29가 나오는 순간 반복을 종료하세요+반복횟수도 출력  */
public class Test04_for_break {

	public static void main(String[] args) {
		
		int i=0;
		for(;;i++) {  //for명령을 선언할때 () 부분의 내용을 생략할 수 있는데 이 경우 조건식이 항상 "true"로 처리된다.
			       // 즉 무한반복
			
			
         //랜덤한 숫자 만들고

			int no=(int)(Math.random()*41+10);
			
			
			//출력
			System.out.println("랜덤한 숫자: " + no);
			//29인지 판별하고 출력
			if(no==29) {
				System.out.println("프로그램을 종료합니다.");
				break; //의미)현재 실행중인 반복문 또는 switch문을 즉시 종료하세요
				
			}
			
		}
		
		System.out.println((i+1)+  "회 반복");
		System.out.println("이미 반복문이 종료되어서 프로그램 종료 !!");
		
		
	}

}
