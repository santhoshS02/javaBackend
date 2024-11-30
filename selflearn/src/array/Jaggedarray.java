package array;

public class Jaggedarray {
	// jagged array 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
				{1,25,69},
				{42,65},
				{23,84,98}
		};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0 ; j<a[i].length;j++)
			{
				System.out.print( " "+a[i][j]);
			}
			System.out.println( );
		}
		
		System.out.println("Normal jagged array");
		
		int b[][] = {
				{1,25,69},
				{42,65},
				{23,84,98}
		};
		
		for(int s[] : b)    // This is the for each method.
		{					// normal b values are stored in the array format in the s 
			for(int f : s)	// This "s" array format are transfer in to the f
			{
				System.out.print(f+" ");   
			}
			System.out.println( );
		}
				
	}

}
