package Example;

import java.awt.geom.Area;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EX29 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5/28일 문제풀이
		//1번 더블인 요소수5인 배열을 샌성 및 표시하는 프로그램 작성
//		double [] arr = new double [5];
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//				
		//2번 배열의
//		요쇼개수가 개의 int형 배열에 순서대로 5,4,3,2,1 대입
//		int [] a = new int[5];
//		a[0] += 5;
//		a[1] += 4;
//		a[2] += 3;
//		a[3] += 2;
//		a[4] += 1;
//		for(int i=0; i <a.length ; ++i)
//			a[i] = 5-i;
//		for(int i= 0; i<a.length; i++)
//		System.out.println(a[i]);
//		3번 요소 개수가 5인 더블형 배열을 만들고 1/1.2.2.3.3,4.4,5.5 c출력
//		double [] arr = {1.1,2.2,3.3,4.4,5.5};
//		System.out.println(Arrays.toString(arr));
//		
//		double [] v = new double [5];
//		for(int i =0; i< v.length; i++)
//			{v[i] = (i+1)*1.1;
//			System.out.println(v[i]);
//			}
		
//		4번 int 형 배열의각 요소에 1~10까지의 난수를 대입 후. 각 요소의 값을 막대 그래프(기호문자)
//		*로 나열 하여라	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int input = sc.nextInt();
		int  [] i = new int [input];
		Random ra= new Random();
//		System.out.println("숫자:"+i);
		for(int a =0; a < input ; a++)
		{
			i[a]= ra.nextInt(9)+1;
			System.out.print("*");
			
			}
//		System.out.println(Arrays.toString(i));
		

				// TODO Auto-generated method stub
		//5/25문제 풀이
//				0.0부터 1.0까지 0.001단위로 증가 시키면서 해당 값으 ㅣ제곱읖 표시하시오.
//				for(float i =0.0F; i <1.0F ;i+=0.001F)
//				{System.out.printf("%5.3f               %10.7f\n",i,i*i);}
//				
//				for(int i=0; i<1000; i++)
//				{
//					float x = (float)i/1000;
//					System.out.printf("%5.3f              %10.7\n x,x*x");
//				}
//				System.out.println("\"ABC|n\"" );
			}

			
	}

