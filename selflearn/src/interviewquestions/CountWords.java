package interviewquestions;

public class CountWords {

	// count words in the string .
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s  = "hello every one";
		
		int count =1;
		
		for(int i=0;i<s.length()-1;i++)
		{
			if( (s.charAt(i)== ' ') &&(s.charAt(i+1)!=' '))
					{
						count++;
					}
		}
		
		System.out.println("After the count word is :  "+count);

	}

}
