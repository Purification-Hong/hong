package day08;

import javax.swing.*;
import java.util.*;
public class Test04_for_break {
	public static void main(String[] args) {
		/*      Scanner sc=new Scanner(System.in);
		
		sc.close();
		
		int i=0;
		int com_num=3;
		while(i==com_num) {
			break;
		}        */
		int coin=7;
		for (int i = 0 ; i < coin ; i++) {
			String sno = JOptionPane.showInputDialog("***정수 입력***");
			int no=Integer.parseInt(sno);
			if(no == 3) {
				JOptionPane.showMessageDialog(null, "프로그램종료");
				break;
			}
			String result = "홀수";
			if(no % 2 == 0 ) {
				result="짝수";
			}
			JOptionPane.showMessageDialog(null, "입력받은 숫자 " + no + "는" + result + "입니다");
			if(i==6)  {
				JOptionPane.showMessageDialog(null, "적립금을 모두 소진했습니다. \n 프로그램종료");
			}
		}
	}
}
