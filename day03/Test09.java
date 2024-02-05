package day03;

import java.util.Scanner;

public class Test09 {
public static void main(String[] args) {
	//별 삼각형 출력
	System.out.println("*");
	System.out.println("**");
	System.out.println("****");

	
	/* 삼항 조건 연산자
	 형식)    (조건식) ? 참일때 반환값:거짓일때 반환값 */
	
	
	
   //정수를 입력받아서 그 수가 짝수인지 홀수인지를 출력하세요~~
	
	Scanner sc=new Scanner(System.in); //입력도구 준비
    System.out.print("정수 입력:  ");  //입력메시지 출력
       int num=sc.nextInt();  //입력받은 숫자 기억
                              //짝수 또는 홀수 판별
       
       String result="";   //결과변수 만들고
      result=(num % 2 ==0) ? "짝수" : "홀수"; //판별하고
      
     /* if( num % 2 == 0) {
        result= "짝수";
        
        } else {
            result= "홀수";
        
        }    */ 
       
                System.out.println("입력받은 정수:  "+num + "는" + result + "입니다");  //출력
			
	
	
	
	
	
   }
}
