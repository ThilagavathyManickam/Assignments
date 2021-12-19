//divisible by itself and 1--prime number
public class primenumber {

	public static void main(String[] args) {
		int n=7;
		boolean prime=true;
		for(int i=2;i<n;i++) //7 divisible by 7 and 1--true
		{
			if(n%i==0) 
			{
			prime=false;
			break;
		   }
		}
		System.out.println(prime);
	}
}