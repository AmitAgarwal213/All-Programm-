package Modifire;

public class Constractor_Overloading {
	Constractor_Overloading(String a){
		System.out.println("My name is Amit");
	}
	Constractor_Overloading(int b){
	System.out.println(2);
	}
	Constractor_Overloading(char c){
		System.out.println("good");
	}
	Constractor_Overloading(boolean D){
		System.out.println(true);
	}
	Constractor_Overloading(String a,Boolean b,int c){
		System.out.println("city name is mumbai");
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constractor_Overloading("Amit1");
		new Constractor_Overloading(20);
new Constractor_Overloading('a');
new Constractor_Overloading(true);
new Constractor_Overloading("shivam",true,2);

	}

}
