package inheritance;

// main class
class Animalses
{
	void eat()
	{
		System.out.println("This will eat ");
	}
}

// sub classes . this class extends with animals . This is single inheritance 
class Dogess extends Animalss
{
	void bark()
	{
		System.out.println("This will bark" );
	}
	void play()
	{
		System.out.println("they will play");
	}
}
//subclass. This is Hirerachical method . This class will extend with main class
class puppyiess extends Animalss
{
	void weep()
	{
		System.out.println("pupppy weep");
	}
}


// this is hybrid method . This dog will all ready combination of the some class . and the it will come one means hybrid .
class cat extends Dogess
{
	void breed()
	{
		System.out.println("This is mixing of dog and animals");
	}
}

public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		puppyiess p = new puppyiess();
		p.weep();
		p.eat();
		
		cat c = new cat();
		c.breed();
		c.bark();
		

	}

}
