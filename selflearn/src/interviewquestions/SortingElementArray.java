package interviewquestions;

import java.util.Arrays;

// Booble sort  
// in ascending order 
public class SortingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {4,2,1,5,3};
		
		System.out.println(" Array befor string :"  + Arrays.toString(a));

		
		for(int i=0;i<a.length;i++)
		{
			for(int j= 0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
				}
			}

		}
		
		System.out.println(" Array  after string :"  + Arrays.toString(a));
	}

}
