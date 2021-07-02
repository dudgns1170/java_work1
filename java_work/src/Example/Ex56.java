package Example;

import java.util.Scanner;

public class Ex56 {
	
//	오버 로딩 
	//다중 메서드 문제
	static int absolute(int i)
	{
		if(i <0)
			i*=-1;
		return i;
	}
	static long absolute(long i)
	{
		//삼항 연산자 방식
		//return (i>=0)? i:-i;
		if(i <0)
			i*=-1;
		return i;
	}
	static float absolute(float i)
	{
		if(i <0)
			i*=-1;
		return i;
	}
	static double absolute(double i)
	{
		if(i <0)
			i*=-1;
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7/2일 문제 풀이 
//		int 형 뱐수 x의 절대값 long형 변수 x의 절대값, float형 변수의 x의 절대값
//		dobule형 변수 x의 절대 값을 구하는 다중 메서드를 작성
		Scanner sc = new Scanner(System.in);
		System.out.println("int 형 정수 a의 값");
		int i = sc.nextInt();
		System.out.println("float 형 정수 a의 값");
		float c = sc.nextFloat();
		System.out.println(absolute(i));
		System.out.println(absolute(c));
		System.out.println("long 형 정수 a의 값");
		long d = sc.nextLong();
		System.out.println(absolute(d));
		
	


	}

}
