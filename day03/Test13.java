package day03;


import javax.swing.*;
public class Test13 {
	public static void main(String[] args) {
		String sno=JOptionPane.showInputDialog("*****정수 입력 ****");
		int no= Integer.parseInt(sno);
		// Test12의 if명령은 조건식이 참인 경우만 처리해준다.
		//참이 아닌 경우는 처리해주지 않는다.
		//여기서는 참인 경우와 거짓인 경우를 모두 처리해 주는 if-else 명령으로 처리해보자
		
		String result="";
		
		if(no % 2==0) {
			
			result="짝수";
			
			
			
		}else {
			
			result="홀수" ;
			
		}
		
		JOptionPane.showMessageDialog(null, "입력받은 숫자는 [ " + no  +"]는 < "+ result + "> 입니다");
				
		
		//stem.out.println(no);    
		
		
	}
	
}



   
    