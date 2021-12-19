//matrix multiplication
package matric;

public class matrixmultipication {

	public static void main(String[] args) {
		int m1[][]= {
				{1,2,3},
				{4,5,6}
		};//1st  array
		int m2[][]= {
				{7,8},
				{9,10},
				{11,12}
		};//2 nd array
		int sum=0;
		int r[][]=new int[2][2];//resultant matrix
		
		for(int i=0;i<2;i++) {//row
			for(int j=0;j<2;j++)//column
			{
				for(int k=0;k<3;k++)//adding we r taking k
				{
					sum = sum+m1[i][k]*m2[k][j];
				}
				r[i][j]=sum;
				sum=0;
				System.out.print(r[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
	

