package Array;

public class CountNumericValue {

	public static void main(String[] args) {
String a = "i am fin947744";
int count_of_numeric = 0;
char[] a2= a.toCharArray();
		
		boolean answer1;
		for(int i=0;i<a.length();i++) {
		
			answer1= Character.isDigit(a2[i]);
			
			
			if (answer1==true) {
				count_of_numeric++;
			
			}}
				
				System.out.println("count of numeric is "+ count_of_numeric);
			}
		}
		
	
		
	


