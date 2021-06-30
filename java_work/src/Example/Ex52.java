package Example;

import java.util.Scanner;

public class Ex52 {
	static int[] cloneArray(int a[])
	{
		int b[] = new int[a.length]; // 새로운 배열 생성 복사 대상의 배열의 길이 만큼
		for(int i =0 ; i <a.length; i++)
		{
			
			b[i] = a[i];  // a배열을 b배열에 복사
		}
		return b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열 a 와 똑같은 배열을 생성하여 반환하는 cloneArray 메서드 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수 입력");
		int input =sc.nextInt();
		int a[] = new int[input];
		for(int i =0; i < input ; i++)
		{
			System.out.println("a["+i+"] :");
			a[i]= sc.nextInt();
		}
//		 함수 호출 
		int []b=cloneArray(a);
		for(int i =0; i < input ; i++)
		{
			System.out.println("b["+i+"] :"+b[i]);
			
		}
		
		
	}

}
