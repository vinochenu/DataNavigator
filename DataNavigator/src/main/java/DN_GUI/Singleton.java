package DN_GUI;

public class Singleton {
	
	String name;
	
	static Singleton singleton_object; // declaration
	
	Singleton()// constructor
	{ 
		name="vinod";
	}
	
	public static Singleton getMethod() {
		
		if(singleton_object==null)
			singleton_object=new Singleton(); // initialization
		return singleton_object;
	}

	

}
