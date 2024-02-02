package day03;


import javax.swing.*;
public class Test15 {
	
		public static void main(String[] args) {
			String sno=JOptionPane.showInputDialog("*****정수 입력 ****");
			int no= Integer.parseInt(sno);
			//숫자를 짝수, 홀수인지 판별
			// 다중조건처리명령중 switch-case명령으로 처리
			String result="";
		
			
		/*	switch(no % 2) {
			
			case 0:
				result ="짝수";
				break;
				
				default:
					result="홀수";
			
			
			
			}    */
			
			
			switch(no) {
			
			case 0:
				break;
			default:
				switch (no % 2) {
				
				case 0:
				result ="짝수";
				break;
				
				default:
					result="홀수";
				
				}
	
			}
		
			/*블록 안에서 만든 변수는 블럭이 끝나는 순간 사라지는,,, 따라서 블랙 내에서만 사용할 수 있다.  */
			
			JOptionPane.showMessageDialog(null, "입력받은 숫자는 [ " + no  +"]는 < "+ result + "> 입니다");
					
			
			//sytem.out.println(no);    
			
			
		}
		
	}



	   
	    


   
    