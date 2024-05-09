package inheritance;

class school{
	static void grand() {
		System.out.println("Student going to school");
	}
}
 class teacher extends school{
	 static void T1() {
		 System.out.println("hello");
	 }
 }
public class MultiLevel_Inheritance extends teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
T1();
grand();
	}

}
