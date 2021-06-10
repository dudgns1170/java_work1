package Example;

import java.util.Random;
import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6/10일 문제 풀이
		//서로 다른 요소가 동일한 값을 지니지 않도록 수정 
		Random ra = new Random();
		Scanner sc = new Scanner(System.in);
		int cnt =0;
		int n;
		do {
			System.out.println("요소수 입력");
			n= sc.nextInt();
		}while(n>10);
		int [] a = new int[n];
//		a[0] = 1+ra.nextInt(46);
		for(int i =0; i<n ; i++) 
		{ int j;
			do {
			for(j =0; j<i; j++)
			{
				a[i] = 1+ra.nextInt(10);
				{
					if(a[i]==a[j])
					{
						cnt ++;
						System.out.println(cnt);
						break;
					}
						
				}
			}
			}while(j<i);
			{
				j++;
			}
		}
		for(int i =0; i<n; i++)
			System.out.println("a["+i+"]번쨰 정수"+a[i]);

	}

}
