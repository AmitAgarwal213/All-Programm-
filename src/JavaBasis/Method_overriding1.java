package JavaBasis;
class student {
	void  name () {
		System.out.println("my name is amit ");
		
		
	}
}

class student2 extends student{
	void name() {
		super.name();
		System.out.println("my name is shive");
	}
}

public class Method_overriding1 extends student2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_overriding1 m1= new Method_overriding1();
		m1.name();

		
		
	}

}
