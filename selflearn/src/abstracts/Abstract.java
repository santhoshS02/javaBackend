package abstracts;

// it is the abstract class method 
abstract class vechile
{
	abstract void speed();    // abstract method can,t create body 
	
	 void brand()             // This is normal  display method 
	{
		System.out.println("some thing bmw");
	}
}


// abstract sub class
class bike extends vechile
{
	void speed()               // in the abstract we will create conform
	{
		System.out.println("100");
	}
}


public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bike b = new bike();
		b.speed();
		b.brand();

	}

}
