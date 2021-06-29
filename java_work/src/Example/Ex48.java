package Example;

import java.util.Scanner;

public class Ex48 {
	static int linearSearch(int []i , int k) 
	{
//		키 값과 동일한 값을 찾는 
		for(int j=0; j<i.length; j++)
		{
			if(i[j]==k)
				return j;
		}
		return -1;
	}
	static int linearSearchR(int []i, int k)
	{
//		뒤에 있는 값을 찾는 함수.
		for(int j =i.length-1 ; j>=0 ; j-- )
		{
			if(i[j]==k)
				return j;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/29일  자바 문제 풀이
//		배열 a로 부터 key와 같은 값을 가지는 요소를 탐색하는 linearSearch 메서드와
//		linearSearchR메소드 를 작성하시오.
//		키와 같은 값을 가지느 ㄴ요소가 여러개인 경우 linearSearch는 가장 앞에 위치한 요소를 찾으며
//		linearSearchR은 가장 뒤에 위치한 요소를 찾을것
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수:");
		int i =sc.nextInt();
		int [] a = new int [i];
		for(int j =0;j < i; j++)
		{
			System.out.println("a["+j+"] =");
			a[j]= sc.nextInt();
			
		}
		System.out.println("찾는 값 :");
		int key  =sc.nextInt();
//		가장 앞에있는 인덱스 값
		int idxTop =linearSearch(a, key);
//		가장 뒤에 있는 인데스값
		int idxBtm = linearSearchR(a, key);
		if(idxTop == -1) {
		System.out.println("해당 값의 요소가 여러개 존재하지 않다");
		}
		else if(idxTop  ==idxBtm) 
		{
		System.out.println("해당 값의 x["+idxTop+"]요소가 에있다");
		}
		else {
		System.out.println("해당값이 여러게 존재 한다");
		System.out.println("가장 앞에 위치한 인덱스값"+idxTop);
		System.out.println("가장 뒤에 위치한 인덱스 값"+idxBtm);
		}
		
		

	}

}
