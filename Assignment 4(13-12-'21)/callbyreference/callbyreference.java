// call by reference
public class calling {
	static int num=7;

	public static void main(String[] args)
	{
		System.out.println("num is:" +num);
		calling obj=new calling();
		CallByReference(obj);
		System.out.println("num after call by reference= "+num);
	}
	public static void CallByReference(calling ob) {
		ob.num=20;//changes take place it reflect in original object
		
	}

}
