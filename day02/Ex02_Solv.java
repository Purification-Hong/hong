package day02;

/*
 이것은 주석기호 : 프로그램 실행에 있어 전혀 방해하지 않는 문자열을 의미한다.
 주석은 해당 명령에 대한 설명을 주로 적는 것이 일반적이다. 따라서 팀작업에서는 매우 중요한 요소다.
 */

// 이것은 단일행 주석이다. 행마다 주석을 별도로 처리해주는 형식.
// 이렇게 행이 바퀴면 단행일 주석은 다시 처리해주어야 한다.

/* 
	  EX01)
	 두 사람이 등산을 한다. 산의 정상의 높이는 1753m이고   A라는 사람은 초당 0.75M로 이제 산을 오르려 하고,
	 나머지 B는 정상에서 초당 1.03M로 하산한다. 두 사람은 몇초 후에 만나는지 출력하세요.
 */
public class Ex02_Solv {
	public void abc() {
		System.out.println(" 여기는 abc 함수!");
	}
	public static void main(String[] args) {
//		System.out.println(" 여기는 main 함수!");
     
		
	//변수 준비	
     double h;
     int t;
     double a;
     double b;
     
     
     //변수들의 초기값을 셋팅
     
     h=1753.0;
     t=0;
     a=0.0; b=h;
     
     //a의 고도가 낮을 때는 아래 반복문을 계속 수행을 할 것이고,
     //a의 고도가  b보다 높아지는 순간 아래 반복문 종료.
     while(a<b) {
    	t=t+1;
    	a=a+0.75;
    	b=b-1.03;
    			 
     }
    	// 여기는 a의 고도가 b보다 높아진 순간 위 반복문이 종료된 시점이므로
     //여기서는 시간 t를 출력만 하면 된다.
     
     System.out.println("A가 B와 만난 직후 흐른 초:" + t);
     System.out.println("A가 B와 만난 직후 흐른 " + t/60 + "분");
	}
	int ab=999;
}














