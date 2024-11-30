package inheritance;

// outer class
class Animals
{
	void eat()
	{
		System.out.println("This will eat ");
	}
}

// sub classes
class Dog extends Animals
{
	void bark()
	{
		System.out.println("This will bark");
	}
	void play()
	{
		System.out.println("they will play");
	}
}
//subclass
class puppy extends Dog
{
	void weep()
	{
		System.out.println("pupppy weep");
	}
}

//**************************************************************************//
//Separate hierarchy of classes

class birds
{
	void  fly()
	{
		System.out.println("They will fly high ");
	}
}
class eagle extends birds
{
	void kill()
	{
		System.out.println("They will kill snakes ");
	}
}
// **************************************************************************//
// main class
public class Multielevelinheritances {

	// instance varaibles 
	int num;
	String name;
	
	
	class students
	{
		void action()
		{
			System.out.println("They will play ");
		}
	}
	
	
	class teacher extends students
	{
		void teach()
		{
			System.out.println("They will tech");
		}

	}
	// functions for the inner class
	void display(int num,String name)
	{
		this.num = num;
		this .name= name;
	}
	
	
	// finction display 
	void displays() 
	{
		System.out.println(" This is the main class Roll no "+ this.num);
		System.out.println(" This is the main class name is " + this.name);
	}
	
	// **************************************************************************//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ourt class call function 
		puppy p = new puppy();
		p.weep();
		p.bark();
		p.eat();
		p.play();
		
		
		// main class call function 
		Multielevelinheritances M = new Multielevelinheritances();
		M.display(25, "santhosh");
		M.displays();
		
	    teacher t = M.new teacher();     // this is the main class . inner we will create sub class . // instance inner teacher so create like this .
	    
	    t.action();   
	    
	   eagle e = new eagle();
	   e.kill();
	    
		
		
		
	}

}
