package MathodDemo;

public class mathod4 {

	public static String num(int init ,int limit){
		// TODO Auto-generated method stub
		int i = init;
		String output= "";
		while (i < limit)
		{
			output +=i;
			System.out.println(output);
			i++;
		}
		return output;
		
	}
	public static void main(String [] args) {
		String result = num(1,7);
		System.out.println(result);
	}

}
