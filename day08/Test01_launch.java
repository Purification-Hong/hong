package day08;
//메뉴들을 기억할 배열을 만들고 랜덤하게 메뉴를 꺼내서 출력해보자
public class Test01_launch {

	public static void main(String[] args) {
		String[] menus = {"짜장면", "라멘", "돈까스", "김밥", "헴버거", "치킨", "짬뽕", "보쌈", "순대", "곰탕"};


	//랜덤 위치값 만든다
	int idx=(int)(Math.random()*10);
	
	//위치값을 이용해서 메뉴를 꺼내본다
	String todayMenu = menus[idx];
	System.out.println("오늘 점심은 " + todayMenu   + "입니다");
	
}

}