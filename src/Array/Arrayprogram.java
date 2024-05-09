package Array;

import java.util.Arrays;

public class Arrayprogram {

	public static void main(String[] args) {
int age []= new int [3];
age[0]=19;
age[1]=30;
age[2] =36;
System.out.println(age[0]);
System.out.println(age[1]);
System.out.println(age[2]);

// another way

for (int i=0;i<3;i++) {
	//System.out.println(age[0]);
	System.out.println(age[i]);
}
	
	System.out.println("One other way to print value");
	System.out.println(Arrays.toString(age));
}

	}


