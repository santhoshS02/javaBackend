package collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable H = new Hashtable();
		H.put(101,"Sa");
		H.put(105, "ramkumar");
		H.put(106, "sant");
		
		System.out.println(H.get(105));
		System.out.println(H);
		
		H.remove(101);
		System.out.println(H);
		
		System.out.println(H.contains("sant"));
		
		System.out.println(H.keySet());  
		
		System.out.println(H.get(106));
		
		System.out.println(H.entrySet());    //combination of key and values 
		
		//entry specific method 
//		for(Map.Entry entry : H.entrySet() )
//		{
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
	 
		Set s= H.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
	}

}
