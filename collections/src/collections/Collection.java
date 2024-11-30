package collections;

//iterator  provides access to the element and also to next element until a specify condition to satisfy.
//iterator are going over elements in a collection for thread safe.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// collection is a frame work that is used to stored manipulate the object .
//1.Arraylist implements list interface.
//2. dymanic array to store duplicate element of different dat type.
//3. maintains insertion order.
//4.randomly accessed.
//5.non synchronized.

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//crating arraylist.
		ArrayList<String> list = new ArrayList<String>();
		
		//<T> - type of object 
		//adding obj in arraylist
		list.add("Ram");
		list.add("priya");
		list.add("Vijay");
		list.add("Surya");
		
		//traversing list thru iterator
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		// integer to the value .
         ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		//<T> - type of object 
		//adding obj in arraylist
		list1.add(9);
		list1.add(25);
		list1.add(30);
		list1.add(35);
		 System.out.println(list1);
		 
		 //get() is used to access the values using index
		  
		Integer n= list1.get(1);
		System.out.println("Index 1 number is " + n);
		
		//insert missing element 
		
		list1.add(2,3); //add(index,value)

		System.out.println("after inserting missing value");
		
		System.out.println(list1);
		
		
		// sort the elements
		Collections.sort(list1);
		System.out.println(list1);
		
		//size of an element 
		
		int b= list.size();
		System.out.println("the size is "+ b);
		
		//removing the element based on the index
		list1.remove(1);
		System.out.println(list1);
		
		//arraylist can hold only object.
		//so we must use wrapper class (Integer,String,Boolean);
		
		// it can store null element .
		//array in to collection ("Array.asList(list1)");
		
		
		
		
	}

}
