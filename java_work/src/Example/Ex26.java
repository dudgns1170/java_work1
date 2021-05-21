package Example;

import java.util.Random;
import java.util.Scanner;

public class Ex26 {
	//5/20일 자바 문제 풀이

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번 5개의 정수로 구성된 그룹의 전체 합계(전체 그룹의 합)을 구하는 프로그램 작성
		//전체 10개의 그룹이 있으며 각 정수 값은 키보드로 입력 한다.
		// 99999 입력은 전체 종료 88888은 해당 그룹 종료 
		Scanner sc = new Scanner(System.in);
		/*System.out.println("정수를 더합니다");
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
		System.out.println("합계는"+sum);*/
//		5/21일 문제풀이
//		1번 숫자 맞추기 게임에서 숫자의 범위를 0~99까지 설정
//		플레이어가 입력할수 있는 횟수를 제한하도록 작성
/*		Random ra =new Random();
		int num =ra.nextInt(100);

		final int cnt = 6;
//		 최 대입력 횟수
		int Cnt = cnt;
//		남은 횟수
		int input;
//		System.out.println(num);
		
		do {
			input= sc.nextInt();
			System.out.println("숫자를 입력:");
			System.out.println("남은 횟수는"+(Cnt--));
			if(input > num)
				System.out.println("더 작은수 입니다.");
			else if (input<num)
				System.out.println("더 큰 숫자 입력");
			
		}while(input != num && Cnt >0);
		if(input == num)
		System.out.println(cnt+"회 만에 맞추었습니다.");
		else
			System.out.println("정답은"+num);
*/
		

	}

}
