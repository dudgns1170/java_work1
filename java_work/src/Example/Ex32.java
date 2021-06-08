package Example;

import java.util.Random;
import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/8일 문제 풀이
//		1번 더블형의 배열의 모든 요소의 합과 평균을 구하는 프로그램을 작성
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("요소수 입력");
//		int input = sc.nextInt();
//		double sum =0;
//		double [] a =new double [(int) input];
//		for(int i = 0; i<input ;i++)
//		{
//			System.out.println("a["+i+"]정수 값");
//
//			a[i] = sc.nextDouble();
////			sum += a[i];
//		}
//		for(double i :a)
//			sum += i;
//		System.out.println("합:"+sum);
//		System.out.println("평균:"+sum/input);
	
//		2번 요소형이 int형인 배열을 만들어서 모든 요소에 1~10 난수를 대입
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("요소수 입력");
//		int input = sc.nextInt();
//		int [] a = new int[input];
//		Random ra = new Random();
//		for(int i =0; i<input ; i++)
//		{
//			a[i] += 1 + ra.nextInt(10);
////			System.out.println("a["+i+"]번쨰 정수"+a[i]);
//		}
//		for(int i =0; i<input; i++)
//			System.out.println("a["+i+"]번쨰 정수"+a[i]);
//		
//		3번 인접하는 요소가 동일한 값을 가지지 않도록 2번문제 를 수정 
	Scanner sc = new Scanner(System.in);
		
		System.out.println("요소수 입력");
		int input = sc.nextInt();
		int [] a = new int[input];
		Random ra = new Random();
		for(int i =0; i<input ; i++)
		{
			a[i] += 1 + ra.nextInt(10);
			for(int v=0; v<i; v++)
			{
				if(a[i]==a[v]) 
				{
					i--;
				}
			}
		}
		for(int i =0; i<input; i++)
			System.out.println("a["+i+"]번쨰 정수"+a[i]);
	}

}
