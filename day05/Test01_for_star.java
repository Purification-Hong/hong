package day05;
/*
 @  @  @  @  @ 
 @  @  @  @  @ 
 @  @  @  @  @ 
 @  @  @  @  @ 
 @  @  @  @  @    를 출력해보자    */



public class Test01_for_star {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if (i==j) {
					System.out.print(" ");
					
					
				}else
					System.out.print("*");
					
				}
			System.out.println();
			//System.out.print(" @ ");  
			//가로로 *을 5번 출력
			}
			// 출바꿈을 해줘야 한다.
			   //개행
			
		}
	}

