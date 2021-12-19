//This (represents instance variable of current object)
class student{
	int rollno;
	String name;
	float fee;
	student(int rollno,String name,float fee){//instance variable and constructor have same means use this keyword
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}

public class Thistest {

	public static void main(String[] args) {
		student s1=new student(4242,"thilak",5000f);
		student s2=new student(3535,"gayu",6000f);
		s1.display();
		s2.display();
	}
		

}}

