package day08;
/*   1.  79456원을 지불하려하는데 위에 준비된 화폐단위로 몇 장 씩 지불해야 하는지 계산해서 출력해주는 
프로그램을 작성하세요

2. 지불될 장수를 기억할 배열을 만들어서 채우고 내용을 출력하세요 

*/
public class Ex01_payment {

	public static void main(String[] args) {
		int [] coin= {10000,5000,1000,500,100,50,10,1};
		int [] pay = new int[coin.length];

		for(int c : coin) {   //배열에 있는 데이터를 순차적으로 하나씩 꺼내서 변수 c에 입력
			System.out.println(c);
			
			int a=79456;	
		} for (int i = 0 ; i < 7 ; i ++) {
		  int b=a /10000;
		  System.out.println(b);
		
		}  
		
	}

}
	

	

