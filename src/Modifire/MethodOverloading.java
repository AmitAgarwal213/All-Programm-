package Modifire;

 class MethodOverloading {
	int a;
void add(int a) {
	System.out.println(a+6);
}
int sub(int a,int b) {
//	a = 20;
//	b = 24;
	System.out.println(a-b);
return 0;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading M1 = new MethodOverloading();
		M1.add(21);
System.out.println();
M1.sub(40, 50);
	}

}