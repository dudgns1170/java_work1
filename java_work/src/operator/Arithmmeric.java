package operator;

public class Arithmmeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//4/14�� ����
	//��� ������	
	int result = 1+2;
	System.out.println(result);
	result = result -1;
	System.out.println(result);
	result = result * 2;
	System.out.println(result);
	result = result /2;
	System.out.println(result);
	result = result +8 ;
	result = result %7 ;
	System.out.println(result);
	//������ ������
	int a= 3;
	System.out.println(0%a);
	System.out.println(1%a);
	System.out.println(2%a);
	System.out.println(3%a);
	System.out.println(4%a);
	System.out.println(5%a);
	System.out.println(6%a);
	//���ϱ� ���ڿ� 
	String frist = "This is";
	String second = " Show Time";
	String third = frist + second ;
	System.out.println(third);
	// ����ȯ
	int a1 = 10;
	int a2 = 3;
	
	float c= 10.0F;
	float b= 3.0F;
	
	System.out.println(a1 / a2);
	System.out.println(c/b);
	System.out.println(a1/b);
	
	//���� ������
	//
	int i =3;
	i++;
	System.out.println(i);
	i ++;
	System.out.println(i);
	i --;
	System.out.println(i);
	System.out.println(i++); 
	System.out.println(i++); 
	// ++�� �տ� ���� ���  ++���� ���� �� i �� ����, ++���� �ڿ� ���� ��� i ���� �� ++ ����
	System.out.println(++i);
	// �������� �켱����
	
	// �񱳿� ��( == ����)
	System.out.println(1 ==2);
	System.out.println(1==1);
	System.out.println("one"=="two");
	System.out.println("one"== "one");
	
	//(!= ���� �ʴ�)
	System.out.println();
	System.out.println(1 != 2);
	System.out.println(1 != 1);
	System.out.println( "one" != "two");
	System.out.println("one" != "one");
	
	//(> , ������ ������ ���� ũ��)
	System.out.println();
	System.out.println( 10> 20);
	System.out.println(10>2);
	System.out.println( 10 > 10);
	
	//(>= ������ �����ʺ��� ũ�ų� ����)
	System.out.println(10 >= 20);
	System.out.println(10 >= 2);
	System.out.println(10 >= 10);
	
	//equals() ���ڿ� �񱳽� ���
	
	String a12= "hello world";
	String a13= new String("hello world");
	System.out.println( a12 == a13);
	System.out.println(a12.equals(a13));
	
	}

}
