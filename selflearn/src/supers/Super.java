package supers;


// Super class
class Employee
{
	String name;
	double salary;
	
// Constructor for the class
Employee(String name, double salary)
{
	this.name = name;       //  Instance variable 
	this.salary = salary;
}

// Method function 
void showdetails()
{
	System.out.println("Employee name :" + name);
	System.out.println("Employee salary: " + salary);
}

}


// This will extends the parent class to the subclass 
class Manager extends Employee
{
	double  bonous;
	
	Manager(String name , double salary , double bonous)
	{
		super(name,salary);                                 // in the super key word are used for the access the parent class data first and then then use the subclass .
		this.bonous = bonous;
	}
	
	void showdetails()
	{
		super.showdetails();							// This also print the first parent class data and then print he child class.
		System.out.println("manager bonnus : " + bonous);
	}
}

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Manager M = new Manager("santhosh",45000,6000);
			M.showdetails();
	}

}
