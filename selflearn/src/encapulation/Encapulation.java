package encapulation;

// In the encapulation means there will specify the access modifier type . Like private , public, protected..

public class Encapulation {
	
	private String make;
	private  String model;
	private  final int year;
	
	Encapulation(String make,String model, int year)
	{
//		this.make = make;
		this.model= model;
		this.year= year;
		this.setmake(make);   // this for the set method new value assign .
	}
	
	// In the Get method to access the private variables
	
	public String  getmake()
	{
		return make;
	}
	
	public String  getmodel()
	{
		return model;
	}
	public int  getyear()
	{
		return year;
	}
	
	// this is set method for reassign the values private values 
	public void setmake(String make)
	{
		this.make=make;
	}
	
}
