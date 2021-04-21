package LoginDemo;

public class LoginDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String id = args[0];
	String password =args[1];
	
	if (id.equals("young") ||id.equals("k884") || id.equals("sorid") && password.equals("1234"))      
	{
		System.out.println("right");
	}
	else
	{
	System.out.println("wrong");
	}

	}
}