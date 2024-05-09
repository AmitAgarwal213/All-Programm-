package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a1= "horse";
		String a2= "shore";
		char[]c1 = a1.toCharArray();
		char[]c2 = a1.toCharArray();
		//System.out.println(Arrays.toString(c1));
System.out.println(Arrays.toString(c2));

Arrays.sort(c1);

System.out.println(Arrays.toString(c2));
		
		
		}

	

}
