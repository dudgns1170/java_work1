package Condition;

public class Condition1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4/14
		// ���ǹ� if (true,false) �� ��� �� ���ִ�.
		if (true) {
			System.out.println(10 > 20 );
		}
		System.out.println("10�� 20���� �۾ƿ�");
		
		if(true) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
			System.out.println(5);
		System.out.println();
		
		if (false) {
			System.out.println(1);
		}else {System.out.println(2);}
		
		System.out.println();
		
		if(false) {
			System.out.println(1);   //if ���� false �� ����ǰ�
		}
		else if(true)           
		{
			System.out.println(2);  //else if ���� true�� ����Ǿ� 2�� ���
		}
		else if (true)
		{
			System.out.println(3); //else if ���� true�� ����Ǿ� 2�� ��µǾ� �ؿ� �ִ� ������ ���õǾ� if ���� ����.
		}
		else
		{
			System.out.println(4);
		}
		
		System.out.println();
		 // ���� ���� ���� ���� ���ذ� ����.
		// if , else ���� false �� �־� 3���� else���� true�̹Ƿ� ��� 
		if(false)
		{
			System.out.println(1);
		}
		else if(false)
		{
		 System.out.println(2);
		}
		else if(true)
		{
			System.out.println(3);
		}
		else
		{
			System.out.println(4);
		}
		
		// ��� ���� false �� �־� �����ϸ� else�� 4�� ��µ�.
		
		System.out.println();
		if(false)
		{
			System.out.println(1);
		}
		else if(false)
		{
		 System.out.println(2);
		}
		else if(false)
		{
			System.out.println(3);
		}
		else
		{
			System.out.println(4);
		}
	

	}


}
