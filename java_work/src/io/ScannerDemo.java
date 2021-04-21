package io;

import java.util.Scanner; // 말 그대로 스캐너 입력값을 스캔한다고 생각하면 편할듯..?

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //스캐너 객체 생성
		int i = sc.nextInt(); //입력값이 입력되기 전까지 여기서 멈춰있다.
		System.out.println(i*1000);
		sc.close();

	}

}
