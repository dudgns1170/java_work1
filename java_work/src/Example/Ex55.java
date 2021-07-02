package Example;

import java.util.Scanner;

public class Ex55 {
	static int[] insertAraayof(int arr[], int idx, int input)
	{
		if(idx <0 ||idx >arr.length)
		{
			return arr.clone();
		}
		else {
//		반환하는 배열을 생성 한다.
		int c[]= new int[arr.length+1];
//		arr 배열에 c 배열 값을 삽입
		for(int i =0; i< idx; i++)
		{
			c[i]=arr[i];
		}
//		 c 배열의 값 
		for(int i =0; i< arr.length; i++)
		{
			c[i+1]=arr[i];
		}
//		삽입할 값 지정
		c[idx] = input;
		return c;
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7/2일 자바 문제 풀이
//		배열 a의 요소 a[idx]에 x를 삽입해서 배열로 반환하는 arrlns()를 작성하시오
//		삽일할떄는 a[idx]있는 모든 요솔르 하나씩 뒤로 이동
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수 입력");
		int a= sc.nextInt();
		int arr [] = new int[a];
		for(int i = 0; i < a; i++)
		{
			System.out.println("arr["+i+"]");
			arr[i]=sc.nextInt();
		}
		System.out.println("삽입할 인댁스");
		int idx  = sc.nextInt();
		
		System.out.println("삽입할 값");
		int input = sc.nextInt();
		int [] b= insertAraayof(arr, idx,input);
		for(int i =0; i<b.length  ; i++)
		{
			System.out.println("arr["+i+"]"+b[i]);
		}
		
	
	}

}
