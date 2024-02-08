package day07;

import java.util.Arrays;

/* 랜덤하게 알파벳 소문자('a' - 'j')를 100개를 만들어서 각 문자가 몇 번씩 만들어 졌는지 출력하세요
 */
public class Test05_count {

	public static void main(String[] args) {
		//배열 준비
		char ch[] = new char[10];
		//알파벳 채우고
		//'a' ->   (char)('a'+ 0)
		//'b'->    (char)('a'+1)
		//'j' -> (char)('j' + 9)
		
		for(int i = 0 ; i <10 ; i ++) {
			ch[i]= (char)('a'+i);
			//ch[i] = (char)('a'  + (Math.random()*10));  // 실수-double을 char로 강제형변환
			
			
			
		}
		//1. 변수 10개를 이용하는 방법
		int a,b,c,d,e,f,g,h,i,j;
		//변수 초기화
		a=b=c=d=e=f=g=h=i=j =0;
		
		for(int z=0; z< 100; z++) {
			//랜덤하게 문자만든다
			char tmp = (char)('a' + Math.random()*10);
			switch(tmp) {
			case 'a':
				a+=1;	break;
			case 'b': b+=1;	break;
			case 'c': c+=1;	break;
			case 'd': d+=1;	break;
			case 'e': e+=1;	break;
			case 'f': f+=1;	break;
			case 'g': g+=1;	break;
			case 'h': h+=1;	break;
			case 'i': i+=1;	break;
			case 'j': j+=1;	break;
			
			}
			
		}
		System.out.println(ch[0] + "  :  "  + a);
		System.out.println(ch[1] + "  :  "  + b);
		System.out.println(ch[2] + "  :  "  + c);
		System.out.println(ch[3] + "  :  "  + d);
		System.out.println(ch[4] + "  :  "  + e);
		System.out.println(ch[5] + "  :  "  + f);
		System.out.println(ch[6] + "  :  "  + g);
		System.out.println(ch[7] + "  :  "  + h);
		System.out.println(ch[8] + "  :  "  + i);
		System.out.println(ch[9] + "  :  "  + j);
		
		
		//System.out.println(Arrays.toString(ch));
	}
}



















