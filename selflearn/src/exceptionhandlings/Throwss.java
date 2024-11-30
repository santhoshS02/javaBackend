package exceptionhandlings;

public class Throwss {
	public void throwexception() throws Exception
	{
		String str= null;
		System.out.println(str.length());
	}
	public void slave()
	{
		try
		{
		throwexception();
		}
		catch(Exception e)
		{
			System.out.println("This is null pointer exception" + e);
		}
	}

	public static void main(String[] args)   throws Exception{
		// TODO Auto-generated method stub
		
		Throwss obj = new Throwss();
		obj.slave();
		

	}

}
