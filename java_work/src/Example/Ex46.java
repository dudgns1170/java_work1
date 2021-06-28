package Example;

import java.util.Scanner;

public class Ex46 {
	static void PrintBits(int x)
	{
//		삼항연산자 이해가 어려울 시
		for(int i = 31; i >=0; i--)
		{
//				이 문법이 기본이 된다고 생각하면 됨.
			if(( x >>> i&1)==1)
			{
				System.out.print('1');
						}
			else
			{
				System.out.print('0');
			}
		}
	}
//	  0 => 1 로 바꾸거나 1=>1로 유지하라.
	static int Set(int x, int pos)
	{
		 int ret = x|(1<< pos);
		 return ret;
	}
//	  1 => 0 로 바꾸거나 0=>0로 유지하라.
	static int reset(int x, int pos)
	{
		int ret = x & -(1<< pos);
		 return ret;
	}
//	  1 => 0 로 바꾸거나 0=>1로 유지하라.
	static int inverse(int x, int pos)
	
	{
		int ret = x ^(1<<pos);
		 return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/28일 문제 풀이 정수 x의 pos번쨰 있는 비트를 1로 변경한 값을 반환하는 set 메서드,
//		0으변경한 값 그리고 해당 위치의 비ㅌ,를 반전시켜서 반환하는 inerse를 작성
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int pos = sc.nextInt();
		PrintBits(x);
		System.out.println();
		PrintBits(Set(x, pos));
		System.out.println();
		PrintBits(reset(x, pos));
		System.out.println();
		PrintBits(inverse(x, pos));
		
	}

}
