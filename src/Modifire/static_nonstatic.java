package Modifire;

public class static_nonstatic {
	
	public static void method1(){
	System.out.println("static method 1");
}
	public static void method2() {
		System.out.println("static method 2");
	}
	public static void method3() {
		System.out.println("static method 3");
	}
public static void method4() {
	System.out.println("static method 4");
	
}
public static void  method() {
	System.out.println("static method 5");
	
}

void nonstaticmethod1() {
	System.out.println("non static method1");
}
void nonstatic2() {
	System.out.println("non static method2");
	
}
void nonstatic3() {
	System.out.println("non static method3");
}
void nonstatic4() {
	System.out.println("non static method4");
}

void nonstatic5() {
	System.out.println("non static method5");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		static_nonstatic staticmethod = new static_nonstatic();
		staticmethod.nonstaticmethod1();
		staticmethod.nonstatic2();
		staticmethod.nonstatic3();
		staticmethod.nonstatic4();

		staticmethod.nonstatic5();

		method1();
		method2();
		method3();
		method4();
		
	}

}
