package ScopeDemo;

public class ScopeDemo3 {
	
	static void a()
	{
		String title = "coding fuck"; //A 매서드의 지역변수로 지정되어 빠져나오는 순간 사라짐
		//System.out.println(title);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScopeDemo3.a();
	}

}
