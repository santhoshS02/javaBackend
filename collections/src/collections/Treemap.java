package collections;

import java.util.Map;
import java.util.TreeMap;

// tree map only used for unique item .tree map can't have null key. but can have multiple null values.
//tree map perform ascending order .it also knows as red -black tree.
public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		TreeMap<Integer,String> HM = new TreeMap<Integer,String>();
		
		HM.put(1, "virat");
		HM.put(2, "Rohith");
		HM.put(4, "Rina");
		HM.put(3, "dohni");
		
		System.out.println("Before invoking remove method");
		
		for(Map.Entry m:HM.entrySet())
		{
			System.out.println(m.getKey() + " " +m.getValue());
		}
		HM.remove(2);
		
		System.out.println("After removing the method ");
		for(Map.Entry m:HM.entrySet())
		{
			System.out.println(m.getKey() + " "+m.getValue());
		}
		

		

	}

}
