package day03;

public class Test01 {
	public static void main(String[] args) {
		int no1, no2; //같은 형태의 변수를 동시에 여러개 선언할 수 있고,
		               // 형식) 데이터 타입 변수1, 변수2,....;
		 no1=10; //대입연산자(연산방향은 오른쪽에서 왼쪽으로 진행한다)
		         /* 참고) 블록내에서 하나의 변수가 만들어 지면 같은 이름으로 다른 변수를 만들 수 없다.
		          */
		 //int no2; 이미 위에서 선언을 해서  stack변수가 만들어져 있기 때문에 같은이름의 변수는 만들 수 없다.
		System.out.println("1. no1: " + no1);
		
		
		 no2= no1 +=7;
		 System.out.println("2. no1: " + no1);
		 System.out.println("3. no2: " + no2);
		
		//no2에서 5를 빼서 기억시켜보자.
		 
		 no2 -= 5; // no2=no2-5; 와 같다
		 System.out.println("4. no2: " + no2);
		 
		 no1/=5; //연산의 결과는 int 데이터가 만들어진다. no1=no1/5; 에서 no1은 17이라는 int형태의 데이터를
		    //기억하고 있고, 5역시 int 형태의 데이터 이므로 두 데이터의 연산의 결과는 int형태의 데이터가 만들어진다.
		   
		 System.out.println("5. no1: " + no1);
		 
		 no1 *=5;
		 System.out.println("6. no1: " + no1);
		 //나머지 누적 대입 연산자
		 no2 %= 10;
		 System.out.println("7. no2: " + no2);
		 
		 
	}
}
