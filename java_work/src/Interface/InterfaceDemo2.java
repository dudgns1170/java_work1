 package Interface;
//가짜 클레스 
class CalculatorDummy{
	public void Set(int a, int b, int c) {}
	public int sum()
	{
		return 60;
	}
	public int avg()
	{
		return 20;
	}
	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorDummy c = new CalculatorDummy();
		// 호출은 가능하지만 사용 범위는 없다.
		c.Set(10,20, 30);
		System.out.println(c.sum()+c.avg());

	}

}
