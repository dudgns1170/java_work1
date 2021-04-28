package Example;
//오버라이딩 ex
//ㅂ부모와 자식 메서드(로직)이 중복 되어 문제가 생길 수 있다.
//중복은 제거한다.
//메소드 성명을 변경.

class Cal1{
	int a,b;
	public void Set(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public void sum() {
		System.out.println(this.a+ this.b);
	}
	public int avg() {
		return ((this.a+this.b)/2);
	}
}

class Sub1 extends Cal1
{
public void sum()

{System.out.println(this.a+this.b);


}
// 오바라이등을 할 수없다. 
//super = 중복제거 방법
public int avg() {
	//return ((this.a+this.b)/2);
	return super.avg();
}

public void Sub() {
	System.out.println(this.a - this.b);
	
}
}
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub1 c1 = new Sub1();
		c1.Set(23, 17);
		
		c1.avg();

	}

}
