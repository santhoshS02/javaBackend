package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare array list 
		ArrayList AL= new ArrayList();
		
		//specify the type homogeneous
		ArrayList<Integer> Al = new ArrayList<Integer>();
		Al.add(37);
		Al.add(7);
		Al.add(96);

		
		System.out.println(Al);
		
		
		AL.add("santhosh");
		AL.add(23);
		AL.add('a');
		AL.add(12.7);
		AL.add(0.78);

		System.out.println(AL);
		//size 
		System.out.println(AL.size());
		
		//remove
		AL.remove(1);
		System.out.println(AL);
		
		//insert new element
		AL.add(1,43);
		System.out.println(AL);
		
		//retain the value
		AL.retainAll(AL);
		System.out.println(AL + "ASA");
		
		//contains
		System.out.println(AL.contains(0.78));
		
		//isEmpty
		System.out.println(AL.isEmpty());
		
		//forloop
		
		for(int i=0;i<AL.size();i++)
		{
			System.out.println(AL.get(i));
		}
		
		//for each
		System.out.println("here is the for each method ");
		for(Object e :AL)
		{
			System.out.println(e);
		}
		
		//iterator method
		Iterator it = AL.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
			 
		 }
		
		 // collections sort
		 
		 Collections.sort(Al);
		 System.out.println(Al);
		
		 Collections.reverse(AL);
		 System.out.println(AL);

		 Collections.shuffle(AL);
		 System.out.println(AL);

		 // normal array values 
		 String arr[]= {"abc","sasa","dsd"};
		 for(String value:arr)
		 {
			 System.out.println(value);
		 }
		 
		 // array value convert into array list 
		 
		 ArrayList A = new ArrayList(Arrays.asList(arr));
		 System.out.println(A);
		 
		 AL.addFirst(23);
		 System.out.println(AL);
		 
	}

}
  