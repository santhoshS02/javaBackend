package breakandcontinue;

public class Breakandcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			System.out.println( i);
			

			if( i == 8)
			{
				break;
			}
		}
		System.out.println("This will break the value after ");

		
		for(int j=0;j<=10;j++)
		{
			if(j==5 || j==8)
			{
				continue;
			}
			System.out.println( j);

		}
		System.out.println("This will skip the value in the given condition and print next value  ");
	}


}
