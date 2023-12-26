
public class SingleObject {
	
	// create an object of SingleObject
	private static SingleObject instance = new SingleObject();
	
	
	// make the constructor private so this class can not be
	// instantiated
	private SingleObject() {};
	
	// Get the only object variable
	public static SingleObject getInstance() {
		return instance;
	}
	
	
	public void showMessage() {
		System.out.println("Hello, World!");
	}

}
