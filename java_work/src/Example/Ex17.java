package Example;

import java.util.Random;
import java.util.Scanner;



public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4/30일 문제 풀이
		//0,1,2중에서 하나의 난수를 생성후 0이면 "가위" 1="바위"2=보
		// if 문과 스위치문 사용 하여 만들기
		Scanner sc = new Scanner(System.in);
		//System.out.println("숫자를 입력");
		//int i = sc.nextInt();
	
		//int a =sc.nextInt();
//		Random rn = new Random();
//		int a = rn.nextInt(3);
//		if(a == 0)
//			System.out.println("가위");
//		else if (a == 1) 
//			System.out.println("바위");
//		else
//			System.out.println("보");
////		  switch(a) {
//	      case 0:
//	         System.out.println("가위");
//	         break;
//	      case 1:
//	         System.out.println("바위");
//	         break;
//	      case 2:
//	         System.out.println("보");
//	         break;
//	      default:
//	         break;
//	      }
		
		//2번 스위치 이프문 사용
		//월 을 1~12의 정수값으로 읽어서.해당 하는 계정을 표시

//		
//		if(i >= 1 &&  i <= 3)
//			System.out.println("봄");
//		else if ( i >=4 && i <=6)
//			System.out.println("여름");
//		else if (i >= 7 && i <=9)
//			System.out.println("가을");
//		else if( i >= 10 && i <= 12)
//			System.out.println("겨울 ");
//		else
//			System.out.println("찾는 월이 없습니다.");
		//케이스문 사용시
		   //System.out.print("월 입력 : ");
		   
		      
//		      switch(a) {
//		      case 1: case 2: case 3:
//		         System.out.println("봄");
//		         break;
//		      case 4: case 5: case 6:
//		         System.out.println("여름");
//		         break;
//		      case 7: case 8: case 9:
//		         System.out.println("가을");
//		         break;
//		      case 10: case 11: case 12:
//		         System.out.println("겨울");
//		         break;
//		      default :
//		         System.out.println("없음");
		
		
		//3번문제 반복문
		// 정수 값의 부호를 판정하여 표시하는 프로긂 작성
		//단 원하는만큼 반복 해서 입력 및 표시
		//음수 양수
//		
//		while(true) {
//			
//			int i= sc.nextInt();
//			if(i<0) {
//			System.out.println("음수");
//			}
//			else if (i>0)
//			{
//				System.out.println("양수");
//			}
//			int a = sc.nextInt();
//					
//
//			if(a ==1)
//			continue;
//			else if (a==0)
//			break;
//		}
		
		int v=0;
		int w=0;
		
		do {
			System.out.print("숫자를 입력:");
			v= sc.nextInt();
			if (v < 0)
			{
				System.out.println("음수");
			}
			else if (v >0)
			{
					System.out.println("양수");
			
			}
			System.out.println("다시하시려면 1");
			w = sc.nextInt();
			
			} while(w == 1);
		//3자리 양의 정수 값을(100-999)  입력 받는 프로그램 작성.
//			if(i >= 100 && i <= 999)
//			{
//				System.out.println(i);
//			
//			}
//			else {
//				System.out.println("다시입력");
//				
//				}
		
//		int a ;
//		do {
//			System.out.println("정수 값 입력");
//			a =sc.nextInt();
//		}while( a < 100 || a > 999);
//		System.out.println("입력값"+a);
		
	
		
		
		
		
	
			
		
//	
		
			
		
		
		
		
		
//		for(int a =0; a < i; a++)
//			if (a > 0) {
//				System.out.println("정수");
//		System.out.println("다시 입력");
//				if (a < 0)
//					System.out.println("음수");
//			}
//		
//		
		
		
		
}

	}


	
		  


	
		
	

	


