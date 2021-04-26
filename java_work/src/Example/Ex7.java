package Example;
//오버라이딩
//final 키웓 용도 학습,
// 타입 변화 학습
//추상클래스 abstract
class Cal{
	int a,b;
	
	public Cal() {}

	public void  Cal(int a, int b)
	{
		this.a = a;
		this.b= b;
	}
	public void Set(int a, int b)
	{
		this.a = a;
		this.b= b;
	}


	public void snm()
{
	System.out.println(this.a + this.b);
	}

	public void avg()
{
	System.out.println((this.a + this.b)/2);
}
}

class Sub extends Cal
//동일한 명칭이 있을경우 생성자 기준으로 우선 실행된다.
{
	public void snm()
	{
		System.out.println("실행결과:"+(this.a+ this.b));
	}
	
	public void sub() {
		System.out.println(this.a -this.b);
	}
	
}

class Mult extends Sub
{
	public Mult(int a, int b)
	{
		this.a=a;
		this.b =b;
	}
	public void Mults()
	{
		System.out.println("실행결과는:"+(this.a*this.b)+"입니다,");
	}
	}

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub c1 = new Sub();
		c1.Set(10, 20);
		c1.snm();
		c1.avg();
		c1.sub();
		
		
		

	}

}
