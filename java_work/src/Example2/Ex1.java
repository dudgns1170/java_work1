package Example2;

 class Human{
	 //외부 수정 불가 
	 private String name;
	 private int height;
	 private int weight;
	 Human( String name,int height,int weight){
		 this.name = name;
		 this.height =height;
		 this.weight=weight;
	 }
	 //외부에서 가져 오게 하기 위힘
	 public String getName()
	 {
		 return name;
	 }
	 public int getHiget() {
		 return height;
	 }
	public  int getWe() {
		 return weight;
	 }
	// 제중이 증가, 감소 하는 메소드로 작성 
	 void gainW(int weight)
	 {
		 this.weight +=weight;
	 }
	 void redW(int weight)
	 {
		 this.weight -= weight;
	 }
}
 public class Ex1 {
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stu
		 // 생성자 생성 후 출력
		 Human dud =new Human("dud", 65, 72);
		 System.out.println(dud.getHiget());
		dud.gainW(3);
		System.out.println(dud.getWe());
	}

}
