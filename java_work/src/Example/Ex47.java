package Example;

import java.util.Scanner;

public class Ex47 {
	static int add(int [] i)
	{
		int sum= 0;
		for(int v=0; v <i.length; v++)
		{
		sum +=i[v];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열a 의 합을 구하는 메소드 를 구하라4
		int [] a= {22,5,11,32,120};
		int sum =add(a);
		System.out.println("모든 요소의 합은 :"+sum);
		
		
	}

}
