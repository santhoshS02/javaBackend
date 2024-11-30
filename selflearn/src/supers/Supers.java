package supers;



class cow {
	cow(int age)
	{
		System.out.println("ma ama ma ama");
	}
	void eat()
	{
		System.out.println("they will eat grass");
	}
}

class pow extends cow
{
	
	pow()
	
	{
		super(23);            // inside the parent class constructor value are access through the super key word 
		System.out.println("pow pow pow pow ");
	}
}
public class Supers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pow p = new pow();
		p.eat();
		

	}

}
