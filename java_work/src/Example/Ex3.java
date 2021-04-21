package Example;

class Num{
	static double PI = 3.14;
	static int base =0;
	int a, b;
	
	public void Set(int a , int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public void sum()
	{
		System.out.println(this.a+ this.b+base) ;
	}
	public  void avg()
	{
		System.out.println((this.a+this.b)/2);
	}
}

	public class Ex3 {
		public static void main(String [] args)
		{
			Num N = new Num();
			N.base = 10;
			N.Set(10, 20);
			N.sum();
			}
		}
		
		
	
	
	


