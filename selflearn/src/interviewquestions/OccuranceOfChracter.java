package interviewquestions;

public class OccuranceOfChracter {

	
	// character occureances
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="java is the oops concept";
		
		int total_count =s.length();  // total length.
		
		int total_count1=s.replace("a", "").length();  // total length after remove the a
		
		int count = total_count-total_count1;
		System.out.println("No of a is occur is : "+count);
	
	}

}
