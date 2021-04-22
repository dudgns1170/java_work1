package ScopeDemo;
//전역 변수 = 어떤 위치에서 호풀 가능
//지역 변수 =그 지역내에서만 호출이 가능하다.
// 전역변수 v는 10
//지역변수 는 v = 20
//v= 20이 실행 되는 이유는 지역변수의 우선순위기 전역변수보다 높아서 지역변수 인 20이 출력됨.
//this 는 인스턴스의 자신을 의마하는 값으로  this.v 실행시 전역변수 값을 가져올 수 있음.
class C
{
	//this 해당자
	int v = 10; // 전역 변수
	
	void m()
	{
		
		int v = 20; //지역변수
		System.out.println(v);
		System.out.println(this.v);
	}
}
public class ScopeDemo5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		c1.m();
	}

}
