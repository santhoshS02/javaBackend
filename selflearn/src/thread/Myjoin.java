package thread;


class A1  extends  Thread
{
	
	int j=0;
	 public void run()
	 {
		 for(int i=0;i<30;i++)
		 {
			 j=i;               // it means every time i loop will run means the j will increment.
		 }
	 }
}
public class Myjoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj = new A1();
		obj.start();
		try
		{
			obj.join();               // It will wait for the program until the object run method will excuite 
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(obj.j);
	}

}
