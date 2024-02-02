package day02;

public class Test04 {
	public static void main(String[] args) {
		int num=10;  //4byte
		String str="제니";
		boolean bool=true;
		
		System.out.println(num + 1 + ":" +str);  //산술연산자 num+1+
		System.out.println(str + ":"  +   num + 1); //결합연산자 + num+1
		System.out.println(str + ":"  +   (num + 1));
	
		System.out.println("boolean :" + bool); //결합연산자
		System.out.println(bool + ": result");  //결합연산자
	}

}
