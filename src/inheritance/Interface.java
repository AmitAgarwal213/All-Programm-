package inheritance;

import java.util.Scanner;

interface Addtion{

	 void add() ;
		Scanner I2= new Scanner(System.in);
		int a = I2.nextInt();
		int b = I2.nextInt();
		void sub();
//		int c= 30;
//		int d= 40;
		
	}
	
	abstract class multiple implements Addtion {
		abstract void mul();
		Scanner S2= new Scanner(System.in);
		int a= S2.nextInt();
		int b = S2.nextInt();
	}

public class Interface extends multiple  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface I1= new Interface();
		
		I1.mul();
I1.add();
I1.sub();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
	}

	@Override
	void mul() {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}

}
