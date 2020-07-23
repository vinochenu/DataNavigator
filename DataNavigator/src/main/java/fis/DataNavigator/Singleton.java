package fis.DataNavigator;

public class Singleton {
	
	private static Singleton single_instance=new Singleton(); 
	
	//private constructor inroder to avoid other class to initialize an object
	private Singleton(){
		
	}
	
	public static Singleton getinstance() {
		
		return single_instance;
	}
	
	
	
	/*String name;
	
	static Singleton singleton_object; // declaration
	
	Singleton()// constructor
	{ 
		name="vinod";
	}
	
	public static Singleton getMethod() {
		
		if(singleton_object==null)
			singleton_object=new Singleton(); // initialization
		return singleton_object;
	}*/

	

}
