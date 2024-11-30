package collections;

import java.util.ArrayList;
import java.util.*;

public class ArrayToCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array input
        String playersArray[]
            = { "Virat", "Sachin", "Rohit", "Bumrah" };
       
        // printing input elements for comparison
        System.out.println("Array input: " + Arrays.toString(playersArray));
       
        // converting array into Collection
        // with asList() function
        List playersList = Arrays.asList(playersArray);
       
        // print converted elements
        System.out.println("Converted elements: "
                           + playersList);
	}

}
