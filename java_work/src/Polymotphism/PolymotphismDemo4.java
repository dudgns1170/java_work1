package Polymotphism;

abstract class cal
{
	int a,b;
	public void set(int a , int b)
	{
		this.a=a;
		this.b =b;
		
	}
	int _sum()
	{
		return this.a+this.b;
	}
	//추상화 메서드  
	//각 구현 크레스에서 가져가서 재정의 해서사용
	public abstract void sum();
	public abstract void avg();
	public void run()
	{
		sum();
		avg();
	}
}
class calplus extends cal{
	public void sum() {
		System.out.println("+sum:"+_sum());
	}
	public void avg() {
		
		System.out.println((this.a+this.b)/2);
	}
}

class calminu extends cal
{
	public void sum()
	{
		System.out.println("-sum:"+_sum());
	}
	public void avg()
	{System.out.println("-avg:"+(this.a+this.b)/2 );}
}

public class PolymotphismDemo4{
	//오버로딩
	public static void execute(calplus c1)
	{
		System.out.println("실행결과");
		c1.run();
	}
	public static void execute(calminu c2)
	{
		System.out.println("실행결과");
		c2.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//좋은 설계는 아니다.
		calplus c1= new calplus();
		c1.set(10,20);
		
		execute(c1);
		calminu c2 = new calminu();
		c2.set(40, 20);
		execute(c2);
		

}

}
