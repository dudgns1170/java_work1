package Polymotphism;

//오버로딩 예시
class O
{
	public void a(int param)
	{
		System.out.println("숫자");
		System.out.println(param);
	}
	public void a(String param)
	{
		System.out.println("문자");
		System.out.println(param);
	}
	}


public class PolymotphismDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		O o= new O();
		o.a(2);
		o.a("hi");
	}
	

}
