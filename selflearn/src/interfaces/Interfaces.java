package interfaces;


//in this case why should go for interface means . in that they are two dip
interface Printable
{
	void display();
	
	
	
}

interface Showable
{
	void display();
}

class C implements Printable, Showable
{
	@Override
	public void display()
	{
		System.out.println("class c");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 C c1 = new C();
		 c1.display();
		 
	}

}
