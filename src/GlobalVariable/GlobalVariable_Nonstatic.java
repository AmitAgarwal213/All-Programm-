package GlobalVariable;

public class GlobalVariable_Nonstatic {
	
	String amit;

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlobalVariable_Nonstatic G1= new GlobalVariable_Nonstatic();
		G1.main(0);
	System.out.println(G1.a);
//G1.main(0, "a");
		
	}
	static	int a;
	public  void main(int b) {
		b=a= 100;
		
	//System.out.println(b);
	}
}
