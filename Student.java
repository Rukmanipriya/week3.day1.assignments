package week3.day1.assignments;

public class Student extends Department {
	
	public void studentName() {
		// TODO Auto-generated method stub
System.out.println("Student Name");
	}
	
	public void studentDept() {
		// TODO Auto-generated method stub
System.out.println("Student Dept");
	}
	
	public void studentId() {
		// TODO Auto-generated method stub
System.out.println("Student Id");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student studentObj = new Student();
studentObj.collegeCode();
studentObj.collegeName();
studentObj.collegeRank();
studentObj.departmentName();
studentObj.studentId();
studentObj.studentName();
studentObj.studentDept();

	}

}
