package Access;



class A
{
	public String y()
		{return "public void y()";}
	
	private String z() {
		return "public  void z()";
	}
	public String x()
	{ 
		return z();
		}
}
public class AccessDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =new A();
		System.out.println(a.y());
		// private 는 접근 제한자로 분리되어 있어 접근이 제한 됨.
		//동일한클레스 에서만 사용이 된다.
		//System.out.println(a.z());
		System.out.println(a.x());
	}

}
