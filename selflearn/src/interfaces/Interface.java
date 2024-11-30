package interfaces;


//interface  all are abstract class
// all the values are the public static final.

interface Animal{
	int mark = 20;          // in the abstarct method do not create the body 
   //	mark = 10;    			// it can not modify 
	 default void disp()       // in that we will use default or static 
	 {
		 System.out.println("hello");
	 }
	 void sound();
	 
}

class cat implements Animal
{
	public void sound()
	{
		System.out.println("meoooww   "+mark);
	}
	
	@Override 
	public void disp()
	{
		System.out.println("world");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Animal a = new Animal();       // interface don not create object
		cat c= new cat();
		c.sound();
		System.out.println(c.mark);
		System.out.println(Animal.mark);    // with out creating object using to call like this 
		c.disp();
	}

}
