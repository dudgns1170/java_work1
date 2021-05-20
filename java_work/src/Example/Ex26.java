package Example;

import java.util.Scanner;

public class Ex26 {
	//5/20일 자바 문제 풀이

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번 5개의 정수로 구성된 그룹의 전체 합계(전체 그룹의 합)을 구하는 프로그램 작성
		//전체 10개의 그룹이 있으며 각 정수 값은 키보드로 입력 한다.
		// 99999 입력은 전체 종료 88888은 해당 그룹 종료 
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 더합니다");
//		int input = sc.nextInt();
		int input = 0;
		int sum = 0;
		a:
			for(int i=1; i <=10; i++)
		{
				System.out.println("그룹"+i+" 정수입력");
			b:
				for(int j=0; j<5; j++)
			{
			
				 input = sc.nextInt();
				if(input ==99999)
					break a;
				if (input == 88888)
					continue a;
				sum += input;
				
			}
			if(input == 99999)
				break;
		}
		System.out.println("합계는"+sum);

	}

}
