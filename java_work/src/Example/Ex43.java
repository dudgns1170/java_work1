package Example;

import java.util.Random;
import java.util.Scanner;

public class Ex43 {
	
	  static Scanner sc= new Scanner(System.in);
	public static boolean confirmRetry()
	{
		int i;
		do {
			System.out.println("한번더? : yes1 , no2");
			 i = sc.nextInt();
		}while(i != 1 && i != 0);
		return i == 1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6/24일 문제풀이
//		1번 다음 4개의 계산 문제 중 하나를 무작 위로 출제하는 암산 훈련 프로그램을 작성.
//		이때 xyz에 3자리의 정수값을 난수로 생성,
//		xyz xyz xyz
//		 랜덤으로 3자리 수 출력 
		Random ra= new Random();
		do {
		int a= ra.nextInt(900)+100;
		
		int b = ra.nextInt(900)+100;
		int c  = ra.nextInt(900)+100;
		int patten = ra.nextInt(4);
//		정답 계산
		int sum ;
		int input;
		System.out.println(a+"+"+b+"+"+c+"=");
		switch (patten) {
		case 0: sum = a+b+c;
			break;
		case 1 : sum=a+b-c;
		break;
		case 2 : sum = a-b+c;
		break;
		default: sum =a-b-c;
			break;
			
		}
		
		while(true)
		{
			System.out.println(a+((patten<2)?"+":"-")+
							b+((patten%2==0)?"+":"-")+
							c+"=");
			input=sc.nextInt();
		
			if(sum == input)
			{
				System.out.println("정답");
				break;
			}
			else
			{
				System.out.println("오답");
		
			}
		}
		}while(confirmRetry());
		
	
}
}
