package array;


import java.util.Arrays;
public class Twodimensionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {
				{34,56,76},
				{32,45,79},
				{34,86,25}
		};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print( " "+a[i][j]);
			}
			System.out.println( );
		}
		System.out.println(Arrays.deepToString(a));

		
		System.out.println(" noraml first Row and then Coloum");
		
		int b[][] = {
				{34,56,76},
				{32,45,79},
				{34,86,25}
		};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print( " "+b[j][i]);
			}
			System.out.println( );
		}
		System.out.println(Arrays.deepToString(b));
		System.out.println(" This is the first coloum and then Row ");
	}

}
