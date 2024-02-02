package day02;
/* 제니의 이름, 나이, 키, 성별, 전화번호를 기억할 변수를 만들어 보자
 */
public class Test03 {
	//main함수는 이 클래스가 시작될때 JVM이 제일먼저 찾아서 실행시키는 함수이다.(=진입점 함수)
	public static void main(String[] args) {
		
	/*
	 참고) 이 후로도 그렇고 코딩할때 흐름이 생각이 안나는 경우는 먼저 글로 순서를 작성해 본다
	 */
		
		/*  1. 변수선언(제니의 이름 변수, 나이 변수, 키 변수, 성별 변수, 전화번호 변수)
	        -> 2. 변수 초기화
	            1)각각 토큰기호(;)로 명령을 구분해준다
	            2) 문자와 문자열의 데이터의 형태가 다르므로, 문자는 ' '이고, 문자열은 " " 를 이용해서 표현한다.
	                 ex)  "제니" , '여'
	        -> 3. 출력  */
		
		String name;
		int age;
		double height;
		char gen;
		String tel;
		
		name="제니";
		age=22;
		height=122.0;
		gen='여';
		tel="010-1234-5678";
		
		//ctrl + alt + win + 아래방향키 	:  한행  복사
		
		/*
		 문자열에 + 기호가 사용되는 경우는 +기호가 산술 연산을 하는것이 아니고
		 문자열과 다른 데이터를 결합해주는 [결합연산자]가 된다
		 
		 연산의 결과 만들어지는 데이터는 문자열이 된다.
		 */
		
		System.out.println("이름:"+ name);
		System.out.println("나이:"+ age);
		System.out.println("전화번호:"+ tel);
		System.out.println("키:"+ height);
		System.out.println("성별:"+ gen);
		
		System.out.println("성별:"+ height + "\n나이 : " + age + "\n번화번호:" + tel +"\n키"+height + "\n 성별:" + gen); // \r\n

		
	}
}
	

