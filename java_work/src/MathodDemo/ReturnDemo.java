package MathodDemo;

public class ReturnDemo {
	//one이라는 함수를 사용하여 입/출력하는 연습
	//if, else if 사용

	public static String one(int i) {
		if(i==0) {
			return "zero";
		} 
		else if (i==1) {
			return "one";
			}
		else if(i==2)
		{
			return "two";
		}
		return "NONE";
		
	}
	
	public static void main(String [] args) {
		System.out.println(one(2));
	}
	
	

}
