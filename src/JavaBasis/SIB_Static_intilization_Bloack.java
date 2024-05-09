package JavaBasis;

public class SIB_Static_intilization_Bloack {
	int a;
	String c;
	
	//SIB_Static_intilization_Bloack(){
	
	// IIB 
	{
		System.out.println("mohit");
	}
	
	//SIB 
static {
	int a= 20;
	int b = 30;
	System.out.println(a+b);
	//System.out.println("Amit");
}

// Constratctor
	SIB_Static_intilization_Bloack(){
		a= 30;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SIB_Static_intilization_Bloack V1 = new SIB_Static_intilization_Bloack();
		System.out.println("Manish");
		System.out.println(V1.a);

	}

}
