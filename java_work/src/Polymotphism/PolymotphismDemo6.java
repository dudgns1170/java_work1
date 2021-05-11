package Polymotphism;
//다형성의 예시
//인터페이스로 나열,
interface father{}

interface mother{}

interface programmer
{
	public void coding();
	}

interface believer{}

// 스티븐 클레스는 아래와같은 3가지 인터페이스를 갖고 있다.
class Steve implements father,programmer,believer{
	public void coding() {
		System.out.println("fast");
	}
}
//레미첼 클레스는 아래와 같은은 2가지인터페이스를 갖고잇다.
class Rachel implements mother,programmer{
	public void coding() {
		System.out.println("elegance");
	}
}
public class PolymotphismDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두명의 코딩 스타일일 틀리기에 메소드를 만들어 호출
		programmer empolyee1 = new Steve();
		programmer empolyee2 =new Rachel();
		
		empolyee1.coding();
		empolyee2.coding();

	}

}
