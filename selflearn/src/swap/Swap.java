package swap;

public class Swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 5, b = 10;
	        System.out.println("Before swapping: a = " + a + ", b = " + b);

	        // Swapping using a temporary variable
	        
	        int temp = a;
	        a = b;
	        b = temp;

	        System.out.println("After swapping: a = " + a + ", b = " + b);
	  
	
	}

}
