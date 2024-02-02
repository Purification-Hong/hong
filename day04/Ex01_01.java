package day04;
/* 랜덤하게 0~ 100까지 숫자를 세개를 발생시켜 큰 숫자만 출력해주는 프로그램을 작성하여라. 

숫자를 순서대로 나열해서 출력하세요.
*/
public class Ex01_01 {
	public static void main(String[] args) {
		int no1=(int)(Math.random()*101);
		int no2=(int)(Math.random()*101);
		int no3=(int)(Math.random()*101);
		
		
		int max, mid, min;
		max=mid=min=-1;
	
		if (no1>no2) {  //no1이 no2보다 큰 경우
			if(no1>no3) {  //no1은 no2보다는 당연히 크고 no3보다도 큰 경우
				           //no1이 세 수중에 제일 큰 경우
				max=no1; //그런데 아직 중간 숫자와 제일 작은 수는 아직 결정되지 않은 상태
				         //제일 작은 수와 중간 숫자를 판별해 줘야 한다
				 if(no2>no3) {
					 
					 min=no2;
					 min=no3;
					 
					 
				 }   else {
					 mid=no3;
					 min=no2;
					 
				 }
				
			}else {  //no1이 no2보다 크고 no3보다 작거나 같은 경우
				     // no2 < no1 <=no3
				max=no3;
				mid=no1;
				min=no2;
				
				
			}	
			
		}else {  //no2가 no1보다 크거나 같은 경우
				//no2 >= no1
			if(no2> no3) {
				//no2가 no1보다 크거나 같고 no3보다 큰 경우
				max=no2;
				if (no1>no3) {
					mid=no1;
					min=no3;
					
				}else {
					mid=no3;
					mid=no1;
				}
			}else {
				//no2가 no1보다 크거나 같고 no3보다 작거나 같은 경우 
				// no1 <= no2 <= no3
				max=no3;
				mid=no2;
				min=no1;
			}
				
				
			}
		 
		System.out.printf("랜덤하게 발생한 세 수 %3d, %3d, %3d 중 %n "+
		" 제일 큰 수는 %3d이고 %n중간숫자는  %3d이고 %n" +" 제일 작은 수는 %3d 입니다.", no1, no2, no3, max, mid, min);
		
		}
	}
	

