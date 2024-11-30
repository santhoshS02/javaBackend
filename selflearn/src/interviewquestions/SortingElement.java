package interviewquestions;

import java.util.Arrays;
import java.util.Collections;

public class SortingElement {

	// Built in function method 
	// shorting array .
	public static void main(String[] args) {
		
		// first approach 
		
		int a[]= {30,50,80,90,20,36};
		
		System.out.println("Before shorting : " + Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		
		System.out.println("After shorting : " + Arrays.toString(a));
		
		// 2 nd approach 
		
		Arrays.sort(a);
		
		System.out.println("After shorting : " + Arrays.toString(a));
		
		// Reverse order 
		Integer b[]= { 20,58,63,42,31,21,91};  // Primitive type 
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println("After shorting  to reverse: " + Arrays.toString(b));

		

	}

}
