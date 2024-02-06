package day07;
/*반복문중에서 후조건 처리 명령이다. 조건이 최악의 경우라도 최소 한번은 실행문을 실행하는 반복문이다
  형식) do {
   실행내용...
  } while(조건식);
  
  */
public class Test01_do_while {
// 2단 구구단 출력하기~!
	public static void main(String[] args) {
		int dan=2;
		int gop=1;
		
		do {
			System.out.printf("%d  x  %d = %2d \n", dan, gop, dan*gop++);
		}while (1==2);
		

	}

}
