package interviewquestions;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=23;
		int b=90;
		int c=70;
		
		// 1 st logic 
		if(a>b && a>c)
		{
			System.out.println("A is greatest number " + a);
		}
		else if(b>a && b>c)
		{
			System.out.println(" B is greatest number " +b);
		}
		else
		{
			System.out.println(" c is greatest number " + c);
		}
		
		// 2 nd logic - ternary operator
		
		int largest1  = a>b?a:b;
		int largest2= c>largest1?c:largest1;
		
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		
		
		System.out.println(largest);
	}

}
