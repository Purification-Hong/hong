package day04;
//0~9까지 숫자를 출력
/* for 반복명령
  형식)
       for(카운터변수 선인 및 초기화; 조건식; 증감식){
                   실행명령...
 *                        }
 */
public class Test02_for {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i+ "-" + (i+1));
	}
		//System.out.println(i);   ->for 명령문의 카운터변수 i는 for 명령의 블럭내에서 만들어지는 변수고,
		                      // 따라서 반복문의 실행(블럭)이 끝나는 순간 사라지는 변수.
	}

}

