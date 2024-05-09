package ConditionalStatement;

public class LogicalOperator_And {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 3000;
int salary = 72000;

if (a<3000 && salary==13000) {
	System.out.println("1");

	if (a<3100 && salary == 72000) {//If first condition true than condition go to next condition otherwise go to else condtion
		System.out.println("2");
}
}
else {	
System.out.println("23");
}
}}