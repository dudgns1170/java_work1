package LoginDemo;

public class logindemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩 ex
		//두개의 args를 받아 사용 
		String id =args[0];
		String password = args[1];
		if (id.equals("young") && password.equals("1234"))      
		{
			System.out.println("right");
		}
		else
		{
		System.out.println("wrong");
		}
		
		System.out.println();
	
		
		}
		

}
