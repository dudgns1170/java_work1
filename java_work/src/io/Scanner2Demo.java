package io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "��� �� : ";
		System.out.print("���� �Է��ϼ��� : ");
		while(sc.hasNextInt()) {
			System.out.print(str);
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();

	}

}
