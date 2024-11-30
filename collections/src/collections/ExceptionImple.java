package collections;
//what is error. -  An error is a subclass of through able and raist the unexcipted the application

//types - syntax error occur any mistake in the code , run time error - occur during excution of the error , logical error - the program produce excepted output.
// ctrl ,shift ,F.
public class ExceptionImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] mynum = { 1, 2, 3 };
			System.out.println(mynum[10]);

		} catch (Exception e) {
			System.out.println("some thing went wrong" + e);
		} finally {
			System.out.println("Try catch completed");
		}

	}

}
