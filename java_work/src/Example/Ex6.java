package Example;
import java.util.Random;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java 문제 풀이
		//ex1)
		//scanner 사용
	/*Scanner sc = new Scanner(System.in);
	System.out.print("입력값:");
	int s =  sc.nextInt();
	System.out.println(s+10);
	System.out.println(s-10);
	sc.close();*/
		
	//ex2)
	// 키보드에 입력한 정수 값에 10을 더한 값과 뺀 값을 출력
	/*Scanner Sc = new Scanner(System.in);
	System.out.print("입력값:");
	int i =  Sc.nextInt();
	System.out.println(i+10);
	System.out.println(i-10);
	Sc.close(); */
	
	//ex3)
	//키브도에서 입력한 정수 값에서 마지막 자리수를 제외 값 , 마지막 자리수 값만 출력
	//Scanner x = new Scanner(System.in);
	//int a = x.nextInt();
	//Sstem.out.println( a /10);
	//System.out.println(a % 10);
	
	// ex4)
	//2 개의 실수값을 입력받아 그 합과 평균을구하는 프로그램을 작성하세요.
	/*Scanner  = new Scanner(System.in);
	System.out.println("입력해주세요");
	double  = x.nextDouble();
	Sysetm.out.println("");
	double  = x.nextInt();
	
	System.out.println();
	System.out.println(()/2)*/;

	//ex5)
	//삼각형 밑변과 높이를 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하세요.
	// 넓이 구하는 공식 밑변 X 높이 /2
	/*Scanner sc = new Scanner(System.in);
	
	System.out.println("밑변 값:");
	double i = sc.nextDouble();
	System.out.println("높이 값");
	double v = sc.nextDouble();
	
	System.out.println(i*v/2);
	sc.close
	*/
	
	
	//ex 6)
	//구의 겉넓이와 부피를 구하는 프로그램을 작성.

	
	/*Scanner sc = new Scanner(System.in);
	final double PI = 3.1416;
	System.out.println("구의 넓이");
	 double i =sc.nextDouble();
	 
	System.out.println("구의 부피");
	double v =sc.nextDouble();
	
	 System.out.println(4/3*PI*i*i*i);
	 System.out.println(4*PI*i*i);*/
	
	//ex 7)
	// 한자리 양의 정수 값(1이상 9이하)
	/*int a =0;
	Random random = new Random();
	a= random.nextInt(10);
	System.out.println(a);*/

	
	//Scanner sc = new Scanner(System.in);
	//ex8)
		/*int a =0;
		Random random = new Random();
		a= random.nextInt(9);
		System.out.println(a*-1);
		
		int v = (int)(Math.random()*8+1);
		System.out.println(v);*/
		
		//i = (int)(Math.random()*8+1);
		//j = (int)(Math.random()*-8-1);
		//k=(int)(Math.random()*89+10);
		
		/*int a =10;
		Random random = new Random();
		a= random.nextInt(100);
		System.out.println(a);*/
		
		//ex90
	// 정수값을 +5 -5 범위의 랜점 함수.
	Random ra = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("입력값");
		int i = sc.nextInt();
		System.out.println(i-5+ ra.nextInt(11));

		
	}
	

}
