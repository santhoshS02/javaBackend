package factorial;

public class Removejunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A= "hello @ home -- in the & night * party ";
				
		String B= A.replaceAll("[^a-zA-Z0-9^]", "");
		System.out.println(B);

	}

}
