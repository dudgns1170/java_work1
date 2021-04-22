package ScopeDemo;

class ScopDemo1 {
	 static void a() 
		{
		 	//지역 변수 (메서드 내에서 사용한다는 뜻)
			int i =0;
			//메서드를나오는 순간 의미가 없다.
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++)
		{
			a();
			//의마가 없기에 실행 되지 않는 것.
			System.err.println(i);
		}

	}

}
