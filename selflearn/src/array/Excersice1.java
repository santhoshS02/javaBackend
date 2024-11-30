package array;

public class Excersice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Sum of the each row values 
		int a[][]= { 
				{ 12,45,67},
				{45,78,12},
				{23,71,93}
		};
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;

			for(int j=0;j<a.length;j++)
			{
				sum += a[i][j];
				
			}
			System.out.println(" The sum of the row one is "+sum + " ");

		}
		System.out.println();


	}

}
