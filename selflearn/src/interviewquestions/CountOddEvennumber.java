package interviewquestions;

public class CountOddEvennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123465832;
		int  countodd= 0;
		int counteven= 0;
		
		while(num>0)
		{
			int rem = num%10;
			
			if(rem%2==0)
			{
				counteven++;
			}
			
			else
			{
				countodd++;
			}
			num=num/10;

		}
		System.out.println(counteven);
		System.out.println(countodd);
	}

}
