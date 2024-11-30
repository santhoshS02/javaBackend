package factorial;

import java.util.Scanner;

public class Sumandaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Find sum and average of the number 

		System.out.println("Enter the number:");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int sum=0,v;
		for(int i=1;i<=n;i++)
		{
			v = s.nextInt();
			sum += v;
		}
		System.out.println(sum);
		System.out.println(sum/n);

	}

}
