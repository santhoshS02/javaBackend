package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

// linked hashmap is nothing but provides all the function of hashmap maintaines the incersion orderbased on double linked buckets.
public class LinkedHashmap {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String,String> HM = new LinkedHashMap<String,String>();
		
		HM.put("first", "java");
		HM.put("Second", "Mern");
		HM.put("Third", "Dotnet");
		HM.put("fourth", "Rubby");
		System.out.println(HM);
		
		
		System.out.println("Greating value for the key fisrt" + " ,"+ HM.get("first"));
		
		
		System.out.println("Getting the size of the key First" + " , " +HM.size());
		
		System.out.println("If the map is Empty or NoT" + " , "+ HM.isEmpty());
		
		
		
		System.out.println("It contains key 'second'" + " , "+ 	HM.containsKey("Second"));
	
		
		System.out.println("deleting the key 'first'" + " , " +HM.remove("first"));
		
		
		System.out.println(HM);
		
		
		


	}

}
