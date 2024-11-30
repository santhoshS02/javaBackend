package interviewquestions;

public class Swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		int b = 20;

		System.out.println("befor swaping values are " + a + " " + b);
		
		// 1 rst method - temp method

		 int temp = a;
		 a=b;
		 b=temp;
		 System.out.println(a + " "+ b);

		// 2 nd logic - with out using third variable .

		 a=a+b;
		 b=a-b;
		 a=a-b;

		 System.out.println(a+ " "+b);

		// logic 3  - multiple and divide 

		
		 a=a*b; 
		 b=a/b; 
		 a=a/b;
		 
		System.out.println(a + " "+ b);

		
		// 4 logic  - xor method 
		
		a=a^b;
		b=a^b;
		a=a^b;

		System.out.println(a + " "+ b);

		// 5 logic   - single line method 
		
		b=a+b-(a=b);
		System.out.println(a + " "+ b);
		
	}

}
