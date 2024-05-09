package JavaBasis;
public class Local 
{
	void jp_nagar()
	{
		int a=100;//local variable 	
		System.out.println(a);
	}
	void mg_road()
	{
		int a=200;//local varaible
		System.out.println(a);
	}
	void multiply()
	{
		String a;
		a="My NAme is Ram";//local varaible
		System.out.println(a);
	}
	static void div(String a,boolean b)
	{
		System.out.println(a);
		System.out.println(b);
	}
public static void main(String[] args) 
{
Local M1 = new Local();
M1.multiply();
M1.mg_road();
div("Amit", false);
	
}
}
