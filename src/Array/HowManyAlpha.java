package Array;

public class HowManyAlpha {

	public static void main(String[] args) {
		String a = "i am fiwwn947744";
		int count_of_alphabet = 0;
		char[] a2= a.toCharArray();
				
				boolean answer1;
				for(int i=0;i<a.length();i++) {
				
					answer1= Character.isAlphabetic(a2[i]);
					
					
					if (answer1==true) {
						count_of_alphabet++;
					
					}}
						
						System.out.println("count of alphabet is "+ count_of_alphabet);
					}
				}
				