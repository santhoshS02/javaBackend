package thread;

import java.lang.*;
class Mythreads extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread run first" + i);
		}
	}
}

public class Mythread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythreads T1 = new Mythreads();
		T1.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
