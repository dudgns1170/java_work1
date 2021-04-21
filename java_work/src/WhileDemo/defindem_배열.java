package WhileDemo;
import java.util.Arrays;


public class defindem_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4/16
		//java에서는 배열이라는 것을 사용 
		String [] classGrop = {"1","2","3","4","5","6"};
		System.out.println(classGrop[0]);
		System.out.println(classGrop[1]);
		System.out.println(classGrop[2]);
		//classGrop 의 배열의 길이 확인 .length
		System.out.println(classGrop.length);
		
		System.out.println();
		
		//배열의 길이 확인.
		String[] a= new String[4];
		a[1] =  "ad";
		System.out.println(a.length);
		a [2]= "cd";
		System.out.println(a.length);
		
		//반복문과 배열의 조합하여 사용하기.
		
		for(int i = 0; i<classGrop.length; i++)
			{String classGrops = classGrop[i];
			if (i == 0) {
			System.out.println(classGrops+"상담완료");}
			else {
			System.out.println(classGrops+"상담 완료");}}
		
		for(String e : classGrop)
		{
			System.out.println(e+"방문 확인");
		}
		
		String [] list2= {"a","b","c","d"};
		System.out.println(Arrays.toString(list2));
		
	}
}