package WhileDemo;

public class whiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4/16
		// while 반복 변수를 사용한 제어
		int a = 0;
		while ( a <10)
		{
			System.out.println(a+"hi");
			
			//추가 사용 방법 대입연산사 활용 및 기타 방법
			//a++;
			a=a+1;
			//a +=1;
		}
		{
			//2의 배수 출력 예시 
			System.out.println((a+1)*2);
		}
		
		System.out.println();
		/*
		//for 문 구성 법 (1,초기화식;  2. 조건식; 3.증감식)
		
		for(int i =5; i<=10; i=i+2)
		{
			System.out.println(i);
		}
		
		//break 문을 쓰면 if 를 통한 조건문 작성 후 조건에 해당하는 것만 출력 된후 for 문을 빠져 나옴.
		 * break의 사용위치에 따라 출력결과가 다름. 주의.
		for(int c=0; c <5; c++)
		
		{
			if(c==3)
				break;
			System.out.println(c);
		}
		System.out.println();
		
		//continue를 사용시 if 문의 조건에 해당하는 숫자는 조건에 정립하므로 건너뛰고 나머지 조건들이 출력됨.
		for(int b=0; b<=5; b++)
		{
			if(b==3)
				continue;
			System.out.println(b);
		}
		
		System.out.println(); */
		
		//반복문에 중첩
		//구구단 출력
		 /* for()
			for()
			{
				System.out.println(); }
				System.out.println(); */
		
			int i = 2;
			for (int j=1; j<10; j=j+1 )
			{
				System.out.println(i+"X"+j+"="+ i*j );
				
			}
			
			//do-while 문 실행문이 먼저 들어간 후 조건식 판단
			int v =0 ;
			do {
				System.out.println(v++);
				if(v==5);
			}
			while(v<10);
			System.out.println();
			//break 중첩 사용중 반복문 종료시 break(반복문 처음 에 label를 붙여서 사용)
			/*label: for() {
				for()}*/
			for(int b=1; b <=10; b++)
			{
				if(b%2 != 0)
				{continue;
					}
			System.out.println(b);
			}
			//
				
			
	}

}
