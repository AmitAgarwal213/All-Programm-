package Array;

public class CountOfSpaces {

	public static void main(String[] args) {
		String a = "i am fiwwn947744";
		int count_of_Spaces = 0;
		char[] a2= a.toCharArray();
				
				boolean answer1;
				for(int i=0;i<a.length();i++) {
				
					answer1= Character.isSpaceChar(a2[i]);
					
					
					if (answer1==true) {
						count_of_Spaces++;
					
					}}
						
						System.out.println("count_of_Spaces is "+ count_of_Spaces);
					}
				}
				