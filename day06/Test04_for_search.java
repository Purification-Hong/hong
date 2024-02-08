package day06;

public class Test04_for_search {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,6,7,8,9,10};
		int target=7; //찾을 숫자
		//결과값 변수 준비
		int result=-1;   // 0넣어도 됨, 구분되기 쉽게 -1넣음
//반복해서 하나씩 꺼내서 비교
for(int i=0; i<nums.length; i++) {
	//숫자 한개를 하나씩 꺼내고
	int no=nums[i];
	//찾을 숫자와 비교하고
			if(target ==no) {
				result=i;
				break;  //break는 반복문, switch-case에서 사용한다  
			} 
		}
System.out.println("nums 배열에 기억된 수 중  " + target + " 은 인덱스가 " + result + "  위치에 있습니다" );
	}
}
