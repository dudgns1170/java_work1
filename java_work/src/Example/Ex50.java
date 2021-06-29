package Example;

import java.util.Scanner;

public class Ex50 {
	static void  insertArray(int[]a,int i,int idx)
	{
		if(i>=0 && i <a.length) //배열 내 존제한 인덱스 값이 아닌경우 예외 처리 
			{
//			뒤에서 부터 접근 하는 방법
		for(int j  = a.length-1; j>i ; j--)
		{
			a[i] =a[i-1];
		}
			}a[i]= idx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/29일 문제 풀이
//		배열의 a 요소 a[]에 x를 삽입하는 매소듣 작성
		Scanner sc= new Scanner(System.in);
		System.out.println("요소 입력");
		int i =sc.nextInt();
		int a[] = new int [i];
		for(int j =0; j<i; j++)
		{
			System.out.println("a["+j+"]");
			a[j]= sc.nextInt();
		}
		System.out.println("삽입할 요소의 인덱스");
		int key = sc.nextInt();
		System.out.println("삽입할 입력값");
		int dex = sc.nextInt();
		insertArray(a, key,dex);
		for(int j =0; j<i; j++)
		{
			System.out.println("a["+j+"]"+a[j]);
		}
	}

}
