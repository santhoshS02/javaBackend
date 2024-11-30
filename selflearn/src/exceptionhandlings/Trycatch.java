package exceptionhandlings;

public class Trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a=5;
	int b=0 ;
	
	try {
	int c=a/b;
			throw new Exception();  // it will Explicity show the error 
//	System.out.println("It correct" +" "+ c);
	
	}
	catch(Exception e)
	{
		System.out.println(e);

	}
	finally
	{
		System.out.println("bye bye ");
	}

	System.out.println("hello every one to chennai ");
	
	}

}
