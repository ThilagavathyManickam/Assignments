//sum of digits
public class addition {

	public static void main(String[] args)
	{
		int num=437;
		int sum=0;
		while(num>0) {
			int temp=num%10;//437%10=7--43%10=3--4%10=4
			sum=sum+temp;//sum=0+7=7--sum=7--7+3=10--10+4=14
			num=num/10;//num=437/10=43--43/10=4
		}
		System.out.println(sum);

	}

}
