//package Polymotphism;
//
//class C{
//	public String x()
//	{
//		return "A.x";
//	}
//}
//class D extends C
//{
//	public String x()
//	{
//		return "B.x";
//	}
//	public String y()
//	{
//		return"y";
//	}
//}
//
//public class PolymotphismDemo3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//우선 순위는 부모 클레서의 오버 라이딩 한것.
//		//y는 a에정의 되어 있지 않아 실행되지 않는다.
//		C obj= new D();
//		System.out.println(obj.x());
//		
//	}
//
//}
