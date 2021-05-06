package Polymotphism;

//인터페이스 정의
interface I{
	public String A();

}
interface I2{
	public String B();
}
//D클레스가 I인터페이스들 을 구현 하고 있다.
class D implements I, I2
{
	//재정의 되고 있는 것 오버라이딩
	public String A()
	{System.out.println("A");
	return "A";}
	public String B()
	{
		System.out.println("B");
		return "B";
	}
}
public class PolymotphismDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//D클레스가 인스턴스화 뙬떄 데이터화를 I
		// 객채 생성 타입을 변경하여 D를 가져와서 객채화 
		D obj = new D();
		I obj2 = new D();
		I2 obj3 = new D();

		obj.A();
		obj.B();

		obj2.A();

		//obj2.B();

		obj3.B();

		//		obj3.A();






	}
}


