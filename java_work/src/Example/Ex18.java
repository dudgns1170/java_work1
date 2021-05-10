package Example;

import java.util.Random;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5/3일 문제 풀이
		//ex1 반복문 사용
		//두자리 정수갑 10~99을 맞추는 '슷자 맞추기 게임'
		Scanner sc =new Scanner(System.in);
		
//		int in_put ;
//		Random re = new Random();
//		int a;
//		int ra= re.nextInt(90)+10;
	/*	do {
			//Random re = new Random();
			System.out.println("숫자를 입력해주세요");
			in_put = sc.nextInt();
			//int ra= re.nextInt(100);
			if(in_put > ra)
				System.out.println("작아요");
			else if (in_put<ra)
				System.out.println("커요");
			else
				System.out.println("정답입니다");
			System.out.println("재도전은 1");
			a = sc.nextInt();}
		while(a==1);
		{
			if (in_put== ra)
				System.out.println("정답입니다.");
		}*/
		//정답
//		int i; //읽는 값
//		int num = re.nextInt(90)+10;
//		
//			i= sc.nextInt();
//			if(i > num)
//				System.out.println("작아요");
//			else
//				System.out.println("더 크다");
//		}while( i != num);
//		System.out.println("정답");
			
		//2번 2개의 정수값을 읽어서 두 정수 사이에 있는 모든 정수값 작은 수부터 큰순으로 표시
//		System.out.println("정수 a");
//		int a= sc.nextInt();
//		System.out.println("정수 b");
//		int b= sc.nextInt();
//		//b 가 큰값 a가 작은값으로 할당
//		if(a>b)
//		{
//			int t =a;
//			a=b;
//			b=t;
//		}
//		do {
//			System.out.print(a + " ");
//			a= a+1;
//			
//		}while(a <= b);
		//3번 입력 받은 정수값부터 0까지 카운트 다운 하는 프로그램을 작성

//		System.out.println("정수 a");
//		int a= sc.nextInt();
//		int b =0 ;
//		if (a<=b)
//			{int t = a;
//			a= b;
//			b=t;
//			}
//		do {
//			System.out.println(a);
//			a = a-1;
//		}while(a !=b);
//		System.out.println(a=a-1);
//		
		
	
		System.out.println("숫자를 입력");
		int v = sc.nextInt();
		int i =0;
		if(v>0){
		while(i < v)
			{
			System.out.print("*");
			i++;
			}
		
		
		}
//		for(int i =0; i < v; i++)
//			{System.out.print("*");
//			}
//		

		/*System.out.println("입력");
		int v = sc.nextInt();
		
		for(int i =v; i >= 0; i --)
			{//System.out.println(i);
			System.out.println(v=v-1);
			
			}*/
		

		

}
}
