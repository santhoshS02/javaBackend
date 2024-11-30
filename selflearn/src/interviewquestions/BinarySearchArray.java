package interviewquestions;

import java.util.Arrays;

public class BinarySearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};   // shorted order 
		
		boolean flag= false;
		
		int key = 5;
		
		int l=0;
		int h=a.length-1;
		
		while(l<=h)
		{
			int m = (l+h)/2;
			
			if(a[m]==key)
			{
				System.out.println(" Mid element found ...");
				flag=true;
				break;
			}
			
			if(a[m]<key)
			{
				l=m+1;
				
			}
			
			if(a[m]>key)
			{
				h=m-l;
			}
			
		}
		if(flag==false)
		{
			System.out.println(" Element Not found..");
		}
		
		// approach 1  : Arrays.binarysearch()
		
		System.out.println(Arrays.binarySearch(a, 8));

	}

}
