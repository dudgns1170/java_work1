package Example;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/21일 자바 문제 풀이
//		1번. 학급수 , 각 학급의 학생 수 , 모든 학생의 점수를 읽어서 합계와 평균을 구하는 프로그램.
//		합계와 평균은 학급 단위, 전교생을 대상으로 하는 것을 각각 구하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("학급수 를 입력");
		int input = sc.nextInt();
		int sum =0;    //반 총점
		int total =0;  // 총 점수
		int number =0;  // 전교생 수 
		int [][]arr = new int [input][];
//		각 학급의 인원수를 입력 받음
		for(int i =0; i < arr.length; i++)
		{
			System.out.println((i+1)+"반의 학급의 인원수 를 입력");
//				변수가 같으면 안됨.
				int num = sc.nextInt();
//				각 행의 값을 지정
				arr[i]=new int[num];
//				각 학급의 인원수 더하기
				number += num;
//				각 학급의 점수를 입력
				for(int j =0; j< arr[i].length; j++)
				{
					System.out.printf("%d 반의 %d 번의 점수:",i+1,j+1);
					input= sc.nextInt();
					arr[i][j]=input;

		
				}
    
		}

//		각 학급의 점수 출력하기
		System.out.println("반  |    합계   |    평균");
		for(int i =0; i<arr.length; i++)
		{
//			   				해당되는 반 표시 
			for(int j=0; j<arr[i].length; j++)
			{
//				합계 구하기
				sum += arr[i][j];
	
			
			}
//			 토틸 값 구히기
			total += sum;
			System.out.printf("%d반   |   %7d%7.1f\n",i+1,sum , (double)sum/arr[i].length);
		}
		System.out.println();
		System.out.printf("합   |    %d%f\n", total , (double)total/number);
		

		System.out.println();
		

	}

}
