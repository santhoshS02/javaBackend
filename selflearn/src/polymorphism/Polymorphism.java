package polymorphism;


// poly - many , morph- form ;
// The ability of an object 
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		Boat b= new Boat();
		Vechile v = new Vechile();
		
		Vechile[] racers = {c, b, v};
		
		for(Vechile x : racers )
		{
			x.go();
			
		}
	}

}
