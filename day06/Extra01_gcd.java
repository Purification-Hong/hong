package day06;
/* 두 수를 입력받아서 유클리드 호제법을 이용해서 최대공약수를 구하기 */

import java.util.*;
public class Extra01_gcd {

	public static void main(String[] args) {
		//입력도구
		Scanner sc=new Scanner(System.in);		
		//첫번째 숫자 입력메시지
		System.out.print("첫번째 숫자 : "  );
		//첫번째 숫자 입력받아 기억
		int no1=sc.nextInt();
		//두번째 숫자 입력메시지
		System.out.print("두번째 숫자: ");
		//두번째 숫자 입력받아 기억
		int no2=sc.nextInt();
		
		//결과 변수 만들기
		int no=no1;
		int gcd=no2;
		
		//반복해서 나누기
		while(true) {
			if(no % gcd ==0) {
				break;
			}else {
				int tmp=gcd;
				gcd = no % gcd; 
				no = tmp;
			}
		}
		//최소공배수
		int lcm=no1*no2/gcd;
		//결과 출력
		System.out.printf("입력받은 두 수 [%d ], [%d]의 %n 최대공약수는 [%d]이고 %n 최소공배수는 [%d]입니다", no1, no2, gcd,lcm);
	}

}
