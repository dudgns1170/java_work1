package Example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4/29 자바 문제풀이
		//1번 3개의 정수 값을 입력받아 작은순으로 정렬
		
//		Scanner sc= new Scanner(System.in);
//		
//		System.out.println("정수 A");
//		int a =sc.nextInt();
//		System.out.println("정수 B");
//		int b = sc.nextInt();
//		System.out.println("정수 C");
//		int c = sc.nextInt();
//		if(a>b) {
//			int sum =a;
//			a= b;
//			b = sum;
//		}
//		if(b>c)
//		{
//			int sum= b;
//			b=c;
//			c= sum;
//		}
//		if(a>b)
//		{
//			int sum= a;
//			a=b;
//			b= sum;
//		}
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
	
		   int num[] = new int[3];
           Scanner input = new Scanner(System.in);
     System.out.println("숫자 3개를 입력하세요.");
     
           for (int i = 0; i < num.length; i++) {

                  num[i] = input.nextInt();

           }
           for (int i = 0; i < num.length; i++) {
              for (int j = i+1; j < num.length; j++) {
                   if (num[i] > num[j]) {
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                    } 
                   else {
                	   break;
                	   }
                   }
              }
           for (int sort : num) {

                  System.out.print(sort + " ");

           }

     }


}

