package week1.day1;

public class Student {
	

String studentName ="Rajesh";
int studentRollnumber=16429;
public String College() {
	String collegeName ="Rec";
	return collegeName;
}	
public void Department() {
	String Department ="Automobile";
	System.out.println("Department      :  " + Department);
	
}

void location(String address) {
	System.out.println("Location         :  "  + address);
	
}

 public static void main(String[] args) {
	
		Student collegeDeatils = new Student();
		
		System.out.println("Name          :  "  + collegeDeatils.studentName);
		System.out.println("Roll Number   :   " + collegeDeatils.studentRollnumber);
		System.out.println("College Name  :  "  + collegeDeatils.College());
		collegeDeatils.College();
		collegeDeatils.Department();
		collegeDeatils.location("Thandalam");	
		
	}
	
}
