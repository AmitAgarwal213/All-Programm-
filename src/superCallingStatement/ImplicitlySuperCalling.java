package superCallingStatement;
class addtion{
	addtion(int a, int b){
		
		System.out.println(a+b);
	}
}

class subtraction extends addtion{
	subtraction(){
		super(40,50);
	int a = 34;
	int b=30;
	System.out.println(a-b);
}
}
class multiplication {
	multiplication(){
		int a= 20;
		int b = 2;
		System.out.println(a*b);
	}
}

public class ImplicitlySuperCalling extends multiplication {
	ImplicitlySuperCalling(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplicitlySuperCalling S1= new ImplicitlySuperCalling();
		

	}

}
