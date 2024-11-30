package pattern;

// pattern printing 
public class Pattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			pattern1(4);
//			pattern2(5);
//			pattern3(5);
//		    pattern4(5);
//			pattern5(5);
//			pattern6(5);
//			pattern7(5);
//		    pattern8(5);
	}
	
	// pattern logic . 
	static void pattern1(int n)
	{
		for(int i= 1 ;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println( );
		}
		System.out.println("pattern 1 complete");
	} 
	
	//***************************************************************************************************//
	
	static void pattern2(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				System.out.print(" * ");
			}
			System.out.println( );
		}   
		System.out.println("pattern 2  complete ");
	}
	
	//*****************************************************************************************************//
	static void pattern3(int n)
	{
		for(int i =0 ;i<n ; i++)
		{
			for(int j=n ;j>=i ; j--)           //			for(int j=0 ;j<n+1-i ; j++)

			{
				System.out.print( " * ");
			} 
			System.out.println( );
		}
		System.out.println("pattern 3  complete ");

	}
	//*****************************************************************************************************//
	
	static void pattern4(int n)
	{
		for(int i = 1; i<=n;i++)
		{
			for(int j=1;j<=i ;j++)
			{
				System.out.print( " "+j+" " );
			}
			System.out.println( );
		}
		System.out.println("pattern 4  complete ");

	}
	//*****************************************************************************************************//

	static void pattern5(int n)
	{
		for(int i=1;i<2*n;i++)      
		{
			int x = i>n?2*n-i:i;
			
			for(int j=0;j<= x;j++)
			{
				System.out.print(" * ");
			}
			
			System.out.println( );
		}
		System.out.println("pattern 5 complete ");
	}
	//*****************************************************************************************************//
	static void pattern6(int n)
	{
		for(int i =1 ;i<=n ; i++)
		{
			int x = n-i;
			for(int j = 1 ; j<=x ;j++)
			{
				System.out.print(" " ); 

			}
			for(int j =1  ; j<=i ;j++)
			{

			System.out.print( "*");
			}
			System.out.println( );
		}
		System.out.println("pattern 6 complete ");

	 
	}
	//*****************************************************************************************************//
	
	static void pattern7(int n)
	{
		for(int i=n ;i>=0;i-- )
		{
			int x= n-i;
			for(int j = 0 ;j<x ;j++)
			{
				System.out.print(" ");          // spacing the front value .
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println( );  
		} 
		System.out.println("pattern 7 complete");
	}

	//*****************************************************************************************************//
 
	static void pattern8(int n)
	{
		for(int i=1; i<=n; i++)
		{
			int x = n-i;
			for(int j= 0 ; j<=x ;j++)
			{ 
				System.out.print("");
			}
			for(int j=n-i ; j>=0;j++)
			{
				System.out.println("*");
				
				for(int z= 0 ; z<=x ;z++)
				{
					System.out.print("");
				}
			}
				System.out.println( );
		}
		System.out.println(" pattern 8 complete");
	}
	//*****************************************************************************************************//

}
