//To find the sum of command line arguments and count the invalid integers entered.
package example2;

public class commandlinearguments {

	public static void main(String[] args) 
			{
				int sum=0;
				for(int i=0;i<args.length;i++)
				{
					sum=sum+Integer.parseInt(args[i]);
				    //System.out.println(i);	
				}
				System.out.println("The sum of command line arguments is :"+sum);
			}

	}

