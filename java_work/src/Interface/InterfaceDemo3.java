package Interface;
class Calculator {
	int a,b;
	public void Set(int a, int b)
	{
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
