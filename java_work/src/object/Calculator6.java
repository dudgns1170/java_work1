package object;
// 상속 설명
//재활용, 유지보수 측면에 용이.
class Cal//부모클레스 
{
	int left , right;

public void SetOperands(int left, int right)
{
	this.left = left;
	this.right = right;
	}
public void sum()
{
	System.out.println(this.left+this.right);
	}
public void avg()
{
	System.out.println((this.left+this.right)/2);
	}

}

class Sub extends Cal //자식 클레스1
//부모 클레스는 상속 받기 위해 extends 사용후 부모 클래스 호출
//						(확장이라는 의미를 갖고있다,(상속하다))
//기존의 클레스를 수정하지 않고 세로운 클레스 작성. 별도의 고유 특성을 갖고있다.
//Cal클레스에서는 sub함수를 사용 할 수 없다.

	
{
	public Sub(int left , int right)
	{
		this.left = left;
		this.right = right;
	}

	public void sub() {
	System.out.println(this.left - this.right);	
	}
}
//자식클래스2 작성

class Mult extends Cal
{
	public void mult()
	{
		System.out.println(this.left * this.right);
	}
}
//자식 클레스2 의 자식 클레스
class Divison extends Mult
{
	public void  divison ()
	{
		System.out.println(this.left / this.right);
	}
}
public class Calculator6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal C= new Cal();
		C.SetOperands(12, 18);
		C.sum();
		
		
		Cal c1= new Cal();
		c1.SetOperands(20, 40);
		c1.avg();
		System.out.println();
		
		//문법이니 숙지 필요.
		//자식 클레스 1
		Sub c2= new Sub(30,20);
		
		
		c2.sum();
		c2.sub();
		System.out.println();
		
		//자식클레스 2
		//Sub 함수는 사용 할 수가 없다. 자식클레스 이기에.
		Mult c3 = new Mult();
		c3.SetOperands(20, 5);
		c3.sum();
		c3.avg();
		c3.mult();
		
		System.out.println();
		
		// Mult 자식 클레스를 상속받은 Divison 자식 클레스의 객체
		Divison c4 = new Divison();
		c4.SetOperands(20, 10);
		c4.sum();
		c4.avg();
		c4.mult();
		c4.divison();
	}

}
