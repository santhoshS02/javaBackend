package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet Hs = new LinkedHashSet();
		HashSet H = new HashSet();
		
		//LinkedHashSet insertion order is preserved.not duplicate value allowed 
		Hs.add(15);
		Hs.add(85);
		Hs.add(25);
		Hs.add(75);
		System.out.println(Hs);
		
		
		// HashSet the insertion order is not preserved . not duplicate value not allowed .
		
		H.add(15);
		H.add(85);
		H.add(25);
		H.add(75);
		
		System.out.println(H);
		
		
	}

}
