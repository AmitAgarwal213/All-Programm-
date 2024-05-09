// Check the given string is numeric
package string;

import java.util.Arrays;

public class CheckNumericValue {

	public static void main(String[] args) {
		String name = "Amit1";
		char[]a1= name.toCharArray();
	System.out.println((Arrays.toString(a1)));
	for(int i = 0;i<name.length();i++) {
		
	boolean answer1= Character.isDigit(a1[i]);
	
	//System.out.println(answer1);
	if (answer1==true) {
		System.out.print("Numeric is present at index " +i );
	}
		}
	}

}
