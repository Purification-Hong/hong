package day08;

import java.util.Arrays;

/* 
  배열] 같은 형태의 데이터를 여러개 모아서 한꺼번에 관리하는 문법. 데이터가 많은 경우 원칙적으로는
  각각의 변수에 기억시켜야 한다. 따라서 변수를 만들기도 불편하고 데이터를 사용할 때도 무척 불편하다.
  이런 문제를 해결하기 위한 방법으로 제공되는 것이 배열이다.
  
  배열이란 - 하나의 변수를 이용해서 여러개의 데이터를 관리할 수 있도록 하는 것
  참고] 자바에서의 변수의 형태
     1. 기본형(Primitive Type, Value Type)
     -> 변수에 기억된 내용이 데이터의 주소
     	자바에서 제공하는 기본 데이터타입 8가지 (boolean, char, byte, short, int, long, float, double)
     	
     	기본형 데이터를 여러개 모아놓을 목적으로 배열을 만들게 되면 배열의 내용이 자동 초기화 된다. (0으로....)
     
     2. 참조형(Reference Type, 주소형태)
     -> 변수에 기억된 내용이 주소 
     (변수에 기억된 내용이 데이터의 주소를 기억하는 주소인 경우)
     
      기본 데이터 타입으로 만든 변수 외의 모든 변수
      
      참고] 
      Heap 영역 
         특징] 1. 반드시 주소를 알아야 사용할 수 있는 영역
               2. 자바의 메모리 영역 8가지 중에서 제일 큰 영역이다
                   확장 가능하다
                     (부족하면 스스로 다른 영역을 빼앗아서 HEAP영역으로 사용 할 수 있다.)
                     -> 자바는 많은 양의 데이터가 필요하면 이것은 HEAP영역에서 기억하도록 되어있다
               3. 원칙적으로 한번 만들어지면 그 프로그램이 종료될때까지 사라지지 않는 영역이다
               4. heap 영역에 생기는 것들은 자동 초기화 된다
                  기본형의 경우는 0으로  참조형의 경우는 null로..
         참고]
            new 명령
             1. heap에 뭔가 만들겠습니다 (인스턴스를)
             2. 만들어진 것의 주소는 알려드릴게요(인스턴스의 주소를 )
             
             
             
             배열 만드는 방법
             1. 배열은 원칙적으로 데이터가 기억될 공간을 공간을 heap에 만들어야 한다
             형식]
             new 데이터타입[갯수];
              데이터타입 : heap에 만들때 데이터 영역의 형태를 지정
              갯수 : heap에 만들 데이터 영역의 갯수
             2. heap에 만들어진 주소를 기억할 변수를 만들어야 한다 (접근해서 사용하기 위해)
             형식1]
                데이터타입[] 변수이름;
             형식2]
                데이터타입		변수이름[];
                
                
                데이터타입[]  :heap영역에 있는 실제 관리할 데이터의 형태에 따라서 달라진다 -> heap type이라고 부른다
                결론] heap type이 같은 주소만 기억할 수 있다
                
                String !=  string[]    서로 전혀 다름    
                
               정리]
                  배열 만드는 방법
                   1. heap에 만들어질 주소를 기억할 변수를 준비한다
                     예) 
                        int[] no;
                        
                   2. heap에 필요한 인스턴스를 생성하고 그 주소를 준비해둔 변수에 기억시킨다
                   		예) 
                   		   no = new int[10];
                   		 
                   		 참고] 이때 변수 no는 int형태의 데이터를 관리할 배열의 주소는 모두 기억할 수 있다.
                   		 
                  배열 사용하는 방법
                  형식] 
                     배열주소[위치값];
                     **자바에서 위치값은 항상 0에서부터 시작한다. (중요)
                   
                  참고] 
                     배열변수.length   ->배열관리할 곳에 있는 메모리의 갯수를 기억하는 변수
                     
                   배열 초기화
                        배열의 heap영역에 만들어 지므로 자동으로 초기화가 이루어진다
                        정수=>0
                        실수=>0.0
                        논리=>false
                        문자=>코드값 0
                        클래스타입=> null
                        
                        
                      경우에 따라서는 배열을 강제로 특정 값을 입력할 필요도 있다.
                      이런 경우를 "배열 초기화"라 부른다.
                      
                      형식1]
                         int[] num = {1,2,3,4,5};
                      형식2]
                         int[] num = new int[] {1,2,3,4,5};
                         
                         (중요) 배열을 초기화 할 경우는 배열의 크기를 지정할 수 없다.
                         데이터의 갯수에 의해서 크기가 결정되기 때문에
                         
                         
                    참고) 
                    
                    Array.toString(배열)   ==> 배열을 출력하기 위해서는 반복문을 이용해서 출력하는 것이 원칙
                                               하지만 단순히 채워진 데이터 확인을 위해서는 반복문을 사용하는 것이
                                               불편하다. 이런 불편함을 해결할 수 있도록 제공해주는 기능의 함수이다.
                                               
                                               
                                               이 함수의 기능은 배열에 기억된 모든 데이터를 문자열로 만들어서 
                                               반환해주는 기능이다
                                               
                                               중간에 데이터 확인 용도로만 사용하세요
                   		 
 */
public class Test05_array {
	public static void main(String[] args) {
			String blackpink[] = {"제니","리","러제","지수"};
		ArrayList[]  list = new ArrayList[5];
		Samgak[] semo = new Samgak[10];  //삼각형 클래스 10개를 모아서 관리할 배열
		
	   char[] ch= {'a', 'b'};
	   int[] nums=ch;  //heap type이 달라서 사용못함 
		
	   
	   int[] no1=new int[10];
	   int[] no2= {1,2,3};
	   
	   int[] num;
	   
	   num=no1;
	   num=no2;
	   
	   System.out.println(Arrays.toString(num));
	   System.out.println(Arrays.toString(num).length());
	   

	}

}

class Samgak{
	
	
	
	
	
	
}
























