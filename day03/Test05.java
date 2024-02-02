package day03;
/* 비교연산자 "크기를 비교하는 연산자
   >,   <,  >=,  <=,   ==,   !=
   
   비교연산자의 결과는 논리형태(true or false)의 데이터가 만들어 진다.
 */
public class Test05 {
	public static void main(String[] args) {
		int no1=10;
		int no2=11;
		
		System.out.println("no1 > no2 :  "  + (no1 > no2));
		System.out.println("no1 < no2 :  "  + (no1 < no2));
		System.out.println("no1 >= no2 :  "  + (no1 >= no2));
		System.out.println("no1 <= no2 :  "  + (no1 <= no2));
		System.out.println("no1 == no2 :  "  + (no1 == no2));
		System.out.println("no1 != no2 :  "  + (no1 != no2));
		
		/* 참고) 동등비교연산자(==)는 문자열 데이터도 비교할 수 있다.
		 
		 */
		String jennie="제니";  //리터럴풀
		String name="제니";
		System.out.println("jennie==name:  "  + (jennie==name));
		
		String irum=new String("제니");  //힙
		System.out.println("name== irum:  "+ (name==irum));
		System.out.println("name과 irum의 데이터 비교 :  "+ name.equals(irum));
		/*참고) 문자열의 비교는 변수가 기억하는 주소를 비교하게 되므로 데이터를 비교하는 결과가
		  만들어 지지 않는다. 따라서 문자열을 비교할때는 반드시  equals() 함수를 이용해서 비교해야 합니다.
		 */
		String a="abc";
		String b="bcd";
		
		// System.out.println("a>b:  "  + (a>b)); 
		/* String 데이터는 > 연산자는 정의 되어 있지 않으므로 사용할 수 없다.
		    ->개발자가 따로 함수를 만들어서 진행해야함 (안되는게 정상)
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
