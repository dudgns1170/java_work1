package Abstract;

//추상 메서드 사용 방법 ex
//본 프로그램의 목적을 파악하는것이 중요.
//제약을 두는 것.
abstract class Cal{
	int a ,b;
	public void  Set(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	//중복 제거하기 위해 밑에 방식을 활용
	// _ 표시는 default
	int _sum() 
	{
	 return this.a+this.b;	
	}
	// avg또한 밑에 방식으로 종복을 제거할 수 있다.
	int _avg()
	{
		return (this.a+this.b)/2;
	}
	
	//추상적으로정의 고객들이 요구사항이 다항할수 있으니.
	//서명 만 작성 = 서명이란 몸체 없이 작성하는 경우
	//사용자화 하기 위해. 가이드 역할. 기본틀.
	//기본적인 가이드라인 제시.
	public abstract void sum();
	public abstract void avg();

	//run 메서드 사용 시 밑에 메서드들이 같이 나옴.
	public void run()
	{
		sum();
		avg();
	}
}
//상속을 받아 상용.

class CalDemoPlus extends Cal
{
	public void sum()
	{
		System.out.println("+sum"+_sum());
	}
	public void avg()
	{
		System.out.println("+sum"+_avg());
	}
}


class CalDemoMiuns extends Cal
{
	public void sum()
	{
		System.out.println("-sum"+_sum());
	}
	public void avg()
	{
		System.out.println("-avg"+(this.a+this.b)/2);
	}
}
//추가적으로 사용하기 위해선 클레스 생성후 상속 
//클레스는 상속을 강제.

public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		CalDemoPlus c1 = new CalDemoPlus();
		c1.Set(20,30 );
//		c1.sum();
//		c1.avg();
		c1.run();
		
		CalDemoMiuns c2 =new CalDemoMiuns();
		c2.Set(20, 30);
		c2.avg();
		c2.sum();

	}

}
