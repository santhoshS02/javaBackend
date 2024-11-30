package interviewquestions;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 121;
		int nums=num;
		
      int rev=0 ,n;
		
		while(num>0)
		{
			n= num%10;
			rev = rev *10 +n;
			num = num/10;
		}
		
		System.out.println(rev);
		if(rev==nums)
		{
			System.out.println("This palindrom");
		}
		else
		{
			System.out.println("This is not palindrom");
		}

	}

}
