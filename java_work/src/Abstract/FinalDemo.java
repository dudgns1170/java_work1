package Abstract;

class Calus


{
	//고정값으로 한다.
	static final double PI = 3.14;
	int a,b;
	public void Set(int a, int b) {
		this.a=a;
		this.b=b;
		
	}
	
public void sum()
{
	System.out.println(this.a+this.b);
	}
public void avg()
{
	System.out.println((this.a+this.b)/2);
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calus c1 =new Calus();
		System.out.println(c1.PI);
//		cal.PI=10;
	}

}
