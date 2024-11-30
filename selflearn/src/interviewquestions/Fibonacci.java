package interviewquestions;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;
		int s=1;
		int sum =0;
		
		int n=7;
		for(int i=2;i<=n;i++)
		{
			
			sum = f+s;
			System.out.print (" " + sum);

			f=s;
			s=sum;
			
		}

	}

}
