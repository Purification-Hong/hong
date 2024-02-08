package day08;

public class Test02_array {

	public static void main(String[] args) {
		char[] ch= new char[10];
		
		for(char c : ch) {   //배열에 있는 데이터를 순차적으로 하나씩 꺼내서 변수 c에 입력
			System.out.print((int)c + " | ");
			
		}
		System.out.println();
		//while 반복문으로 출력
		
		int i=0;
		while(i < ch.length) {
			
			System.out.print((int)ch[i] + " | ");
			
			i++;
		}
	}
}
