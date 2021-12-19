//larger to small datatype
public class narrowing {

	public static void main(String[] args) {
		double myDouble=912.567;//double to int
		int myInt=(int)myDouble;
		System.out.println("myInt "+ myInt);
		myInt=98;//int to char
		char mychar=(char)myInt;
		System.out.println("mchar "+mychar);
		short myshort=198;//short to byte
		byte b=(byte)myshort;
		System.out.println("byte "+b);
		
	}

}
