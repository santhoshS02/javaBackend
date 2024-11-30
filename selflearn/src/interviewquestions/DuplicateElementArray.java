package interviewquestions;

import java.util.HashSet;

import collection.Hashset;

public class DuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"java","c","c++","python","java"};
		
		
		// aproach 1.
		boolean flag = false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Both are the same values:  "+arr[i]);
					flag = true;
				}
			}
		}
		if(flag == false)
		{
			System.out.println("Duplicate value is NOT found ");
		}

		//*****************************************************************************//
		// second approach 
		int a[] = {1,4,5,6,3,6,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) {
					System.out.println(" Both are same number :" + a[i]);
				}
			}
		}
		
		
		
		// Third approach for the Hash set method 
		
		HashSet<String> lang = new HashSet();
		
		lang.add("java");
		lang.add("python");
		lang.add("java");
		
		System.out.println(lang);
		
		for(String  l : arr)
		{
			if(lang.add(l)==false)
			System.out.println(" Found duplicate value ");
		}
		
		
			
	}

}
