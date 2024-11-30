package interviewquestions;

public class RemoveJunk {
// remove junk file 
	public static void main(String[] args) {
		
		String s= "a,?d?feee;xc<sdfv %~` junk file contain ";
		
		String out = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(out);
	}
	

}
