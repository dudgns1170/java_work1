package Try;
//예외 만들기
class Cal
{
	int a,b;
	public void Set(int a, int b)
	{
		this.a=a;
		this.b=b;
			 
	}
	public void divide() {
		if(this.b ==0)
		{
			throw new ArithmeticException("0으로 나누는것은 허용되지 않습니다.");
			
		}
		try{
		System.out.print("계산결과");
		System.out.print(this.a/this.b);
		System.out.print(" 입니다");
		//예외 발생 구문처리	
		//    리셉션(오류 상황에따라 변경될수 있다.
		}catch(Exception e) {
			//							  리셉션 의 겟메서드
			System.out.println( " 오류 발생"+e.getMessage());
			System.out.println("\n\ne.toStiring"+e.toString());
			System.out.println("\n\ne.printSTackTrace()");
			e.printStackTrace();
		}
	}
	}
public class TryDEmo5 {
	public static void main(String[] args)
	{
		Cal c1= new Cal();
		c1.Set(1, 0);
		
	try{c1.divide();
	
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	}
	

}
