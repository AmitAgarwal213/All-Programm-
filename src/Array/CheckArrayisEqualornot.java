package Array;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArrayisEqualornot {

	
	public static void main(String[] args) {
		int num []= new int [3];
		num[0]=23;
		num[1]=33;
		num[2]=44;
		
		int number []= new int [3];
		num[0]=23;
		num[1]=33;
		num[2]=44;
		boolean num2 = number.equals(num);
		boolean num1= num.equals(number);
				
				if (num2==true) {
					
					System.out.println("number is qual");
				}
				else {
			System.out.println("numer is not equal");
			
		}
		
			//System.out.println(num.equals(number));
		}
}

		
	

