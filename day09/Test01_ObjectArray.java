package day09;

public class Test01_ObjectArray {
	public static void main(String[] args) {
		BlackPink jennie=new BlackPink();
		
		/*
		jennie.name="제니";
		jennie.age=18;
		jennie.tel="010-4564-6524";
		jennie.bType='A';   */
		
		jennie.setName("제니");
		jennie.setAge(15);
		jennie.setTel("010-5555-6666");
		jennie.setbType('A');
		
		
		BlackPink jisoo=new BlackPink();   // new는 heap영역에 올려짐
		jisoo.setName("지수");
		
		//제니의 이름, 나이 출력
	/*	System.out.println("제니 이름: "   + jennie.name + ", 나이 :  "  + jennie.age);
		System.out.println("지수 이름: "   + jisoo.name + ", 나이 :  "  + jisoo.age);   */
		
		System.out.println("제니 이름: "   + jennie.getName() + ", 나이 :  "  + jennie.getAge());
		System.out.println("지수 이름: "   + jisoo.getName() + ", 나이 :  "  + jisoo.getAge()); 
		
		BlackPink lisa=new BlackPink("리사", 19, "010-8888-9999", 'B');
		
		System.out.println("리사 이름: "  + lisa.getName() +  " ,나이 :   " 
		+ lisa.getAge()  + ", 전화번호:  "  + lisa.getTel() + ", 혈액형:  "  + lisa.getbType());
		
	}
}
