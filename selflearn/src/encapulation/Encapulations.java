package encapulation;

public class Encapulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapulation E= new Encapulation("crita" , " whitesmoke" , 2023);
		
		System.out.println(E.getmake());     // this is the with out change the value 

		E.setmake("skoda");   // In this is the change the values buy using Set method .
		
		System.out.println(E.getmodel());
		System.out.println(E.getyear());
		System.out.println(E.getmake());   // this is the change values to print

		
		

	}

}
