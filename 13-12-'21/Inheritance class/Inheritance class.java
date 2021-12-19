/*Write a program to create a room class, 
 the attributes of this class is roomno, roomtype, roomarea and ACmachine.
   In this class the member functions are setdata and display*/

class roomclass
{
	int roomno;
	String roomtype;
	int Acmachine;
	void setdata(int roomno,String roomtype,int Acmachine)
	{
		this.roomno=roomno;
		this.roomtype=roomtype;
		this.Acmachine=Acmachine;
	}
	void display()
	{
		System.out.println("\t\tRoomname:" +roomno+ "\n\t\tRoomtype:" + roomtype + "\n\t\tACmachine:" + Acmachine);
	}
}
public class inheritanceclass {

	public static void main(String[] args) {
		
		roomclass ob=new roomclass();
		ob.setdata(129,"singleroom",12);
		ob.display();
	}

}
