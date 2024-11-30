package interviewquestions;

public class ReverseEachWord {

	// String word reverse 
	public static void main(String[] args) {
		
		// approach first
		String word  = "Welcome to java"; 
		
		String[] words = word.split(" "); // Splitting string into words
		
		String reverseString = "";
		
		for(String w:words)
		{
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseword= reverseword+w.charAt(i);
			}
			
			reverseString =  reverseString+reverseword+" ";
		}
		System.out.println("After reverse the string : "+reverseString);
		
		//********************************************************************//
		
		// second approach 
		
		String name  = "welcome to java serese";
		
		String[] str = name.split("\\s");
		String reverse=" ";
		
		for(String w:str)
		{
			StringBuilder sb = new StringBuilder(w);
			 sb.reverse();
			
			reverse = reverse+sb.toString() + " ";
			
		}
		System.out.println(reverse);
		
		
 	}

}
