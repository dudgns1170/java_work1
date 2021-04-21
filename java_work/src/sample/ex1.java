package sample;



public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] idlist ={"one","two","tree","for"};
		System.out.println(idlist[0]);
		System.out.println(idlist.length);
		for(int i= 0; i < idlist.length; i++)
		{
			String  id =idlist[i];
			if(i == 0)
			System.out.println(id+"확인");
			
		
		}
		
		int a= 2;
		for(int b=1; b<10; b++)
		{
			System.out.println(a+"X"+b+"="+a*b);
			System.out.println();
		}
		
		for(int v=0; v<10; v++)
		{
			System.out.println(v++);
		}
		System.out.println();
		
		String [] lists = {"1","2","3","4"};
		System.out.println(lists[2]);
		System.out.println(lists.length);
		for(int v =0; v<lists.length; v++)
		{
			System.out.println(lists[v]+"상담완료");
		}
	}

}
