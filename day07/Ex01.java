package day07;
/*   다섯자리 숫자를 입력받아서 이 숫자가 회문수 인지 아닌지 판별해서 출력하시오
참고)회문수: 12321  => 회문수 
             12312  => 회문수x
             
             문자열로 해결하고 / 정수로 해결하고/ 배열로도 해결하시오
             
              힌트 1)   12321
                 21  -->12
                 앞자리 두수를 떼어내서 -> 12
                 
              힌트 2) 뒤에서 부터 숫자를 꺼내서 
              
                 맨 뒷자리 수 꺼내는 방법
                 12321 % 10 ---> 1
                 12321 / 10 % 10 -->2
                 
                 0 * 10 + 1 ===>1
                     12321 % 10 ===>1
                     12321 / 10 ===> 1232 
                     
                 1 * 10 + 2 ===>12
                     1232 % 10 ===2
                     1232 / 10 ===>123
                     
                 12 * 10 + 3 ===>123
                 
                 123 * 10 + 2 ===>1232
                 
                 1232 * 10 + 1===> 12321
              
                 
*/
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int no1=sc.nextInt();
		System.out.print("두번째 숫자: ");
		int no2=sc.nextInt();
		System.out.print("세번째 숫자: ");
		int no3=sc.nextInt();
		System.out.print("넷번째 숫자: ");
		int no4=sc.nextInt();
		System.out.print("다섯번째 숫자: ");
		int no5=sc.nextInt();
		
		sc.close();
	}

}
