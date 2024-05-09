package string;

public class ReverseString {

	public static void main(String[] args) {
String output = "";
		String a= "Shivam";
		for (int i=a.length()-1;i>=0;i--) {
			char rev =  a.charAt(i);
			output = output+rev;
			
		}
		System.out.println("Reverse of string is " +output);
		
	}

}

