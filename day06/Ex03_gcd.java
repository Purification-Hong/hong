package day06;
/* 문제3) 두 정수를 입력받아서 두 수의 최대공약수를 구해서 출력
참고) 최대공약수: 두 수의 약수 중 제일 큰 수  */

import java.util.*;
public class Ex03_gcd {

	public static void main(String[] args) {
		//입력도구 준비
	Scanner sc=new Scanner(System.in);
	//입력메시지 출력-두번
	System.out.print("첫번째 숫자: ");
	//입력받아서 기억-두번
	int no1=sc.nextInt();
	//두번째 숫자
	System.out.print("두번째 숫자: ");
	int no2=sc.nextInt();
	//스캐너 닫기
	sc.close();
	
	//최대공약수 구하기
	//결과값 변수 만들어 놓기
	int gcd=0;
	//작은수 알아내고
	//삼항 연산자로 하는 방법
	//int no=(no1<no2)? no1:no2;
	
	
	//if문으로 하는 방법
	int no=no2;
	if(no1<no2) {
		no=no1;
	}
	//반복해서 나누기
	for(;;) {
		if(no1 % no == 0 && no2 % no==0) {
			//나눠지는 수를 찾은 경우이므로 즉시 종료
			gcd=no;
			break;
		}
		no=no-1;
	}
	//결과출력
	System.out.printf("입력받은 두 수 [%3d] , [%3d]의 최대 공약수는 [ %3d ] 입니다", no1, no2, gcd);
	
		

	}

}



















