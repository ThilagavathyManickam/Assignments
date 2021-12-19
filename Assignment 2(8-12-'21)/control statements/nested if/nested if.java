// find whether a given  number is positive or even 
package controlstatements;

public class nestedif {

	public static void main(String[] args) {
		int x=-9;
		if(x>0) {
			if(x%2==0) {
				System.out.println("The number is positive and even ");	
			}
			else {
				System.out.println("Number is positive not even ");		
			}
		}
		else {
			System.out.println("Number is not positive number");
		}
		
	}

}
