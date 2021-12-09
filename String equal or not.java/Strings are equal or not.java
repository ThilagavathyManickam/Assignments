//given strings are equal or not
public class assignment2 {

	public static void main(String[] args) {
		String str1="Hello World!";
		String str2="Hello World!";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		//by using object creating new string
    	String s3=new String("hello");
        String s4=new String("hello");
        System.out.println(s3==s4);//false (y because it  will store in heap)
		System.out.println(s3.equals(s4));      
	}

}

