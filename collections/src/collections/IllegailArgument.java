package collections;

public class IllegailArgument {

	public static void print(int a)
	{
		if(a>=18)
		{
			System.out.println("Eligible for the vote");
		}
		else
		{
			throw new IllegalArgumentException("Not elgible for vote");
		}
	}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IllegailArgument.print(21);
		
	}

}  
