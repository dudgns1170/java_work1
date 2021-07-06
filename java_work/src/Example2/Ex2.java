package Example2;

//차량의 이름 , 번호,  폭,높이, 길이, 현재 위치 ,x,y 좌표 탱크 용량, 남은 연료 연비,
class Car{
	// 필드 생성
	private String name;
	private String carname;
	private int a;
	private int b;
	private int c;
	private double d;
	private double e;
	private double f;
	private double g;
	private double  z;
	// 생성자 생성
	Car(	String name,String carname,int a,int b,int c,
			double d,double e,double f)
	{
		this.name =name;
		this.carname= carname;
		this.a = a;
		this.b =b;
		this.c= c;
		//탱크용량
		this.d= d;
		// 기름 용량이 탱크 용량을 넘을 수 업으니 연산자 활용
		this.e =(e <= d)?e:d;
		this.f =f;
		g=0.0;
		z=0.0;
	}
	public  double  getX( )
	{
		return g; 
	}
	public double getY()
	{
		return z;
	}
	void  getFull(double f) {
		
	}
	//x 방향으로 dx이동, y방향으로 dy이동
	double movo(double dx, double dy)
	{
		double g =Math.sqrt(dx*dx +dy*dy);
		double ref =g/f;
		if (ref >f)
		{
			return 0;
		}
		else {
			f -=ref;
			g +=dx;
			z += dy;
			return ref;
		}
	}

	void Spec() {
		System.out.println("이름"+name);
		System.out.println("번호"+carname);
		System.out.println("전폭"+a);
		System.out.println("전고"+b);
		System.out.println("전장"+c);
		System.out.println("탱크"+d);
		System.out.println("연비"+e);
	}
}
public class Ex2 {

	public static void main(String[] args) {
		Car car = new Car("코나", "32더1234", 1820, 1650, 4545, 199.8, 8.6, 0);
		car.Spec();
		car.movo(15, 25);
		System.out.println("g현재 위치"+car.getX()+car.getY());
		System.out.println("연료량");
		double usedf=car.movo(10.1, 20.2);
		System.out.println("사용한 연료"+usedf);
		System.out.println("g현재 위치"+car.getX()+car.getY());
	}

}
