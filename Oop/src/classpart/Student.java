package classpart;

public class Student {
	int StudentID;
	String studentName;
	int grade;
	String address;
	
	/*public void showStudentInfo() {
		System.out.println(studentName+ "," + address); } */
	
	public String getstudentName() {
		return studentName;
	}
	
	public void setstudentName(String name) {
		studentName = name;
	}
}
