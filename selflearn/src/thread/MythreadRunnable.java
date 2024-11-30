package thread;

class Mythreades implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child class");
		}
	}
	
}

public class MythreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythreades T1 = new Mythreades();
		Thread T2 = new Thread(T1);
		T2.start();
		
		for(int i =0;i<10;i++)
		{
			System.out.println("main Thread");
		}

	}

}
