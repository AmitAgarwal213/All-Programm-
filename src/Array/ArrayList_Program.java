package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Program {
public static void main(String[] args) {
	ArrayList a1= new ArrayList();
	a1.add(987);
	a1.add(999);
	a1.add("amit");
	a1.add(true);
	a1.add("amit");
	a1.add(null);
			a1.add(7.98);
	System.out.println(a1);
	
	
	// Sorting 
	
	ArrayList a2= new ArrayList();
	a2.add(876);
	a2.add(811);
	a2.add(123);
	a2.add(-90);
	a2.add(90);
	a2.add(1);
	Collections.sort(a2);
	System.out.println(a2);

	
}
}
