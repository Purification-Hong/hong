# hong

package day03;
/* 1부터 100사이의 랜덤한 정수를 발생시켜서 그 숫자가 짝수인지 홀수인지 판별해서 출력하세요 */
//참고) 클래스 블럭내에서는 일반 명령은 사용할 수 없다.
// System.out.println()은 일반명령이므로 크랠스블럭 바로 아래에서는 사용할 수 없다
public class Test11 {
	public static void main(String[] args) {
// 1.랜덤하게 숫자 만든다.
		int num = (int) (Math.random() * (100-1+1) +1);
				
 //2. 판별한다.
		String result=(num % 2==0) ? "짝수" : "홀수";
 //3. 출력한다		
  System.out.println("랜덤한 수:  " + num + "는" + result + "입니다.");
	
	}
}
