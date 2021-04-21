package operator;

public class Arithmmeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//4/14일 수업
	//산술 연산자	
	int result = 1+2;
	System.out.println(result);
	result = result -1;
	System.out.println(result);
	result = result * 2;
	System.out.println(result);
	result = result /2;
	System.out.println(result);
	result = result +8 ;
	result = result %7 ;
	System.out.println(result);
	//나머지 연산자
	int a= 3;
	System.out.println(0%a);
	System.out.println(1%a);
	System.out.println(2%a);
	System.out.println(3%a);
	System.out.println(4%a);
	System.out.println(5%a);
	System.out.println(6%a);
	//더하기 문자열 
	String frist = "This is";
	String second = " Show Time";
	String third = frist + second ;
	System.out.println(third);
	// 형변환
	int a1 = 10;
	int a2 = 3;
	
	float c= 10.0F;
	float b= 3.0F;
	
	System.out.println(a1 / a2);
	System.out.println(c/b);
	System.out.println(a1/b);
	
	//단항 연산자
	//
	int i =3;
	i++;
	System.out.println(i);
	i ++;
	System.out.println(i);
	i --;
	System.out.println(i);
	System.out.println(i++); 
	System.out.println(i++); 
	// ++가 앞에 있을 경우  ++먼저 실행 후 i 를 싱행, ++가두 뒤에 있을 경우 i 실행 후 ++ 실행
	System.out.println(++i);
	// 연산자의 우선순위
	
	// 비교와 블린( == 같다)
	System.out.println(1 ==2);
	System.out.println(1==1);
	System.out.println("one"=="two");
	System.out.println("one"== "one");
	
	//(!= 같지 않다)
	System.out.println();
	System.out.println(1 != 2);
	System.out.println(1 != 1);
	System.out.println( "one" != "two");
	System.out.println("one" != "one");
	
	//(> , 왼쪽이 오른쪽 보다 크다)
	System.out.println();
	System.out.println( 10> 20);
	System.out.println(10>2);
	System.out.println( 10 > 10);
	
	//(>= 왼쪽이 오른쪽보다 크거나 같다)
	System.out.println(10 >= 20);
	System.out.println(10 >= 2);
	System.out.println(10 >= 10);
	
	//equals() 문자열 비교시 사용
	
	String a12= "hello world";
	String a13= new String("hello world");
	System.out.println( a12 == a13);
	System.out.println(a12.equals(a13));
	
	}

}
