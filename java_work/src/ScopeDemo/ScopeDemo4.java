package ScopeDemo;

public class ScopeDemo4 {
	static int i =5 ; //전역변수 
	
	static void a()
	
	{
		
		int i =10; //지역변수 
		//System.out.println(i);
		b(); // b메서드를 호출
		
	} 
	static void b()
	{
		//int i = 30;
		System.out.println(i);// 5로 출력되는 이유는 전역변수인 static에 할당되어 있는 변수를 출력 해서.
		//a();
	}

	public static void main(String[] args) {
		
		int i =1;
		System.out.println(i);
		ScopeDemo4.a();
		a();
		//ScopeDemo4.b();

	}

}
