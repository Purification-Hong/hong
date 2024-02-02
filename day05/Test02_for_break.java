package day05;
/* 반복문 제어 명령
  :반복문의 반복작업을 제어할 목적으로 만들어진 명령들
   1)break : switch-case에서도 사용
      이 명령을 만나면 실행되고 있는 반복문을 즉시 종료
       주의) 이 명령은 바로 위의 반복문만 제어한다
         예. for(int i=0; i<10; i++){
         for(;;) {
         if() {
         break;
           }
          }
         }   의 경우 여기의 break명령은 2번 반복문에만 적용
   2)continue: 실행되는 반복문의 다음회차로 즉시 진행하세요
     for(int i=0; i<5 ; i++) {
       if(i==3){
       continue;
       }
     system.out.println("^^");
     }
   
 */
public class Test02_for_break {
	public static void main(String[] args) {
		
		 for(int i=0; i<5 ; i++) {
		       if(i==3){
		       continue;
		       }
		     System.out.println("^^");
		
		 }
	}
	
}
