package factorial;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s = "madams";
		
		String rev = "";
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
			
		}
		if(rev.equals(s))
		{
			System.out.println("This is palindrom"+  " " +rev);
		}
		else
		{
			System.out.println("This is not a palindrom"+ " " +rev);
		}

	}

}
