///Write a program create a class ‘simpleobject‘. Using constructor display the message 
package constructor;

public class simpleobject {
	String name;
		simpleobject() 
		{
			// constructor
			  
		    System.out.println("Constructor Called:");
		    name = "Thilagavathy M";
		
		}
	
	public static void main(String[] args) {
		// constructor is invoked while
	    // creating an object of the Main class
	    simpleobject obj = new simpleobject();//create the object for the constructor class
	    System.out.println("The name is " + obj.name);
	    
	}

}
