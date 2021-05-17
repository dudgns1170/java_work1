package Example;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	float x = 30.2F;
	float y = 100.4F;
	double total = x+y /2;
	System.out.println(x + y);
	System.out.println(total);
	//float ���� double ��� �Ͽ� ���� Ǯ��
	
	int [] a = {2,2,4,4,6,7,7,5,2};
	int i = a.length -1;
	int cut =0;
	while (i >=0) {
		if(a[i] ==2)
			cut ++;
		i--;
	}
	System.out.println(cut);

	}

}
