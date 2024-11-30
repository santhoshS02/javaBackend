package factorial;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Factorial of the given number 
		System.out.println("Enter how many numbers do you want to find factorail :");
		Scanner N = new Scanner(System.in);
		int num = N.nextInt();
	
		int f=1;
		for(int i=1;i<=num;i++)
		{
			f=f*i;  // 1*1 = 1 , 1*2 = 2  , 2 * 3 = 6 , 6*4 = 24 , 24*5 = 120
		}
		System.out.println(" Factorial of f is : " +f);
		
		
		
		
		

	}

}
