package Try;

class calculator
{
	int left,right;
	public void Set(int left, int right)
	{this.left=left;
	this.right=right;}
	public void divide() {
		try{
		System.out.print("계산결과");
		System.out.print(this.left/this.right);
		System.out.print(" 입니다");
		//예외 발생 구문처리	
		//    리셉션(오류 상황에따라 변경될수 있다.
		}catch(Exception e) {
			//							  리셉션 의 겟메서드
			System.out.println( " 오류 발생"+e.getMessage());
		}
	}
	}

public class TryDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c1= new calculator();
		//10/0이 나누기가 안되므로 컴파일 에러 발생.
		c1.Set(10, 0);
		c1.divide();
		
		calculator c2 =new calculator();
		c2.Set(10, 5);
		c2.divide();
	}

}
