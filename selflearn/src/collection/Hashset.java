package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet HS = new HashSet(); // default size is 16 size and 0.75%
		
		//HashSet Hs = new HashSet(100); //initial size capacity is 100
		
		// Add element in to object 
		HS.add(12);
		HS.add(250);
		HS.add(" hello ");
		HS.add(null );
		System.out.println(HS);
		
		HS.remove(12);
		System.out.println(HS);
		
		HS.remove(2);  // not work . use the particular value .
		System.out.println(HS);
 		
// iterator method .
		  
		Iterator IT = HS.iterator();
		while(IT.hasNext())
		{
			System.out.println(IT.next());
		}
		
	}

}
