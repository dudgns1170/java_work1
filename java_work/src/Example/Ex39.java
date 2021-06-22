package Example;

public class Ex39 {
//  1번 안녕하세요 라고 표시하는  hello 메서드 작성
	public static String Hello(String n)
	{
//		String a = "안녕하세요.";
//		System.out.println(a);
//		return a;

		for(int i =0; i< 3; i++)
		{
			System.out.println("안녕하세요");
		}
		return n ;	
	}
	public static void printSeasno(int i)
	{
//		switch (i) {
//		case 12:
//		case 1:
//		case 2:
//			System.out.println("겨울");
//		break;
//		
//		case 3:
//		case 4:
//		case 5:
//		System.out.println("봄");
//		break;
//		
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("여름");
//			break;
//		}
	
		
	if(i == 12|| i ==1|| i <=2)
		{
			System.out.println("겨울");
		}
		else if(i >=3 && i<=5)
		{
			System.out.println("봄");
		}
		else if(i >= 6 && i <=8)
		{
			System.out.println("여름");
		}
		else if (i >= 9 && i <=11)
		{
			System.out.println("가을");
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문자열 함수 
//		1번 안녕하세요 라고 표시하는  hello 메서드 작성
//		Hello("hi");
		
//		2번 인수 M에 지정한 달(월)의 계절을 표시하는 printSeason 메서드를 작성
		 printSeasno(1);
//		 int  m;
//		 do {
//			 m =sc.nextint;
//		 }while(m <1 || m >12);
//		 System.out.println(m);
//		 printSeasnos(12);
	}

}
