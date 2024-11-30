package interviewquestions;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumberinArray {

	public static void main(String[] args) {
		
		//array should not have duplicates.
		//Array No need to be Sorted order.
		// values should be in range .
		
		
		int a[] = {1,4,2,5};
		int sum1 =0;
		int sum2=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1 = sum1+a[i];
		}
		
		for(int i=0;i<=5;i++)
		{
			sum2= sum2+i;
		}
		int missingNumber =  sum2-sum1;
		System.out.println(missingNumber);
		
		//**********************************************//
		 int[] numbers = {9, 6, 4, 5, 7, 0, 1};
		    Arrays.sort(numbers);
		    
		    System.out.println(Arrays.toString(numbers));
		    
		    HashSet<Integer> set = new HashSet<>();

		    for (int i = numbers[0]; i < numbers[numbers.length - 1]; i++) {
		        set.add(i);
		    }


		    for (int i = 0; i < numbers.length; i++) {
		        set.remove(numbers[i]);
		    }

		    for (int x : set) {
		        System.out.print(x + " ");
		    }
	}

}
