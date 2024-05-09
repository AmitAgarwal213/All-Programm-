package inheritance;
interface addbbition{
	void add();
	int c= 20;
	int d = 30;
	void sub();
}
interface multiplication{
	 void mutli();
	 int a= 23;
	int b = 2;
	
}





public class Multiplelevel_inheritace implements addbbition,multiplication{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 23;
		int b = 600;
		System.out.println(a-b);
		
		Multiplelevel_inheritace M1= new Multiplelevel_inheritace();
M1.add();
M1.mutli();
	}
		@Override
		public void mutli() {
			System.out.println(c*d);
			
		}
		@Override
		public void add() {
			System.out.println(a+b);
			
		}
		@Override
		public void sub() {
			// TODO Auto-generated method stub
			
		}
		

}