package interviewquestions;

public class EvenandOddfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {20,45,63,78,95,12,35,22,44};
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"even");
			}
			else
			{
				System.out.println(i+"odd");
			}
		}
		//***********************************************************//
		//Enhanced for loop 
		System.out.println("This are the Even number");

		for(int num:a)
		{
			if(num%2==0)
			{
				System.out.println(num);
			}
		}
		
		System.out.println("This are the odd number ");

		for(int num :a)
		{
			if(num%2==1)
			{
				System.out.println(num);
			}
		}

	}

}
