package Abstract;

abstract class A
{
	// 밑에는 메서드 추상 메서드
	public abstract int b();
	// 본체가 있는 경우는 abstract가 있어서는 안된다.
//	public abstract int c();
//	{
//		System.out.println("hello");
//	}
	
	// 본체가 있는 메소드는 abstract키워드를 가질수 없다.
	//추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
	public void d()
	{
		System.out.println("world");
		}
	
}
//A 클레를 사용하기 위헤선 자식 클레스를 생성하여 상속한다.
//단 단순 상속만 하면 위쪽에서사용한 메서드로 인한 오류가 발생하며.
// A클레스에서 사용된 메서드를 사용하여야 실행된다.
//A클레스 사용 오류 B클레스 사용하여 A클레서 사용 A클레스 추상크레스이미로 오버라이딩하여 재정의 후 사용
class B extends A
{

	//오버라이딩
	public int b() {
		return 1;
	}
	
}



public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Abstract는 클래스를 불러 올수 없다.
		//A a= new A()
		B b = new B();
		b.d();
		
	}

}
