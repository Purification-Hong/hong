package day06;
/* 1~10까지의 숫자를 랜덤하게 10개 만들어서 배열에 기억시키세요
  단, 중복된 숫자는 없도록 하여라 */
public class Test05_search {

public static void main(String[] args) {
//정수 10개를 기억시킬 배열 준비
int [] soos= new int[10];


loop:
for(int i=0 ; i <10; i++ ) {  //숫자 생성용 반복문

/* 현재 i번째 방에 채울 데이터를 만들고  i번째 보다 1작은 방까지의 데이터를 하나씩 꺼내서
  중복이 되는지 검사할 예정이다  */

int no=(int)(Math.random()*10+1);
for(int j= 0; j<i ; j++) {    //검사용 반복문
	//첫번째 방에서부터 i번째 이전방까지 하나씩 꺼내 비교해본다
	int before=soos[j];
	if(no==before)  {
		//이전에 기억한 숫자와 중복된 경우이므로 번호를 다시 만들어야 한다
		//continue사용시, 검사용 반복문으로 가기때문에 loop: 쓰고, i를 1감소시켜준다
		
		--i;
		continue loop;
	}
}
//이 부분을 실행하는 경우는 중복된 숫자가 없는 경우
// 배열에 만들어진 번호 채워넣는다
	soos[i]=no;
}
//배열 출력
for(int i=0; i<soos.length ; i++) {
	System.out.printf("|  %2d ", soos[i]);
}
System.out.println("|");
System.out.println("&&&정렬 후 %%%");

//정렬
for(int i =0 ; i <soos.length -1; i++) {
	for(int j=i+1; j<soos.length ; j++) {
		if(soos[i]>soos[j]) {
			//임시 기억 변수 만들고
			int tmp=soos[i];
			soos[i]=soos[j];
			soos[j]=tmp;
		}
		
		}
	}
for(int i=0; i<soos.length ; i++) {
	System.out.printf("|  %2d ", soos[i]);
}
System.out.println("|");
	
	
}

}




























