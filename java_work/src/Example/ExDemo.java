package Example;

import java.util.Scanner;

public class ExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		int input;
		do {
			input= sc.nextInt();
			
		}while(input<2);
		int a;
		for(a=2; a<input;a++)
		{
			if(a%2==0)
				{System.err.println("소수");
				break;}
			else
			{
				System.out.println("소수가 x");
			}
		
		}
	}

}
