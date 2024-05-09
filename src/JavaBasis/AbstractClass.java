package JavaBasis;

import java.util.Scanner;

abstract class addtion{
	abstract void add();
	int a = 20;
	int b = 30;
	abstract void sub();

}

abstract class multi extends addtion{
	static void multi() {
		int a = 2;
		int b = 3;
		
		System.out.println(a*b);
	}
}
public class AbstractClass extends multi {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass A2= new AbstractClass();
		multi();
	A2.add();

	A2.sub();
	}
	@Override
	void add() {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}

}
