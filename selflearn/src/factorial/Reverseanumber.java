package factorial;

import java.util.Scanner;
public class Reverseanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Find the reverse the number 
		
		System.out.println("Enter the number :");
		Scanner N=new Scanner(System.in);
		int num = N.nextInt();
		
		int sum=0,n;
		while( num>0)
		{
		 n = num%10;
		sum = sum*10+n;
		 num =num/10;
		}
		System.out.println(sum);
	}

}
