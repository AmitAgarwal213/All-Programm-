package collection;

import java.util.ArrayList;
import java.util.Iterator;



public class CollectionItraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1= new ArrayList();
		a1.add("222");
		a1.add(321);
		a1.add("amit");
		a1.add("mohit");
		a1.add("moon");
		Iterator i1= a1.iterator();
		while (i1.hasNext()==true) {
			System.out.println(i1.next());
		}
		

	}

}
