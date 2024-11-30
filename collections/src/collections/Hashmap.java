package collections;

import java.util.HashMap;
import java.util.Map;
// map is an interface for storing a value based on key / value pairs 
//They are three types 1.tree 2.HashMap  3.LinkedhashMap

//key a unique identifier used to associate used to elements.
//It provide the  implements of map interface. It uses the tech called hashing .It converts the technic of large string in to small string 
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> number = new HashMap();
		
		//insert element on the map
		//number.put(1,"one");        not valid in this type.
		number.put("one" ,1);
		number.put("two", 2);
		System.out.println("map"+number);
		
		//Access key 
		System.out.println("Keys" +number.keySet());
		
		//Access value of the map
		System.out.println("values"  + number.values());
		
		//Access Entire of the map
		System.out.println("Entires"+ number.entrySet());
		
		//remove element from the map
		
		int values=number.remove("two");
		System.out.println("Before removing " + number);
		System.out.println("removed values" + values);
		System.out.println(number);	
		
	    

	}

}
