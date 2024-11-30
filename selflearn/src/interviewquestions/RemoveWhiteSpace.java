package interviewquestions;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String name = "As i am a java  full Stack  developer ";
		
		String out = name.replaceAll("\\s", "");
		
		System.out.println(out);
		
	}

}
