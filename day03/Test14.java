package day03;


import javax.swing.*;
public class Test14 {
	public static void main(String[] args) {
		String sno=JOptionPane.showInputDialog("*****정수 입력 ****");
		int no= Integer.parseInt(sno);
		//숫자를 짝수, 홀수, 0인지 판별
		//다중 조건 처리 명령으로 if-else if-else 명령을 사용
		 String result="";
		
		if(no ==0) {
			
			result="0";
			
			
		
		}else  if(no % 2 !=0){
			
			result="홀수" ;
			
		}else {
			
		    result="짝수";
			
			
		}
		
		/*블록 안에서 만든 변수는 블럭이 끝나는 순간 사라지는,,, 따라서 블랙 내에서만 사용할 수 있다.  */
		
		JOptionPane.showMessageDialog(null, "입력받은 숫자는 [ " + no  +"]는 < "+ result + "> 입니다");
				
		
		//stem.out.println(no);    
		
		
	}
	
}



   
    