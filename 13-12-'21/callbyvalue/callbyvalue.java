//call by value
public class calling {
	static int num=5;
	public static void main(String[] args) 
	{
		System.out.println("num= " +num);
		CallByValue(num);
		System.out.println("num after call by value=" +num);

	}
	public static void CallByValue(int n) {
		n=25;//num=5, makes copy of itself and sends to the n...
		//not the original variable...so,value not changed
		System.out.println("n inside call by value=" +n);
	}
}
