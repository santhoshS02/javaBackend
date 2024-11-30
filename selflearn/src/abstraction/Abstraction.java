package abstraction;

abstract class Member {
	private String name;

	 
	//abstract method 
	abstract void Welcomemessage();

}

class Student extends Member {
	void Welcomemessage() {
		System.out.println("Hello Students .......");
		
	}
}

class Teacher extends Member {
	void Welcomemessage() {
		System.out.println("Hello Teacher ....");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher T = new Teacher(); // It will create new object for the every time
		T.Welcomemessage();


		Member M = new Student(); // can not create new object .
		M.Welcomemessage();

		Member M1 = new Teacher();
		M1.Welcomemessage();

	}

}
