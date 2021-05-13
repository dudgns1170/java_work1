package Example;

class parent{
	void method1() {System.out.println("1");}
	void method2() {System.out.println("2");}
}
class chile extends parent
{
//	오버라이딩
	void method2() {System.out.println("3");
	}
	void method3() {System.out.println("4");}
	
}

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chile ch =new chile();
		ch.method2();
		ch.method1();
		ch.method3();
		System.out.println();
		parent pa = new parent();
		pa.method1();
		pa.method2();

	}

}
