package day04;
//랜덤하게 숫자 10개를 (1~99사이) 만들어서 출력하여라
public class Test03_for {

	public static void main(String[] args) {
			for(int i=0 ; i<10; i++) {
				int no=(int)(Math.random()*99+1);  //랜덤하게 숫자 만들고
				System.out.println((i+1)+" 번째 숫자 "  + no);  // 출력
				
			}

	}

}
