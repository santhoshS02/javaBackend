package thread;
//Runnable are use the multiple class are implement are that why used the Runnable method

class B1 implements Runnable
{
	public void run()
	{
		System.out.println("Hi Hello .........");
	}
}
public class Myinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable  obj = new B1();
		
		Thread t1 = new Thread(obj);    //  In the Runnable can not run directly .buy using the Thread to run.
		t1.start();						// in the Thread inner value will pass the object values .

	}

}
