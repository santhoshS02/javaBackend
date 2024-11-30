package factorial;


import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number : ");
		Scanner N= new Scanner(System.in);
		
		int num= N.nextInt();
		
		int f=0;
		int s=1;
		int temp =0;
		
		for(int i=2;i<=num;i++)
		{
			temp = f+s;
			f=s;
			s=temp;
		}
		System.out.println(temp);

	}

}
