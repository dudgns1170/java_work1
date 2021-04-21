package LoginDemo;

public class AndDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//and 연산자 && 로 표시됨 
		if (true && true)
			{System.out.println(1);}
		if (true && false)
		{
			System.out.println(2);
		}
		if (false && false)
		{
			System.out.println(3);
		}
		System.out.println();
		//or 연산자 || 로 표시됨
		if (true || true)
		{
			System.out.println(1);
		}
		if (true || false)
		{
			System.out.println(2);
		}
		if (false || false)
		{
			System.out.println(3);
		}
		System.out.println();
		// ! (not) 연산자
		if (!true)
		{
			System.out.println(1);
		}
		if(!false)
		{
			System.out.println(2);
		}
		
	}

}
