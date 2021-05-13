package Example;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5/11일 문제 풀이
		
		//1번 입력값 으로 별만들기
//		System.out.println("입력값");
		Scanner sc = new Scanner(System.in);
//		int i= sc.nextInt();
		/*for(int a= 0; a<i; a++)
			{
//			if(a%2 ==0 )
				System.out.println("*");
//			else
//				System.out.println("+");
			}
		System.out.println();*/
		
		//2번 양의 정수(-) 값을 0까지 카운트 하는 프로그램 작성
//		int x=0;
//		do {
//			x= sc.nextInt();
//		}while (x <= 0);
//			
//		for(;x >=0; x--)
//			{ System.out.println(x);
//			}
		//3번 0부터 양의 정수까지 카운트 업 하는 프로그램
//		int x;
//		x=sc.nextInt();
//		for (int i =0; i<x; i++)
//			System.out.println(i);
		//4번  1부터 n 까지의 합을 구하느 프로그램
//		int x= sc.nextInt();
//		int sum=0;
//		for(int i =0; i<= x; i++)
//		{
//			
//			sum += i;
//			System.out.println("합은"+sum);
//		}
		//4번 3번 프로그램을 수정해서 결과 뿐만 아니라 계산식까지 표시하는 프로그램 작석
//		int x = sc.nextInt();
//		int sum =0;
//		for(int i=0; i <= x; i++)
//		{
//			System.out.print(i);
//			if(i != x)
//			{
//				System.out.print("+");
//				
//			}
//			sum += i;
//			}
//		System.out.print("="+sum);
		//5 신장별 표준 체중 대응표를 표시하는 프로그램을 작성하자.
//		System.out.println("키를 입력하세요");
		System.out.println("최소");
		int min =sc.nextInt();
		System.out.println("최대");
		int max = sc.nextInt();
		System.out.println("증가값");
		int d = sc.nextInt();
		
		
//		double sum = 0;
		System.out.println("신장"+"|"+"표준 체중");
		System.out.println("----------");
		for(int i =min; i < max; i= i+d)
		{
//			sum =(i-100)*0.9;
			System.out.println(i+"  | "+(i-100)*0.9);	
		}
		
		
	
	
	}
	
	}


