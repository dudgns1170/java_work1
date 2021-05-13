package Example;

import java.util.Scanner;

public class ExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		int input = sc.nextInt();
		int sum =0;
		for(int i =0; i<=input; i++)
		{	System.out.print(i);
		if (i != input)
			System.out.print("+");
		
		sum += i;
		}
		System.out.println("="+sum);
	}

}
