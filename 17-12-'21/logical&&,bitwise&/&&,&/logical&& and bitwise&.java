//logical && and bitwise &
package operators;

public class logicbit {

	public static void main(String[] args) {
		int a = 9; //9 in binary is 1001
		int b = 8; //8 in binary is 1000//   1000=8//bitwise &
		System.out.println("a&b "+(a&b));  //returns 8 = 1000  
		int x = 10;  
		System.out.println(x<30 && x<60);  //returns true//logical &&
		System.out.println(x>50 && x>70);//return false
		

	}

}
