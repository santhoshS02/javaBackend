package interviewquestions;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
		System.out.print("enter the integer number only : ");
		int num = value.nextInt();
		int rev=0 , n;
		
		while(num>0)
		{
			n= num%10;
			rev = rev *10 +n;
			num = num/10;
			
		}
		
		System.out.println(rev);
		//***********************************************************************//
		
		
		//2nd logic    -- stringBuffer method
		StringBuffer revs;
		
		StringBuffer SB= new StringBuffer(String.valueOf(num));
		 revs = SB.reverse();
		 System.out.println(revs);
		
		
		//***********************************************************************//
		 
		 //3rd logic  -- stringBuilder method
		 
		 StringBuilder SB1 =new StringBuilder();
		 SB1.append(num);
		 StringBuilder revers =SB1.reverse();
		 System.out.println(revers);

	}

}
