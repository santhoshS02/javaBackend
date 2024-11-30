package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue Pr = new PriorityQueue();
		
		//to add  the elements in  Add() and offer()
		
		Pr.add(56);
		Pr.offer(250);
		Pr.add(56);
//		Pr.add('s');   is this is not allowed 
		System.out.println(Pr);  // insertion order is preserved and duplicate are allowed.
		
		
		// to get the element using the element() and peek();
//		System.out.println(Pr.element());
//		System.out.println(Pr.peek());
		
		//to get the element and then remove using the remove() and poll();
		
//		System.out.println(Pr.remove());
		System.out.println(Pr.poll());
		System.out.println(Pr); 


	Iterator it = Pr.iterator();
	while(it.hasNext())
		
		
	{
		System.out.println(it.next());
	}
	}

}
