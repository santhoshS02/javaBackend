package collection;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList LL = new LinkedList();
		
		//add element in the linked list 
		LL.add(140);
		LL.add('h');
		LL.add(null);
		LL.add(140);
		System.out.println(LL);
		
		// addfirst 
		System.out.println(LL.size());
		
		LL.addFirst(41);
		System.out.println(LL);
		
		//get value 
		System.out.println(LL.getFirst());
		
		
		// adding middle of the element 
		LL.add(2,45);
		System.out.println(LL); 
		
	System.out.println(LL.contains("anthosh"));
	

	
	}

	
	

}
