package object;

class Calculator{
	static double PI = 3.14;
	int left, right;
	
	public void setOperands(int left,int right) {
		this.left = left;
		this.right = right;
		//만들어진 객체를 사용 하는것 this 
		
	}
	
	public void sum() {
		//여기에 지역 변수를 선언하게 되면 우선순위는 지역변수로 변경됨.(다른 메서도도 동일)
	
		
		System.out.println(this.left+this.right);
							// 전역 변수를사용 하는거.
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}


public class CalculatorDemo4 {
	public static void main(String[] args) {
		
	Calculator c1 = new Calculator();
	// 객체를 만든 것 
	c1.setOperands(10, 20);
	c1.sum();
	c1.avg();
	System.out.println(c1.PI);
	
	Calculator c2 = new Calculator();
	c2.setOperands(23, 17);
	c2.sum();
	}
}
