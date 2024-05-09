package inheritance;

import java.util.Scanner;

class addition{
	static void add () {
		Scanner A1= new Scanner(System.in);
		int a = A1.nextInt();
		int b = A1.nextInt();
		System.out.println(a+b);
}
	
}
class subtration extends addition{
	void sub() {
		Scanner S1= new Scanner(System.in);
		int a= S1.nextInt();
		int b = S1.nextInt();
		System.out.println(a-b);
	}
}



public class MultilevelAlgorithum extends subtration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultilevelAlgorithum S3= new MultilevelAlgorithum();
		add();
		S3.sub();
		

	}

}
