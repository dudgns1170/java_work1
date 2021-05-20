package Try;

import java.io.IOException;

//예외 던지기
class E{
	void  throwArithmeticException()
	{
		throw new ArithmeticException();
	}
	void throwIOException1()
	{
		try{
			throw new IOException();
		
		} catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	void throwIOException2() throws IOException
	{
		throw new IOException();
	}
}

public class TryDemo6 {
	public static void main(String[] args) {
		
	}

}
