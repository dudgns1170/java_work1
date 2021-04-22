package object;
// 상속 설명
//	
class Cal
{
	int left , right;

public void SetOperands(int left, int right)
{
	this.left = left;
	this.right = right;
	}
public void sum()
{
	System.out.println(this.left+this.right);
	}
public void avg()
{
	System.out.println((this.left+this.right)/2);
	}

}
public class Calculator6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal C= new Cal();
		C.SetOperands(12, 18);
		C.sum();
	}

}
