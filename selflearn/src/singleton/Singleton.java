package singleton;

//This is the singleton class  
class printer
{
	private static printer instance ;	   // This is the instance of the singleton  
	
	private printer()              //constructor for the singleton class
	{
		System.out.println("printer is ready to use ! ");
	}
	
	public static printer getInstance()        // private value are used by the get method 
	{
		if(instance == null)
		{
			instance = new printer();
		}
		return instance;
	}
	
	public void print(String document)		// Method input 
	{
		System.out.println("printing :" + document);
	}
}
    
public class Singleton {
	
	public static void main(String[] args) {
		// Try to get the instance of Singleton class
		
		printer p = printer.getInstance();         // object1 for the single ton . 
		
		p.print("document 1");
		
		printer p1 = printer.getInstance();			// object2 for the single ton .   but the both object are the same only  
		p1.print("document2");
		
		System.out.println(" are the both printer refers to the same ? "+ (p == p1));
	
	
		
	}

}
