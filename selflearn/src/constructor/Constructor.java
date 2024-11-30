 package constructor;


// constructor files 

// main class 
public class Constructor {
	 String Name;   // Instance values
	 int age;
	 String Native; 
	 long number;
	 String Works;
	 
	 
	 Constructor(String N, int a, String na, long n )
	 {
		 this.Name = N;        // In this key words are refers the instance of the objects variable 
		 this.age = a;
		 this.Native= na;
		 this.number= n;
		 
	 }
	 
	
	 
	 void display()
	 {
		 System.out.println(" The person details :" + Name +" " +  age +" " +  Native +" " +  number);
	 }
	 
	 
	 
	 void display1(String work)
	 { 
		this. Works = work;      // In this method we use another variable are used .
		 System.out.println(" The person details :" + Name +" " +  age +" " +  Native +" " +  number + " "+ Works);

	 }
	 
	 
	 
	 
	 // main function

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Constructor C = new Constructor("santhosh" , 23 , " namakkal" , 9293949596l);  //  In the constructor inside value are the Instance values
		C.display(); 
		
		Constructor C1 = new Constructor("Ramesh" , 25 , " Salem" , 8283848586l);
		C1.display();
		C1.display1("developer");
		
	}

}
