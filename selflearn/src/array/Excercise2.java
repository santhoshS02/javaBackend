package array;

public class Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {
				{4,34,56,23},
				{24,7,9,3},
				{23,6,1,87}
		};
		
		for(int i=0;i<a.length ;i++)
		{
			int temp =0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j] > a[i][j+1])
				{
					temp =a[i][j];
					a[i][j] = a[i][j+1];
					a[i][j+1]=temp;
					
				}
				
			}
			System.out.println(" The maximun number of the each row :"+temp);

		}
		}

}
