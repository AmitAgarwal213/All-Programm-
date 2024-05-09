package string;

public class StringPalindrom {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "malylam";
		String rev = "";
String output = "";
for (int i=a.length()-1;i>=0;i--) {
	
	// rev= a.charAt(i);
	 rev = rev + a.charAt(i);
}
if (a.equals(rev)) 

	System.out.println("number is palindrom  " +   a);

else 
	System.out.println("number is not palindrom");
	}
	
}

