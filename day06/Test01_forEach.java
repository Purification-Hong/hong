package day06;
/* 향상된 for명령. [형식] for(데이터타입 변수 : 배열){
								실행문
                         	}
                    [참고] 배열:같은 형태의 데이터를 여러개를 하나로 관리할 목적으로 제공하는 문법     	
 					[형식] 데이터타입[] 변수이름=new 데이터타입[관리할갯수];
 							데이터타입 변수이름[]={데이터1, 데이터2,....};
 */	
public class Test01_forEach {

	public static void main(String[] args) {
		int[] nos= {1, 2, 3, 4, 5,6,7,8,9,10};
		
		for(int i=0;i<10;i++) {
			System.out.println(nos[i]+"-");  
		}
		System.out.println("***향상된 for 명령 ***");
		
		for(int no: nos) {
			System.out.print(no+"-");
		}
		System.out.println();
		}
	}

