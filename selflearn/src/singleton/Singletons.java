package singleton;


public class Singletons {
	private static Singletons instance;
	
	private String name;
	private String password;
	private String email;
	
	private Singletons()
	{
		this.name = " Revathi" ;
		this.password= "xyzxyz";
		this.email= "reva@gmail.com";
	}
	
	private Singletons(String name,String pass, String email )
	{
		this.name = name;
        this.password=pass;
        this.email = email;
        System.out.println("DatabaseConnectionManager: Custom instance created.");
	}
	
	public static Singletons getInstance() {
        if (instance == null) {
            instance = new Singletons();  // Create default instance if it doesn't exist
        }
        return instance;  // Return the single instance
    }
	
	 // Example method to simulate database operations
    public void connect() {
        System.out.println("Connecting to database at " + name + " as " + password);
    }
    public void configureConnection(String name, String password, String email) {
        if (instance == null) {
            instance = new Singletons(name, password, email); // Create instance with custom parameters
        }
        System.out.println("Connected to database: " + name + " with user: " + password);

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
