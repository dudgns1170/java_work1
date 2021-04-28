package Example;
// 배열 복습 4/28



public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
//		String  [] Sr = {"ad","asd","fdf"};
//		System.out.println(Sr);
//		
//		int sum =0;
//		for(int i =0; i <Sr.length ; i++)
//		{	
//			System.out.println(Sr[i]);
//			}
//		//array 배열 실습
//		
//		// 초기화
//		int Arrray [] = null;
//		//int [] Arrray = new int [3];
//		Arrray =new int[3];
//		System.out.println(Arrray.length);

		//초기화 {}안에 초기값은 항상 있어야 한다.
		//int [] Arrray = new int [] {0,0,0,0,0};
		//System.out.println(Arrray[0]);

		//할당 /재할당/초기화
//		int [] Arrray ={0,1,2,4,3,5};
//		Arrray[0] =10;
//		Arrray[1]= 7;
//		System.out.println(Arrray[1]);
//		int s=0;
//		for(int v=0; v<Arrray.length; v++)
//		{
//			Arrray[v]=v;
//			s += Arrray[v];
//			System.out.println(s+Arrray.length);
//		}
		// 2다차원 배열
		//행 /  렬        공간
		int[][] sc = new int[2][3];
		System.out.println(sc.length);
		System.out.println(sc[0].length);
		System.out.println(sc[1].length);

	}

}
