package day04;

/* 알파벳을 입력받아서 입력된 문자가 소문자이면 대문자로 대문자이면 소문자로 변환해서 출력하시오./
 
  대문자를 소문자로 변환방법
    (char)(입력한 문자 + ('A'-'a')); 
  소문자를 대문자로 변환방법  
    (char)(입력한 문자 - ('a'-'A'));  */
    


import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		//System.out.println('a'-'A');
		
		//입력도구 준비
		Scanner sc=new Scanner(System.in);
		//입력메시지 출력
		System.out.print("변환할 문자 입력:"  );
		//입력내용 기억
		String str=sc.nextLine();  //문자열과 문자는 전혀별개의 타입니다.  즉 "a"  != 'a'
		sc.close();
		//문자 추출하고
		
		char ch=str.charAt(0);
		//변환작업하고
		
		
		//결과변수 만들고
		String munja="";
		char result=' ';
		
		if(ch > 'Z' ) {
			//소문자인 경우
			munja="소문자";
		    result=(char)(ch-('a'-'A'));
		    
		} else {
			//대문자인 경우
			munja="대문자";
			 result=(char)(ch-('A'-'a'));
		}
		
		System.out.println("입력받은 문자:  "+ ch);
		System.out.println("문자 종류:  "+ munja);
		System.out.println("변환후 문자 :  " + result);
		
		
		//출력
		

	}

}
