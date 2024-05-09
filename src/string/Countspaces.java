package string;

public class Countspaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		int count_of_spaces=0;
		boolean answer1;
		String name = "manish1";
		char[]a1= name.toCharArray();
		for(int i =0;i<name.length();i++) {
			answer1= Character.isSpaceChar(a1[i]);
			if(answer1==true) {
				count_of_spaces ++;
				
				
			}}
				System.out.println("how many numeric value"+ count_of_spaces );
				
			}
			
		
				
				
				
			

		}

		
		
		
		
		
	


