package day04;
/* 모든 구구단을 출력
   [참고] 반복문도 중첩해서 사용할 수 있다->주의:카운터변수가 중복되지 않도록 한다. */
public class Test09_guguTotal {

	public static void main(String[] args) {
		
    for(int dan = 2; dan <10 ; dan++) {
			for(int gop=1; gop <10; gop++) {
				System.out.println(dan+ "x"  +gop + "=" +dan*gop);
			
			
			}
			System.out.println();
			
	 	}

	}

}
