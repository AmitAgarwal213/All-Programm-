package JavaBasis;
class GrandParentClass
{
	static void fetching_username()
	{
	System.out.println("Enter the user name");	
	}
}
class Parent_Class extends GrandParentClass
{
	static void login_using_UN()
	{
		System.out.println("Enter the password");
	}
}

public class Multi_level_inheritance extends Parent_Class
{
	static void TestCase1_Adding_productto_cart()
	{
	System.out.println("Click on the login button");	
	}
	public static void main(String[] args) 
	{
		TestCase1_Adding_productto_cart();
		login_using_UN();
		fetching_username();
		
	}

}
