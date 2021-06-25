package Example;

import java.util.Scanner;

public class Ex45 {
	public static void Bitss(int x)
	{
		for(int i = 31; i >=0; i--)
		{
			System.out.print(((x >>> i&1)==1)?'1':'0');
		}
	}
	public static int rotaeRight(int x, int n)
	{
		if(n<0)
			return rotateLeft(x,-n);
		n = n%32;
		return( n==0? x: (x>>>n) |(x <<(32 -n)));
	}
	public static int rotateLeft(int x, int n) {
		if(n<0)
			return rotaeRight(x, -n);
		n = n%32;
		return( n==0? x: (x<<n) |(x <<(32 -n)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/25일 자마문제 풀이
//		정수 x를 오른쪽으로 n 비트 회전한 값을 반환하는 rotaeRight 메서드와
//		왼쪽으로 n 비트 회전한 값을 반환하는 rotateLeft 메서드 작성
		Scanner sc = new Scanner(System.in);
		System.err.println("정수x 비트를 n비트 회전합니다.");
		System.err.println("x:");
		int x = sc.nextInt();
		System.out.println("n:");
		int n =sc.nextInt();
		System.out.println("회전수:");
		Bitss(n);
		System.out.println();
		Bitss(rotaeRight(x, n));
		System.out.println();
		Bitss(rotateLeft(x, n));
		

	}

}
