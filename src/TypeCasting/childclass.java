package TypeCasting;

class GrandParents{
	void add() {
		
	}
	void sub() {
		
	}
}
class parent extends GrandParents {
	void add() {
		
	}
}
public class childclass extends parent {
void mul() {
	
}

public static void main (String[]args) {
	
	
	parent P1= new parent();//upcasting
	P1.add();
	P1.sub();
	
	//downcasting
	childclass D1 = new childclass();
	D1.add();
	D1.sub();
	
	
}}