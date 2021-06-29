package Example;

import java.util.Scanner;

public class Ex49 {
	static void  aryRmv(int[]a,int i)
	{
		if(i>=0 && i <a.length) //배열 내 존제한 인덱스 값이 아닌경우 예외 처리 
			{
		for(int j  =i; j< a.length-1; j++)
		{
//			삭제할 요소의 인덱스부터에 다음 인덱스의 값을 입력 , 배열의 마지막 인덱스 전까지
			a[i]= a[i+1];  //다음 인덱스에 해당하는 값을 앞의 인덱스 위치로 이동
////			     길이에서 -1헤야지 인덱스 삭제가 가능
//			if(j ==a.length-1)
//			{
////			 a배열의[j] = 마지막 인덱스 값의 -1
//			a[j]= a[j-1];
//			}
//			else
//			{
////				 
//				a[j]= a[j+1];
//			}
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/29일 문제 풀이 
//		배열 a로 부터 a[idx]를 삭제하는 aryRmv 메서드를 작성하시오
//		삭제 후 그 뒤에있는 요소들을 앞으로 하나씩 이동
//		이동 후 에 빈 공간은 마지막 요소 a[idx]값으로 유지
		Scanner sc = new Scanner(System.in);
//		값을 입력
		System.out.println("요소수 입력");
//		입력 값
		int i =sc.nextInt();
//		배열 생성 후 입력받은 i의 개수로 선언
		int [] a= new int[i];
//		선언한 배열의 공간에 값을 선언
		for(int v =0; v<i; v++)
		{
			System.out.println("a["+v+"]:");
			a[v]=sc.nextInt();
		
		}
		
		System.out.println("삭제할 인덱스");
		int key = sc.nextInt();
//		입력값을  삭제할 인덱스에서 받은 값으로 입력
		aryRmv(a, key);
		for(int v =0; v<i; v++)
		{
			System.out.println("a["+v+"]:"+a[v]);
			
		}
		
	}

}
