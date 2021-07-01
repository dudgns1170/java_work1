package Example;

import java.util.Scanner;

public class Ex54 {
	static int[] searchArrayidx(int [] a , int b)
	{	
		int cnt =0;
	
//		   찾고자 하는 값 조건.
		for(int i =0; i<a.length ; i++)
		{
			if(a[i]==b)
			{
				cnt++;
			}

		}
		int v [] =new int [cnt];
		cnt --;
		for(int i =a.length-1; cnt>=0 ; i--) {
			if(a[i]==b)
			{
				v[cnt] =i;
				cnt --;
			}
		}
		
		return v;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7/1일 문제 풀이
//		2번. 배열 a요소 중에서 값이 x인 모든 요소의 인덱스룰 앞에서부터 순서대로 
//		저장해서 반환하는 함수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수 입력");
		int i =sc.nextInt();
		int a[]= new int[i];
		for(int j =0; j <i; j++)
		{
			System.out.println("a["+j+"]");
			a[j]=sc.nextInt();
		}
		System.out.println("찾는 값");
		int b =sc.nextInt();
		int d[] =searchArrayidx(a, b);
		for(int j=0;j<d.length; j++)
		{
			System.out.println(d[j]);
		}
	}

}
