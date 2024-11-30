package accessmodifier1;

import accessmodifier2.Teacher;
class teacher
{
	public String t_name = "Ramya";    // this will access any where in the program
	private String name= "Rema";		// this will access in the class only .
	

	 void display()                          // this for the private class 
	{
		System.out.println(name);
	}
	
}

public class Student extends Teacher{         // In the  extends Teacher will used for the other package protected file access so created .

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teacher t = new teacher();
		System.out.println(t.t_name);  // this is the public class
//		System.out.println(t.name);
		t.display();     // this private function calling 
		
		
		// ************************************************************//
		
		Animals A = new Animals();   // in this for the same package  with different class name will crated .that time for the this object 
		System.out.println(A.rate);
		A.breed();
		
		
		
		//***************************************************************//
 		Student S = new Student();         // this will for the Protected object 
		System.out.println(S.salary);
		
	}

}
