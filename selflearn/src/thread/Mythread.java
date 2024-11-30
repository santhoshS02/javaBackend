package thread;

// Normal thread program.

class A extends Thread    // class will extends thread
{
	public void run()    // Thread can run in the this "run()" method only
	{
		for(int i=0;i<=13;i++)
		{
		System.out.println("Hello every one ");
		try {
			Thread.sleep(102);        // It will wait for the at the particular time 
			
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	}
}

class B extends Thread 
{
	
	 public void run()
	 {
		 for(int i=0;i<30;i++)
		 {
		 System.out.println("vanakama da maplala....");
	 
	 try
	 {
	 Thread.sleep(12);
	 }
	 catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	 }
	 }
	 
}
public class Mythread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.start();    // Thread  are call by start method 
		
		obj.setPriority(10);
		B obj1= new B();
		obj1.start();

	}

}
