package OverloadingDamo;



public class OverloadingDamo2 extends Overloading{
	//오버로딩
	void A(String arg1, String arg2)
	{
		System.out.println("void String");
	}
	//오버라이딩
	void A()
	{
		System.out.println("void A");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDamo2 od = new OverloadingDamo2();
		od.A(0);
		od.A(null, null);

	}
	

}
