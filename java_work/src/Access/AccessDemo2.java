package Access;
class Cal
{
	private int a,b;
	// 필드에 직접적인 권한이 없음.
	
	public void Set(int a, int b)
	{this.a= a;
	this.b =b;}
	// 리턴값을 주어 필드에서 사용할 준비를 해준다.
	private int _sum() {
		return this.a + this.b;
	}
	public void sum() {
		System.out.println("++++"+_sum());
	}
	public void sumD()
	{
		System.out.println(_sum());
	}
	
}
public class AccessDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c= new Cal();
		c.Set(10, 20);
		c.sum();
		c.sumD();

	}

}
