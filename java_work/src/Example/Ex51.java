package Example;

import java.util.Scanner;

public class Ex51 {
	static void exchangeArray(int a[], int []b)
	{
		int tem;
		for(int i=0; i < b.length; i++)
		{
//			if(a.length< b.length)
//			{
//				tem =a.length;
//			}
//	
			tem = a[i];
			a[i]=b[i];
			b[i]=tem;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열 a와 배열 b의 전체 요소값을 교환하는 메서드를 작성
//		두 배열의 요소 수 가 같지 않다면 작은 쪽의 배열에 수에 맞추어 교환
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수 입력");
		int input = sc.nextInt();
		int a [] = new int [input];
		for(int i =0; i< input; i++)
		{
			System.out.println("a["+i+"] :");
			a[i]=sc.nextInt();
		}
		System.out.println("2번째 요소수 입력");
		int input2= sc.nextInt();
		int b []= new int [input2];
		for(int j=0; j <input2; j++)
		{
		System.out.println("b["+j+"]:");
		b[j]=sc.nextInt();
		}
		System.out.println("교환된값은:");
		exchangeArray(a, b);
		for(int i =0; i< input; i++)
		{
			System.out.println("a["+i+"] :"+a[i]);
			
		}
		System.out.println();
		for(int j=0; j <input2; j++)
		{
		System.out.println("b["+j+"] :"+b[j]);
		
		}
	}

}
