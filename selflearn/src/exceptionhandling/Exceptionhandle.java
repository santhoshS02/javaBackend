package exceptionhandling;

import java.io.*;  // file handling

// Exception handling 
public class Exceptionhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// unchecked exception
		int a=10;int b=0;
		int c=0;        //In this place the "c" will might error.because of the a/b=error
		
		try				// used try in build try the element values and then show the result
		{
			int arr[]=null;     // In the exception error will occuire not check below code
			System.out.println(arr[1]);
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is Arithemetic Exception");
		}
		catch(NullPointerException e)
		{
			System.out.println("This is null pointer Exception ");
		}
		catch(Exception e)
		{
			System.err.println("Error occured");
		}
		
		finally {
			System.out.println("This gets printed no matter . finally print ");
		}
		
		
		// checked exception 
		File file = new File("abc.txt");
		try {
		FileInputStream fs = new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();   // This is why this error will occur will show thats why print this line
		}
		System.out.println(c);
		 
	
		
		
		
		
	}

}
