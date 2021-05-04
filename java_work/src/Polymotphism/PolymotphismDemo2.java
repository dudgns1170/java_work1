package Polymotphism;
class A{
	public String x()
	{System.out.println("hi");
	return "x";}
}

class B extends A{
	public String y()
	{
		return "y";
	}
}

class C extends B{
	public String z()
	{
		return "z";
	}
}
public class PolymotphismDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B(); 
		//B obj1 = new B();
		obj.x();
		// y메서드는 A 타입으로되어 있기 때문에  출력이 안된다. 
//		obj.y();

	}

}
