package Example;

import java.net.MulticastSocket;
import java.util.Scanner;


public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 형 변수를 문자열"ABC"로 초기화(피드 할당)하고
		//변수에 문자열 "XYZ"를 재 할당하는 프로그램을 작성하시오.
		//String s1 = "ABC";
		//s1= "XYZ";
		//System.out.println(s1);
		
		//제어문 
		//키보드의 입력한 정수의 값이 음이면 "이 값음 음의 값입니다."
		//라고표시하는 프로그램을 작성.
		/*Scanner sc = new Scanner(System.in);
	      System.out.println("입력");
	      int a = sc.nextInt();
	      while(a < 0)
	      {
	         
	   
	         System.out.println("이값은 음의 값");
	         break;
	      }
	   }*/
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		int a = sc.nextInt();
		if(a < 0)
		{
			System.out.println("이값은 음의 값");
		
		}
		else
			System.out.println("이 값은 음의 값이 아니다.");
		sc.close();*/
		
		//입력 받은 정수값을 읽어서 절대값을 구하는프로그램 작성.
		
		/*Scanner s= new Scanner(System.in);
		System.out.print("입력:");
		int i = s.nextInt();
		if(i<0)
			System.out.println(Math.abs(i));
		//절대갑 구하는 함수 Math.abs
		else
			System.out.println(i);*/
		
		//if ( i >=0)
			//System.out.println("절대값은"+ i);
		//else
			//System.out.println("절대값은" + -i);
		
		//2개의 양의 정수랎을 읽어서, 후자가 전자의 약수이면 b는 a의 약수이다라 표시
		//그렇치 않으면 b는 약수가 아니다라고 표시되는 프로그램 작성
		/*Scanner s= new Scanner(System.in);
		System.out.println("입력:");
		int a = s.nextInt();
		//int b = s.nextInt();
		
		//if(a% b == 0)
		if (a >0)
		{
			System.out.println("a는 정수");
		}
		else if (a== 0) {
			System.out.println("a의 값은 0");
			
		}
		else 
			System.out.println("a의 값은 음수 입니다");*/
		
		//a,b를 입력받아 대소 관계를 작성하시오
		Scanner sc= new Scanner(System.in);
	/*	System.out.println("정수 1");
		int i = sc.nextInt();
		System.out.println("정수 2");
		int v = sc.nextInt();
		if(i > v)
			System.out.println("i가 크다");
		else if (i == v) {
			System.out.println("i와 v 값이 같다");
		}
		else
		{
			System.out.println("v가크다");
		}*/
		
		//입력한 정수의 값이 5로 나누어 떨어지면 "5로 나누어 떨어집니다" 
		//그러치 아니하면 "5로 나누어 떨어지지 않습니다 표시
		//음수값 또한 표시 
		
		System.out.println("입력값");
		/*int a=sc.nextInt();
		if (a> 0) {
			if(a % 5 ==0) {
				System.out.println("ok");
			}
			else
			{
				System.out.println("no");
			}
		}
		else
		{
			System.out.println("음수");
		}*/
		
		//입력한 정수 값이 10 배수 이면 "10의 배수 출력"
		/*System.out.println("입력");
		int i =sc.nextInt();
		if (i>0 ) {
			if(i%10==0)
			{System.out.println("10의 배수");}
			else
				System.out.println("10의 배수가 아님");
		}
		else
			System.out.println("음수");*/
		
		/*int a = sc.nextInt();
		if(a>0) {
			if(a%3==0)
			{
				System.out.println("이 값은 3으로나누어진다.");
			}
			else if(a%3==1)
			{
				System.out.println("나눈 나머지의 값은1");
			}
			else if(a%3 ==2)
			{
				System.out.println("나눈 나머지 값은 2");
			}
			
		}
		else
			System.out.println("양수가 아닙니다.");*/
		
		int i = sc.nextInt();
		if(i >= 0 && i <=49)
			System.out.println("가");
		else if (i)
		
	

}
}