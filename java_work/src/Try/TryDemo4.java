package Try;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
import java.io.*;
//예외 사슬 ex
//예외 떠넘기기
class B{
	void run() throws FileNotFoundException, IOException{
	
		 BufferedReader bReader = null;
		 String input =null;
		 bReader =new BufferedReader(new FileReader("out.txt"));
		try {
			input = bReader.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(input);
	}
}
class C{
	void run() throws IOException,FileNotFoundException
	{
		B b =new B();
		b.run();
	}
}
public class TryDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		try
		{
			c.run();
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("실행파일이 없다.");
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
