package inheritance;

class Animalss
{
	void eat()
	{
		System.out.println("This will eat ");
	}
}

// sub classes
class Doges extends Animalss
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
//subclass
class puppyies extends Animalss
{
	void weep()
	{
		System.out.println("pupppy weep");
	}
}


public class Hierachical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     puppyies p = new puppyies();
      p.weep();
      p.eat();
       
      Doges d = new Doges();
      d.bark();
      d.play();
      d.eat();
      
      
      
	}

}
