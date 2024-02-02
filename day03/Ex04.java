package day03;
/* 3자리 숫자를 랜덤하게 발생시켜서 백자리 미만은 버리는 백단위 숫자를 만들고 출력하세요.
      예) 999가 나오면 900으로 출력시키면 된다.  */
public class Ex04 {
	public static void main(String[] args) {
		
		int no=(int) (Math.random() * (999-100+1) +100);
		int result=no-(no % 100);
		
		System.out.println(no + "의 100단위 숫자:  " +result);
		
	}
}
