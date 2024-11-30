package factorial;

import java.util.Arrays;
public class Ascendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,5,98,32,5,6,45,63};
		
		int temp =0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])    // check in the ascending .
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
			}

		}
		System.out.println(Arrays.toString(a));

	}

}
