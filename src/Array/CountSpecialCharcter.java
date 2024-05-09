package Array;

public class CountSpecialCharcter {

	public static void main(String[] args) {
		String a = "i am fiw@wn947744";
		int count_of_SpacialCharcter = 0;
		char[] a2= a.toCharArray();
				
				boolean answer1;
				for(int i=0;i<a.length();i++) {
				
					answer1= Character.isSupplementaryCodePoint(a2[i]);
					
					
					if (answer1==true) {
						count_of_SpacialCharcter++;
					
					}}
						
						System.out.println("count_of_SpacialCharcter "+ count_of_SpacialCharcter);
					}
				}
				