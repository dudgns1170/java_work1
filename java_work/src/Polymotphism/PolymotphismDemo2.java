package Polymotphism;
class A{
	public String x()
	{return "x";}
}

class B extends A{
	public String y()
	{
		return "y";
	}
}
public class PolymotphismDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 B obj = new B();
		obj.x();
		//
		obj.y();

	}

}
