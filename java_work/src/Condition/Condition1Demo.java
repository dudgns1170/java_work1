package Condition;

public class Condition1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4/14
		// 조건문 if (true,false) 만 들어 갈 수있다.
		if (true) {
			System.out.println(10 > 20 );
		}
		System.out.println("10은 20보다 작아요");
		
		if(true) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
			System.out.println(5);
		System.out.println();
		
		if (false) {
			System.out.println(1);
		}else {System.out.println(2);}
		
		System.out.println();
		
		if(false) {
			System.out.println(1);   //if 에서 false 이 실행되고
		}
		else if(true)           
		{
			System.out.println(2);  //else if 에서 true가 실행되어 2가 출력
		}
		else if (true)
		{
			System.out.println(3); //else if 에서 true가 실행되어 2가 출력되어 밑에 있는 문장이 무시되어 if 문을 나옴.
		}
		else
		{
			System.out.println(4);
		}
		
		System.out.println();
		 // 위에 문제 보고 오면 이해가 빠름.
		// if , else 절에 false 를 넣어 3번쨰 else절이 true이므로 출력 
		if(false)
		{
			System.out.println(1);
		}
		else if(false)
		{
		 System.out.println(2);
		}
		else if(true)
		{
			System.out.println(3);
		}
		else
		{
			System.out.println(4);
		}
		
		// 모든 절에 false 를 넣어 실행하면 else은 4가 출력됨.
		
		System.out.println();
		if(false)
		{
			System.out.println(1);
		}
		else if(false)
		{
		 System.out.println(2);
		}
		else if(false)
		{
			System.out.println(3);
		}
		else
		{
			System.out.println(4);
		}
	

	}


}
