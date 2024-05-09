package JavaBasis;

import java.util.Scanner;

class overriding1{
	void add() {
		Scanner A1= new Scanner(System.in);
		int a= A1.nextInt();
		int b = A1.nextInt();
		System.out.println(a+b);
		//int c=20;
	}
		
	class subtraction extends overriding1{
		void add() {
			
		
			super.add();

			Scanner A2= new Scanner(System.in);
			int c= A2.nextInt();
			int d = A2.nextInt();
			System.out.println(c+d);
		}
	}


public class Method_overriding extends subtraction{

	public static void main(String[] args) {
		
	
		
		
	
		// TODO Auto-generated method stub
		Method_overriding A2= new Method_overriding();
		A2.add();
		//A2.add();
//		subtraction A3 = new subtraction();
//		A3.add();
//		A3.add();
//		
	}
	}
}
	


