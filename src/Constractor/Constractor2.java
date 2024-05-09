package Constractor;

import java.util.Scanner;

public class Constractor2 {
	Constractor2(){
		Scanner Sc = new Scanner(System.in);
			int n = Sc.nextInt();
			int rev=0;
			
			int rem;
			for (;n!=0;n=n/10) {// another way to reverse the program
				
			//while(n>0) {
				rem= n%10;
				rev = rev*10+rem;
			//n= n/10;}
			}
			System.out.println(rev);
			
			
		
	}

	Constractor2(int number){
		Scanner Sc = new Scanner(System.in);
int rem;
		int sumofdigit= 0;
		number = Sc.nextInt();
		while (number>0) {
			rem= number%10;
			sumofdigit= rem+sumofdigit;
			number = number/10;
		}
			System.out.println(sumofdigit);
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constractor2 C1= new Constractor2();
		new Constractor2(23);
	}

}
