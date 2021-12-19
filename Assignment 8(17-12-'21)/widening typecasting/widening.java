//converts smaller to larger range//byte->short->char->int->long->float->double
public class widening {

	public static void main(String[] args) {
		int myInt = 9999;
		float myFloat=myInt;
		double myDouble=myInt;
		System.out.println("myfloat "+myFloat);
		System.out.println("myDouble "+myDouble);
		char mychar='a';//ASCII a=97
		myInt= mychar;
		System.out.println("mychar "+myInt);
		byte b='b';//ASCII value b=98
		myInt=b;
		System.out.println("myInt "+myInt);
}
}