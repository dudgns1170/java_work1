package Ex;

//뒷수습

class Cal{
	int a,b;
	public void Set(int a, int b)
	{
		this.a =a;
		this.b=b;
	}
	public void divide()
	{try
	{
		System.out.println("결과");
		System.out.println(this.a/this.b);
		System.out.println(" 입니다");
	}catch(Exception e)
	{
		System.out.println("\n\ne.getMessage()\n"+e.getMessage());
//		System.out.println("\n\ne.toStrig()\n"+e.toString());
//		 경로 추척 하는 오류 문구
//		System.out.println("\n\ne.printStackTrace()");
//		e.printStackTrace();
	}
	finally
	{
//		finally는 생략가능 하며 예외와 무관하게 항상 실행해야할 내용이 있을 경우애만 작성.
	}
	System.out.println("Divide End");
	}
}

public class ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c1 =new Cal();
		c1.Set(10, 0);
		c1.divide();
	}

}
