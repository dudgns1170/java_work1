package MathodDemo;
import java.io.*; //무시
public class mathod5 {

	public static String number(int init ,int limit){
		// TODO Auto-generated method stub
		//입/출력값 가져오기
		int i = init;
		String output="";
		
		while(i < limit)
		{
			output += i;
			i++;
		}
		return output;
	

	}
	//사용 방법
	public static void main(String [] args) {
		String result =number(1, 5);
		System.out.println(result);
		
	
	try {
		BufferedWriter out= new BufferedWriter(new FileWriter("out.txt"));
		//파일을 만들떄 사용 되는 라이브러리, FileWriter,
		//result값을 out.txt 파일에 저장하는것 
		out.write(result);
		out.close();
		}catch(IOException e) {
			
		}

	}
}
