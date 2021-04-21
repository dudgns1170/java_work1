package object;

class C1{
	static int static_var =1;
	int a =2;
	
	//클레스 메서드
	static void static_static_()
	{
		System.out.println(static_var);
	}
	
	static void static_instance()
	{
		//클래스 메소드에서는 인스턴스 변수에 접근할 수 없다.
		System.out.println();
	}
	
	void instance_static()
	{
		//인스턴스 메소드에서는 클래스 변수에 접근이 가능하다.
		System.out.println(static_var);
	}
	void instance_instance()
	{
		System.out.println(a);
	}
	
}
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c1= new C1();
		//인스턴스를 이용해서 정적 메소드에 접근 > 성공
		//인스턴스 메소드가 정적 변수에 접근  > 성공 
		c1.static_static_();
		
		//인스턴스를 이용해서 정적 메소드에 접근 > 성공
		//인스턴스 메소드가 정적 변수에 접근  > 실패
		//c1.static_instance();
		
		//인스턴스를 이용해서 정적 메소드에 접근 > 성공
		//인스턴스 메소드가 정적 변수에 접근  > 성공 
		c1.instance_instance();
		//인스턴스를 이용해서 정적 메소드에 접근 > 성공
		//인스턴스 메소드가 정적 변수에 접근  > 성공 
		//클레스는 고정적. 
		C1.static_static_();
		
		//인스턴스를 이용해서 정적 메소드에 접근 > 성공
		//인스턴스 메소드가 정적 변수에 접근  > 실패
		//인스턴스가 할당이 안되어있음.
		//C1.static_instance();
		
		
		

	}

}
