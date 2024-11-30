package inheritance;

// Noraml outer classs
class Animal{
	
	void eat()    // method or function
	{
		System.out.println("This animal can eat ");
	}
	
	// Class one extends class Two . 
	// subclass 
	class Dog extends Animal
	{
		void bark()  // method or function 
		{
			System.out.println("Dogs can barks");
		}
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal animal = new Animal();  // Creating an instance of the Animal class
//        animal.eat();  // Calling the eat method of Animal class
        
        Dog d1 = new Dog();  // Creating an instance of the Dog class, which is a subclass of Animal
        d1.bark();  // Calling the bark method of Dog class
        d1.eat();  
		
		
		
		

	}

}
