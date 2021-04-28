package Example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4/28 java 문제 풀이
		//1번 2개의 실수 값중 큰 값을 표시하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
//		System.out.print("실수 1:");
//		double i = sc.nextDouble();
//		System.out.print("실수 2");
//		double v = sc.nextDouble();
		
//		double max;
//		if(i > v)
//			max =i;
//		else
//		max = v;
//		System.out.println(max);
		//double max = i >v ? i: v;
		
//		
		//2번 2개의 정수 값을 읽어서 두 값의 차 구하기
		
//		System.out.print("입력값1");
//		int a = sc.nextInt();
//		System.out.print("입력값2");
//		int b = sc.nextInt();
//		int c = a-b;
//		if(c>0)
//			System.out.println("두값의 차는"+c);
//		else
//			System.out.println("음수로 전환되어 표시 되지 않습니다.");
		//3번 두 정수 값이 차가 10이하 인경우 "두값의 차는 10이하"
		// 차가 10이상인경우 "11이상이라고 표시"
//		System.out.print("입력값1");
//		int a = sc.nextInt();
//		System.out.print("입력값2");
//		int b = sc.nextInt();
//		int c  = a-b;
//		if (a-b <= 10)
//			System.out.println("두값의 차는 10이하");
//		else if(a-b >10)
//			System.out.println("두값의 차는 11이상");
		//3) 3개의 입력값중  정수의 최소값을 작성하시오.
//		System.out.print("입력값1");
//		int a = sc.nextInt();
//		System.out.print("입력값2");
//		int b = sc.nextInt();	
//		System.out.print("입력값3");
//		int c = sc.nextInt();
		//System.out.println(Math.min(Math.min(a1, a2),a3));
//		if(a1 < a2 && a1 <a3)
//			System.out.println(a1);
//		else if(a2<a3)
//			System.out.println(a2);
//		else
//			System.out.println(a3);
//		
//		//int min = a1 < a2 && a1 < a3? a1 : a2 < a3 ? a2 : a3 ;
		//System.out.println(min);
		
		
		
		//4) 중앙값 찾기
//		System.out.print("입력");
//		System.out.println("입력2");
//		int mid[] = new int[3];
//		for (int i=0; i<3; i++)
//			mid[i]=sc.nextInt();
//		Arrays.sort(mid);
//		System.out.println(mid[1]);
		//if((a >= b %% b>c))
//		
//		if (a <b != a<c)
//			System.out.println("중앙값"+a);
//		else if (b < c)
//			System.out.println("중앙값 "+b);
//		else
//			System.out.println("중앙값 "+c);
		//키보드에서 입력한 두개의 정수값을 비교하여 표시 하시오.
		//작은값 큰값 표시 .
//		System.out.print("입력");
//		int i =sc.nextInt();
//		System.out.print("입력");
//		int v = sc.nextInt();
//		
//	
//		if (i >v)
//			System.out.println("큰값은"+i +"작은값은"+v);
//		else if (v > i ) 
//			System.out.println("큰값은"+v +"작은값은"+i);
//		
//		else
//			System.out.println("두값이 같습니다.");
		
		//두개의 정수 값을 내림 차순 정렬
		//서로 값을 변경하여 재할당 
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		if(a<b) {
			int sum =a;
			a= b;
			b = sum;
		}
		System.out.println(a);
		System.out.println(b);
	
	}
}
