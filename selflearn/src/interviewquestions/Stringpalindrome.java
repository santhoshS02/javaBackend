package interviewquestions;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner names = new Scanner(System.in);
		System.out.print("Enter the String name : ");
		String name = names.next();
		String revs= "";
		String name1=name;
		
		for(int i=name.length()-1;i>=0;i--)
		{
			revs+=name.charAt(i);
		}
		if(name1.equals(revs))
		{
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("This is not palindrome");
		}
		
		
				}

}
