package string;

import java.awt.geom.Dimension2D;
import java.util.Date;

public class GetDateFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date D1= new Date();
//System.out.println(D1.getDate());/// Get current date 
//System.out.println(D1.getTime());// machinery time / epach time
Date d2= new Date(D1.getTime());
System.out.println(d2);
// Find future date 
Date d3= new Date(D1.getTime()+(1000*60*60*24*10) );

System.out.println(d3);



	}

}
