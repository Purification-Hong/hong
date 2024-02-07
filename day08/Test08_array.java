package day08;

public class Test08_array {

	public static void main(String[] args) {
			Object[] data= new Object[10];   
				for(int i = 0 ; i < data.length ; i ++ ) {
				data[i]=new Object();
				
			}
					data[0] = 10;
					data[1] = "열";
					data[2] = 3.14;
					data[3] = new Semo();
					
					//이렇게 Obejct[] 배열을 만들면 모든 데이터를 기억시킬 수는 있다.
					// 하지만 꺼내서 쓸때는 강제로 형변환을 시켜줘야 된다.
					System.out.println((double)data[2]  +1);  // object사용시, 강제형변환을 해야한다 + 인식이 안되니까 
				}
		
		}
	class Semo{
	
	
}

