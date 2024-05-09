package inheritance;

 class parentsClass{
	static int a = 30;
	static int b=20;

	 static void add(){
		
		int c= a+b;
System.out.println(c);
	
	 }

}
	public class Single_Level_Inheritance extends parentsClass {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("what is addion of two number is = " );
		 parentsClass s1= new parentsClass();
	add();
	}

	}
	
	

