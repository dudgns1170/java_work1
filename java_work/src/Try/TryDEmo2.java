package Try;
//A 클래스(객체)생성
class A
{
	private int [] arr = new int[3];
	
	A() {
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}
	public void z(int first ,int second)
	{
		try {
//			
		System.out.println(arr[first]/arr[second]);
		}
//		
		catch (ArrayIndexOutOfBoundsException e)
		{
//			
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(ArithmeticException e)
		{
//			
			System.out.println("ArithmeticException");
		}
//		기타 예외 발생시 처리
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		finally {
			System.out.println("finally");
		}

	}

}
public class TryDEmo2 {
	public static void main(String[] args) {
		A a= new A();
		a.z(10,1);
		a.z(1, 0);
		a.z(2, 1);
//		arr first 10번쨰  second1번쨰
	}

}
