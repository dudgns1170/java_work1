package Example;

import java.util.Random;
import java.util.Scanner;

public class Ex41 {

	public static int ra(int a, int b)
//						하한값 	상한값
	{	                       
	Random r = new Random();
	int v = a+r.nextInt(b+1-a);
//	   		하안값 + 랜덤 +
		if(b <= a)
		{
			return a;
		}
		
		return v;

		
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/23일 문제 풀이
//		2번 : 난수( a <= 난수 <= b )를 생성해서 반환하는 random 메서드를 작성하시오.
//		메서드 안에서 난수를 생성하는 표준 라이브러리를 호출.
		Scanner sc = new Scanner(System.in);
		System.out.println(ra(33, 33));
		
		

	}

}
