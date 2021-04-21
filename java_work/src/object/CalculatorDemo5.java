package object;

class Calculator2{
	//static 추가 후 작성시 ex 객체를 선정하지 않아도 호출이 가능함. 간단한 계산, 직접 접근이 가능.
	//this 유무 및 setOp 차이 , 
	public static void sum(int letf ,int right)
	{
		System.out.println(letf+right);
	}
	
	public static void avg(int letf, int right)
	{
		System.out.println((letf+right)/2);
	}
}
public class CalculatorDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator2.sum(10, 20);
		Calculator2.avg(10,20);
		Calculator2.sum(20, 40);
		Calculator2.avg(20, 40);
	}

}
