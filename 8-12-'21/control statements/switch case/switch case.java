//switch case
package controlstatements;

public class switchcase {

	public static void main(String[] args) {
		String day="monday";
	    switch(day){
		case "monday":
			System.out.println("First day");
			break;
		case "tuesday":
			System.out.println("second day");
			break;
		case "wednesday":
			System.out.println("third day");
			break;
		case "thursday":
			System.out.println("fourth day");
			break;
		case "friday":
			System.out.println("fifth day");
			break;
		default:
			System.out.println("holiday");
		}
	
	}

}