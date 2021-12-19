//access all primitives datatype
public class assignment1 {
    int a=10;//global variable... takes garbage value
	double d;
	short s;
	long l;
	char c;
	boolean b;

	public static void main(String[] args) {
	
	    assignment1 st= new assignment1();
		//int a=10;//local variable...we should initialize first
		
    	        System.out.println(st.a);	
		System.out.println(st.d);	
		System.out.println(st.s);	
		System.out.println(st.c);	
		System.out.println(st.b);	

	}

}
