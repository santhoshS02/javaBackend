package interviewquestions;

import java.util.Scanner;

public class ArraylistUserGiveInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int size = 5;
		
		int number[]= new int [size];   // Declare the array .
		
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the number : "+ i);
			number[i]= sc.nextInt();
			
		}
		
		for(int numbers:number)

	{
			System.out.print(numbers  + " ");
	}
	}

}
