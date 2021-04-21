package io; //파이썬의 입력과 같다. io 는 in out의 약자

import java.util.Scanner; // 말 그대로 스캐너 입력값을 스캔한다고 생각하면 편할듯..?
import java.io.*; //io.* io 패키지의 모든 모듈을 가져옴

public class Scanner3Demo {

	public static void main(String[] args) {
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

// 요거는 말그대로 입력 받고 출력하고 반복하기