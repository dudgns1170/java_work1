package Example;
//d오버로딩
//P380~
//메서드 명이 동일하다.
//오버 로딩 =다양한 매개 변수를 사용하기 위해 사용된다.
//오버라이딩 =
class A{
	int a ,b;
	//
	int c =0;
	public void a(int a , int b) {
		this.a =a;
		this.b =b;
	

	}
	public void a(int a, int b, int c){
		// 중복을 방지
		this.a(a, b);
		//this.a =a;
		//this.b =b;
		this.c =c;
	}
	public void sum() {
		System.out.println(this.a+this.b+this.c);
	}
	public void avg() {
		System.out.println((this.a+this.b+this.c)/3);
	}
}

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A b = new A();
		b.a(10, 20);
		b.sum();
		b.avg();
		b.a(10, 30,40);
		b.sum();
		b.avg();

	}

}
