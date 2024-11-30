package factorial;

import java.util.Arrays;
public class Insertarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,50,80,90};
		
		int index=2;
		int value = 55;
		
		for(int i = a.length-1 ; i>index ;i--)
		{
			a[i]=a[i-1];
			
		}
		 a[index]=value;
		
		for(int num : a)
		{
		}
		System.out.println(Arrays.toString(a));

	}

}
