package classpart;

public class Student {
	
	/*
	 * 학생 클래스 만들기
	 * (접근제어자) class 클래스이름 {
	 * 		멤버변수;
	 * 
	 * int studentID;
	 * String studentName;
	 * int grade;
	 * String address;
	 * 
	 * 		메서드;
	 * 
	 * public void showStudentInfo() {
	 * System.out.println(StudentName + ","+ address)
	 * 		}
	 * }
	 * 
	 */
	
	int StudentID;
	String studentName;
	int grade;
	String address;
	
	/*public void showStudentInfo() {
		System.out.println(studentName+ "," + address); } */
	
	public String getstudentName() {
		return studentName; // 학생 이름을 반환하는 메서드
	}
	
	public void setstudentName(String name) {
		studentName = name;
	}
	
}
