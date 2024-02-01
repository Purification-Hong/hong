package day04;
//랜덤하게 알페벳 소문자 10개를 만들어서 단어를 만들어서 출력하세요

public class Test05_for_char {

	public static void main(String[] args) {
	/*블럭 내에서 변수를 생성하게 되면 블럭 밖에서 사용할 수 없기 때문에, 결과값 변수를 미리 만들어준다.
			//(int)(Math.random()*26)
			int no='a';
			char ch= (char)(no+1);
			
			System.out.println(no);
		*/
	String result="";
	
                 //10번 반복
	for (int i=0; i<10; i++) {
		//랜덤하게 0~252까지의 숫자 하나를 만든다.
		int num=(int)(Math.random()*26);
		char ch=(char)('a' + num);  //강제형변환
		
		//결과값 변수에 덧붙여준다.
		
		result+=ch;
		//System.out.println(ch);
	}
	//출력
	System.out.println("내가 만든 단어:  "+result);
	
	}
	
}
