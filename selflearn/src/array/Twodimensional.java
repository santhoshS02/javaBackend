package array;

public class Twodimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=
			{
					{20,34,65},
					{23,56,78},
					{21,45,89}
			};
		int b[][] = {
				{34,56,76},
				{32,45,79},
				{34,86,25}
		};
		
		System.out.println(b[0][2]);
		System.out.println(b[2][2]);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print( " "  +a[i][j]);
			}
			System.out.println( );
		}

	}

}
