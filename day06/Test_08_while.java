package day06;
/* 구구단 5단*/
public class Test_08_while {

	public static void main(String[] args) {
		int dan=5;
		int gop=1;
		
		while (gop <10){
		System.out.printf("%d. %d x %d = %2d%n", gop, dan, gop, dan*gop);
		gop++;
		}
		System.out.println("***구구단 출력후 ***");
	}
}
