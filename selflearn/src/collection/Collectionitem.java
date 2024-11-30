package collection;

import java.util.*;
import java.util.Iterator;
public class Collectionitem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = new int[5];   // fixed size of the array object
		
		ArrayList<Object> alist = new ArrayList<>();  // Flexable to add any type. support redency
		 
		//<> NOT essential.
		// Object used to stored in the multiple types .
		alist.add(25);
		alist.add(45);
		alist.add("santhosh");
		
		for(int i=0;i<5;i++)
		{
			alist.add(i);
		}
		
//        Iterator<Integer> it = alist.iterator();

		alist.set(2, "barve"); // modify the value 
		alist.remove(4);
		System.out.println(alist);
		System.out.println(alist.get(6));   // print the particular data .
		
		
		
		}

}
