package collections;

public class Numberformatex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int num = Integer.parseInt("dasa");   //number are given in the inner value 
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception  ");
		}

	}

}
