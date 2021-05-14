package Example;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5/14일 문제 풀이
		//"*"을 나열해서 n단의 정방형을(사각형) 표시하는 프로그램 작성
		// 이 문제에서는 포문은 포문안에 포문은 입력한 수 만큼 돈 후 나오게 된다.
		/*Scanner sc= new Scanner(System.in);
		System.out.println("단수");
		int input= sc.nextInt();
		for(int i =1; i <=input ; i++)
		{
			for(int j =1; j <= input; j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}*/
		//2번 "*"s 나열해서 직각삼격형을 표시하는 프로그램 작성
		//직각 위치 왼쪽 아래
		//직각 위치 왼쪽 위
		Scanner sc= new Scanner(System.in);
		System.out.println("단수");
		//삼각별 거꾸루
		int input= sc.nextInt();
//		for(int i =1; i <= input; i ++)
//		{
//			for(int j =1; j <= input+1-i; j++)
//			{
//				
//			System.out.print("*");
//			}
//			
//		System.out.println();
//		}
		
		
		
		/*	삼각별
Scanner sc= new Scanner(System.in);
		System.out.println("단수");
		int input= sc.nextInt();
		for(int j =1; j <= i; j ++)
		{
			for(int j =1; j <= i; j ++)
			{
				
			System.out.print("*");
			}
		System.out.println();
		}
수정 본*/

		//3번 피라미드 (이등별)심각형으 표시하는 프로그램
		
		/*for(int i = 1; i <= input ; i ++)
		{
			for(int j=1; j <= input-1; j++)
				System.out.print(' ');
		
			for(int j =1; j <= 2*i-i; j ++)
			{
				
			System.out.print("*");
			}
		
		System.out.println();
		}
		*/
		
		//4번  n단의 숫자 피라미드 표시 
		//if(input<=10&& input <=11){
		 for(int i =1; i<=input; i++)
		 {
			 {for(int j =1; j<=input-i; j++)
				 System.out.print(' ');
			 }
			 { for(int j =1; j<= 2*i-1; j++)
				 System.out.print(i%10);
			 
			 }
			 
		 System.out.println();
		 }
//		}

	}

}
