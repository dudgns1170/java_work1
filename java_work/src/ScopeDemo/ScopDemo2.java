package ScopeDemo;

public class ScopDemo2 {
	static int i; //전역변수 
	
	static void a()
	{
		//int i = 0; //지역 변수 (안에서만 사용)
		i= 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =  0; i <5; i++)
		{
			a();
			System.out.println(i);
		}
		
		

	}

}
