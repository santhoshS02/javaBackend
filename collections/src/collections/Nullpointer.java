package collections;

public class Nullpointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String a=null;                //Null value or any character or String.
			System.out.println(a.charAt(0));      
		}
		catch(NullPointerException e)
		{
			System.out.println("nul pointer");
		}

	}

}
