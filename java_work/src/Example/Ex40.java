package Example;

import java.util.Scanner;

public class Ex40 {
	

	public static void putChar( char c, int i)
	{
		while(i>0)
		{
			System.out.print(c);
			i--;
		}
		
	}
	public static void putStart(int i)
	{
		putChar('*', i);
	
	}
//	public static void putDallors(int i)
//	{
//		putChar('$', i);
//	
//	}
//	public static void putEx(int i, char chars)
//	{
//		putChar(chars , i);
//	
//	}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/23일 문제 풀이 
//				문자를 변수 형태
//		1번 문자 c개를 n개 표시 하는 putChar 메서드를 호충해서 문자를"*"를 연속으로  호출하는 putStart 메서드를 작성 
//		이 메서드를 사용 하여 삼각형을 만드는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.println("단수 선택");
		int input = sc.nextInt();

		for(int i =1; i <= input; i++)
		{
		putStart(i);
		System.out.println();
		}
	;
		
		
	}

}
