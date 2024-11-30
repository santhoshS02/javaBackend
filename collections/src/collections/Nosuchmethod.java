package collections;

//Collection framework have default exception handling 
//there is no need to mention specific exception in it .
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Nosuchmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set exampleSet = new HashSet();
		Hashtable exTable = new Hashtable();
		exampleSet.iterator().next();
		exTable.elements();
		
		

	}

}
