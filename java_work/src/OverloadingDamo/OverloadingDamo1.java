package OverloadingDamo;

class Overloading
{
	void A()
	{
		System.out.println("void A");
	}
	void A(int arg1)
	{
		System.out.println("void A(int arg1)");
	}
	void A(String arg1)
	{
		System.out.println("void A(String arg1)");
	}
	//int A()
	{
		System.out.println("void A()");
	}
}

public class OverloadingDamo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading or = new Overloading();
		or.A();
		or.A(1);
		or.A("hi");

	}

}
