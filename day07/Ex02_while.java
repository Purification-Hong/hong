package day07;
/*
  1-2+3-4+5-6+...로 진행할 경우 결과가 100을 넘어서는 숫자는 몇인지 출력
  
  힌트) 
  1 * -1 = -1
  -1 * -1 = 1
 */
public class Ex02_while {

	public static void main(String[] args) {
		int result=0;
		int number=1;
		int count =1;
		
		while (result<=100) {
			if (count %2 ==1) {
				result += number;
			}else {
				result -= number;
			}
			number +=1;
			count += 1;
		}
		System.out.println(number-1);
	}
}
