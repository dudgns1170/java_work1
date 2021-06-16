package Example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/16일 문제 풀이
//		요일을 표시하는 프로그램을 작성 하시오
		/*Scanner sc = new Scanner(System.in);
		String [] date= {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
		String [] date1= {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		Random re = new Random();
//		 반복문은 사용 하지 않아도 됨. 정삭적인 출력을 확인하기 위해서 작성.
//		for(int i =0; i <=date1.length ; i++)
//		{
////			System.out.println(date1[i]);
//		}
		System.out.println("해당요일을 영단어로 바꿔 쓰시요. 소문자로");
//		   초기화
//			int a=0;
//			월~일 랜덤 값 
//			a= re.nextInt(7);
//			한번더 를 묻는 변수 
			int ret = 0;
//			중복 피하기
//			변수 선언 0부터 시작 되기 때문에 -1부터 시작하여 중복을 피함.
			int last = -1 ;
			do{
				int a=0;
				do {
				a= re.nextInt(7);
				}while(a== last);
//			라스트 값은 변수 초기화 된것
			last =a;
			while(true)
		
		{ 
			System.out.println(date1[a]+":");
//		    답으로 입력받은 값을 저장
			String input=sc.next();
//			      문자열 비교 
		if(input.equals(date[a])) {
			System.out.println("정답");
			break;
		}
		else {
			System.out.println("오답");
		}
		}
		System.out.println("다시 1번 ");
		ret = sc.nextInt();
		}while(ret ==1);
	}*/
//	2번 문제
//		배열 변수의 값으 표시 하는 프로그램을 작성하시오
//		배열을 생성
	/* int [] arr1 = null;
		int [] arr2 = new int[5];
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2);
		System.out.println(arr1); */
		
//		3번 2차원 행렬인 3행4열의 행렬을 곱하느 프로그램을 작성.
//			입력 값
		Scanner sc = new Scanner(System.in);
//		2차원 행렬 선언
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		int[][] c = new int[4][4];
		

		System.out.println(a.length+" "+b[0].length+" "+a[0].length);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("a["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println("b["+i+"]["+j+"] : ");
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("ab의 곱");
		for(int i =0; i< a.length;i++) {
			for(int j=0;j< b[0].length;j++) {
				int mul=0;
				int sum=0;
				for(int k=0; k< a[i].length;k++) {
					mul=a[i][k]*b[k][j];
					sum = sum+mul;
				}
				c[i][j] = sum;
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}


	}
	}
