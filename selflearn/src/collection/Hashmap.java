package collection;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> h = new HashMap<Integer,String>();

		h.put(101, "santhosh");
		h.put(102, "sandy");
		h.put(103, "dhoni");
		h.put(102, "sandy...");
		h.put(104, "santhosh");

		
		System.out.println(h);
		System.out.println(h.get(104));
		
		//remove
		h.remove(101);
		System.out.println(h);
		
		System.out.println(h.keySet());
		
		System.out.println(h.values());
		
		
		 
		

	}

}
