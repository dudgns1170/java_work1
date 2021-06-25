package Example;

import java.util.Scanner;

public class Ex44 {
//	2의 거듭제곱을 반환하는 메소드
	static Scanner sc = new Scanner(System.in);
	
	   public static int pow2(int n) {
		      int pw =1;
		      while(n>0)
		      {
		    	  pw = pw*2;
		    	  n--;
		      }
		      return pw;
	   }
		    


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/25 문제 풀이
//		정수를 좌우 시프트한 값이 ."정수 x2의 거듭제곱" 및 '정수/2의 거듭 제곱'과 같은지 확인하하는 프로그렘을 작성하시오.
//		
//		System.out.println("x /(2의3승)"+(pow2(0)>>pow3(0)));
		System.out.println("x갑");
		int x =sc.nextInt();
		System.out.println("b값");
		int a = sc.nextInt();
		
		int b = x *pow2(a);
		int c = x/pow2(a);
		int d = x << 3;
		int e = x >> 3;
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		if(b == d)
		{
			System.out.print("값이 일치");
			System.out.println();
		}
		if(c==e)
		{
			System.out.println("갑이 일치");
		}
		
		


}
}
