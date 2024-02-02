package day03;
/* 54232원 물건을 구매했다. 이 금액은 우리나라 화폐로 각각 몇장씩 지불해야 하는지
 계산하시오*/
public class Test07 {
	public static void main(String[] args) {
		int money=54232; //계산변수
		int tmp=money;
		
		int oman=tmp/50000;  //오만원권 계산
		tmp=tmp%50000; //tmp %=50000;
		
		int man=tmp/10000; //만원권 계산
		tmp %= 10000;
		
		int ochun=tmp/5000; //오천원권 계산
		tmp %= 5000;
		
		int chun=tmp/1000; //천원권
		tmp %= 1000;
		
		int obek=tmp/500; //오백원권
		tmp %=500; 
		
		int bek=tmp/100; //백원권
		tmp %=100;
		
		int osip=tmp/50; //오십원권
		tmp %=50; 
		
		int sip=tmp/10; //십원권
		tmp %=10; 
		
		int il=tmp; // 일권
		
		System.out.println("지불할 금액:  "  + money);
		System.out.println("오만원권:  "  + oman);
		System.out.println("만원권:  "  + man);
		System.out.println("오천원권:  "  + ochun);
		System.out.println("천원권:  "  + chun);
		System.out.println("오백원권:  "  + obek);
		System.out.println("백원권:  "  + bek);
		System.out.println("오십원권:  "  + osip);
		System.out.println("십원권:  "  + sip);
		System.out.println("일원권:  "  + il);
		
		
	}
}
