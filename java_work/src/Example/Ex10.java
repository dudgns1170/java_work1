package Example;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//실수값 랜덤으로 생성하 0.0~ 1.0미만
		Random ra = new Random();
		double x1 = ra.nextDouble();
		System.out.println(x1);
		System.out.println();
		System.out.println(x1 +ra.nextDouble()*10);
		
		System.out.println();
		
		System.out.println(ra.nextDouble());
		double i = -1;
		System.out.println(i+2  *ra.nextDouble());
		
		System.out.println(Math.random()*10);
		System.out.println();
		System.out.println(Math.random()-1);
		//0.0~2.0
		
		System.out.println();
		//키보드 입력한 성과 이름으로 인사하는 프로그램을 작성.
		//출력 : 안녀 이름
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("이름을 입력해주세요:");
		//System.out.println("안녕하세요. "+sc.next()+"님");
		System.out.println("입력:");
		//주소 입렷시 출력값 가져 오기
		//NEXT 사용시 띄어쓰기 하면 뒤에는 안나옴.
		
		
		String adss = sc.nextLine();
		System.out.println("입력은:"+adss);
		sc.close();
		
		
		
	}
	}

