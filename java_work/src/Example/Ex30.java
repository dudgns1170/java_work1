package Example;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/2일 문제 풀이
//		1번 베열의 요소 수의 5잉ㄴ int 형의 배열을 5,4,3,4,2,1로 순서대로 표시
//		int [] arr = {5,4,3,2,1};
//		for(int i =0; i< arr.length; i++)
//			System.out.println(arr[i]);
		
//		2번 배열의 요소 수와 개별 요소의 값을 입력 받아서 표시하는 프로그램
//		표시 형식은 배열 초기값과 같은 형식으로 요소값 쉼표로 연결 {} 값깐 형태
		Scanner sc = new Scanner(System.in);
//		System.err.println("요소수 수:");
//		int n = sc.nextInt();
//		int []a = new int[n];
//		for(int i =0; i<a.length; i++)
//		{
//			System.out.println("a["+i+"]=");
//			a[i]= sc.nextInt();
//		}
//		System.out.print("a={");
//		if (n>=2)
//			for(int i =0; i< n-1; i++)
//			{
//				System.out.println(a[i]+ ",");
//			}
//		if(n>= 2)
//			System.out.println(a[n-1]);
//		System.out.println("}");
		
//		시험문제 점수 합계의 평균, 최저,최고점을 구현하라
//		사람수와 점수는 입력
		System.out.println("사람수 입력");
		int a =sc.nextInt();
		double sum =0;
		int i =0;
		int [] arr = new int[a];
		int min = 100;
		int max = arr[0];
		System.out.println("점수입력");
		for(i =i=0; i< arr.length; i++)
			{
			arr[i]= sc.nextInt();
			System.out.println(i+1+"번점수="+arr[i]);	
			sum +=arr[i];
			
			if(max <arr[i])
			{
				max = arr[i];
			}
			if (min > arr[i])
				{min = arr[i];
			}
			}
		System.out.println();
		System.out.println("합ㄱㅖ:"+sum);
		System.out.println("평균:"+ sum/a);
		System.out.println("최고점"+max);
		System.out.println("최저점"+min);
		}
	
			
	
	
}

