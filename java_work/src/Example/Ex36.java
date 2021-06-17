package Example;

import java.util.Scanner;



public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/17일 문제 풀이
//		1번 6명의 두 과목의 점수(국어, 수학)점수로 부터 과목별,학생별 평균을 구하시오.
		Scanner sc= new Scanner(System.in);
	/*	int [][] a = new int[6][2];
		int [][] b = new int [a.length][a[0].length];

		for(int i =0; i < a.length; i++)
		{
			for(int j =0; j<a[0].length; j++)
			{
								
			if(j==0)	
			{	System.out.print((i+1)+"번 국어:");
			a[i][j] = sc.nextInt();	
			}
			else {
				System.out.print( "수학:");
			a[i][j] = sc.nextInt();
			}
				
			}
		}
		System.out.println("NO   국어   수학   평균");
		float sum = 0;
		float math_sum=0;
//		 이중포문 연습
			for(int i =0; i< a.length; i++)
			{
				float avg = (float)(a[i][0]+a[i][1])/2.0f;
//						i가 1~6까지 반복이 됨. 2차원 배열의 첫 번쨰 부분은 국어
				sum += a[i][0];
//				               2차원 배열의 두 번쨰 부분은 수학
				math_sum += a[i][1];
//				                                i  반복 
				System.out.println((i+1)+ " " + (a[i][0])+ " " + (a[i][1])+ " " + avg);
				
				
			}
			System.out.println("국어"+sum/a.length);
			System.out.println("수학"+math_sum/a.length);
			*/
//			2번
//			행에따라 열의 개수가 다른 2차원 배열을 생성하시오.
//			불규칙한 2차원 배열을 생성
		System.out.println("2차 배열을 생성합니다.");
		System.out.println("행수 입력");
			int input = sc.nextInt();
			int [][] arr =new int[input][];
//			열수를 입력 
		for(int i =0; i < arr.length; i++)
		{
			System.out.println(i+"행의 열수:");
				input = sc.nextInt();
			    arr[i]=new int[input];
		}
//		열수의 값을 입력 
		System.out.println("행의 열수 를 입력");
		for(int i = 0; i<arr.length; i++)
		{
//			입력받은 행의 값의 i번쨰 부터 입력,
			for(int j = 0; j<arr[i].length; j++)
			{

				System.out.printf("arr[%d][%d] :" ,i,j);
				input= sc.nextInt();
				arr[i][j]=input;
			}
		}
//		입력값을 출력 
		System.out.println();
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr[i].length; j++)
			{

				System.out.printf("%5d",arr[i][j]);
			
			}
			System.out.println();
		}
		
}
}