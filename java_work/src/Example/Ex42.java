package Example;

import java.util.Scanner;

public class Ex42 {

	public static int readPluslnt(int v)
	{
		Scanner sc = new Scanner(System.in);
		int a ;
		do{
			System.out.print("양수값:");
			a= sc.nextInt();
			}while( a <=0);
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/23일 문제 풀이
//		양의 정수 값 :이라는 메세지에 정수값을 입력하면 값을 거꾸로 반환 하는 함수 작성
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		System.out.println(readPluslnt(in));

		int a;
		do{
			
			System.out.print("정수값:");
			a= sc.nextInt();
		readPluslnt(a);
		while(a>0) {
			System.out.print(a%10);
			a= a/10;
		}
		do {
			System.out.println("다시 한번: 1");
			
		a= sc.nextInt();
		}while(a !=0 && a!=0);
		}while( a==1);	
		

	}

}
