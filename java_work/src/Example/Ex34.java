package Example;

import java.util.Random;
import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/15일 java 문제 풀이

//		1번 배열의 나열 순서를 섞는(임의의 순서가 되도록 순서를 바꿈)프로그램 작성
//		요소수 입력 까지 할 수 있음.
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		System.out.println("요소수 입력");
		int input = sc.nextInt();
		int [] arr = new int[input];
	
		for(int i= 0; i<input; i++)
		{
			System.out.println("arr["+i+"]=");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("배열을 섞는다");
//		요소를 섞는 처리 (2개의 요소를 선택하여 값을 교환하느 작업을 반복
		for(int i =0; i<input; i++)
		{
			int idx1 = ra.nextInt(input);
			int idx2 =ra.nextInt(input);
			int t = arr[idx1];
			arr[idx1]= arr[idx2];
			arr[idx2] = t;
		}
		for(int i= 0; i<input; i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}
//		2번 배열 a 의 모든 요를 역순으로 배열 b에 복사 하는 프로그램 
//	Scanner sc = new Scanner(System.in);
//		System.out.println("요소수 입력");
//		int input = sc.nextInt();
//		int [] arr = new int[input];
//		int [] arr1 =new int[input];
//	
//		for(int i= 0; i<input; i++)
//		{
//			System.out.println("arr["+i+"]=");
//			arr[i] = sc.nextInt();
//		
//		}
//		System.out.println("역순");
//		
//		for(int i =0; i < input; i++)
//		{
//			arr1[i] =arr[input-i-1];
//			
//		}
//		for(int i= 0; i<input; i++)
//		{
//			System.out.println("arr["+i+"]="+arr1[i]);
//		
//		}
//		3번 월을 1~12월 까지 표시하고 해당월의 영어 단어를 입력하는 프로그램 월은 난수 생성으로 
//		equals,
		/*Scanner sc = new Scanner(System.in);
		Random ra =new Random();
//		int [] arr = {12};
		String[] month= {"January", "February", "March", "April", "May", "June", 
				"July", "August", "September", "October", "November"," December"};
		for(int i =0; i<12; i++)
		{
			System.out.println(month[i]);
		}
		System.out.println("해당월의 단어 첫글자 대문자 나머지 소문자");
		int a;
		a= ra.nextInt(12);
		int retry=0;
		do{
			
			while(true)
		
		{ 
			System.out.println((a+1)+"월:");
		
			String input=sc.next();
		if(input.equals(month[a])) {
			System.out.println("정답");
			break;
		}
		else {
			System.out.println("오답");
		}
		}
		System.out.println("다시 1번 ");
		retry = sc.nextInt();
		}while(retry ==1);
	}
	}*/
	

	}
		
	}


	
