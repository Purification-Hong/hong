package day04;
/* 게시판에 게시물을 15개 게시할 수 있다.
 랜덤하게 게시물 수를 입력받아서 (100이상....) 필요한 페이지 수를 계산해서 출력해주는 프로그램을 작성
 
 [참고]
   게시물이 없어도 1페이지는 필요하다.   */

import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		//입력 도구 준비
		Scanner sc=new Scanner(System.in);
		//입력 메시지 출력
		System.out.print("총 게시글 수:  ");
		//입력받아서 기억
		int contents=sc.nextInt();
		//페이지수 계산
		int pages=0;
		
		if(contents % 15==0) {   //게시물이 없는 경우 그리고 15로 나누어 떨어지는 경우
			if(contents==0) {  //게시글이 없는 경우
				pages=1;
			}else {  //15로 나누어 떨어지는 경우
				pages=contents/15;
			}
			
		} else {
			//15로 나누어 떨어지지 않는 경우
			pages=contents/15+1;
		}
		//결과출력
		System.out.printf("입력된 게시글 수는 %3d이고 \n" +  
		 "필요한 페이지 수는 %2d입니다", contents, pages);
	}
}
