  package collections;
import java.util.Scanner;
public class IoExceptionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner("hello");
		System.out.println(" " + Scan.nextLine());
		System.out.println("Exception output ");
		Scan.close();
		

	}

}
