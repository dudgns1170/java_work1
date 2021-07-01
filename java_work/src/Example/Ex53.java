package Example;

import java.util.Scanner;

public class Ex53 {
	static int[] removeArray(int a[] , int i){
		if(i < 0|| i > a.length)
		{
//			기존의 배열을 그대고 복재해서 사용 배열을 그대로 유지 
			return a.clone();
		}
		else {
//			 해당 인덱시 값 삭제 조건
			int b[] = new int[a.length-1]; // 새로운 배열을 생성
			for(int j=0; j<i; j++) // 입력값 삽입, 인덱스 이전 값 유지, 
			{
				b[i] = a[i];
			}
			for(int j=0; j<a.length-1; j++) //인덱스 이후 값 당겨오기
			{
				b[i]=a[i+1];
			}
			return b;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7/1일 자바 문제 풀이
//		1.배열 a에서 요소[idx]를 삭제한 배열을 반환하는 메소드 
//		삭제는 a[idx]보다 뒤에 있는 모든 요소를 하나씩 앞으로이동
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수 입력");
		int a = sc.nextInt();
		int [] b= new int[a];
		for(int i =0; i<a; i++)
		{
			System.out.println("b["+i+"]");
			b[i]=sc.nextInt();
		}
		System.out.println("삭제할 인댁스");
		int c= sc.nextInt();
//		삭제 된 인댁스 값 받기
		int []d=removeArray(b, c);
//		삭제도니 인댁스 값 출력 하기 . 새로운 배열 생생 후 배열의 길이 만큼 받기!
		for(int i =0; i<d.length; i++)
		{
			System.out.println("b["+i+"]"+b[i]);
		}
		

	}

}
