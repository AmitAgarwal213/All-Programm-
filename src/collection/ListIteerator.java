package collection;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.ListIterator;

public class ListIteerator {
public static void main(String[] args) {
	ArrayList a1= new ArrayList();
	a1.add("222");
	a1.add(321);
	a1.add("amit");
	a1.add("mohit");
	a1.add("moon");
	ListIterator i1= a1.listIterator();

	while (i1.hasNext()==true) {
		System.out.println("forword ineration " + i1.next());
		
	}
	System.out.println("========================");
	while (i1.hasPrevious()==true)
	{
		System.out.println("Backword ineration " +i1.previous());
	}
}
}
