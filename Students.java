package week3.day1.assignments;

public class Students {
	
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
System.out.println("id is: "+ id);
	}
	public void getStudentInfo(int id, String name) {
		// TODO Auto-generated method stub
System.out.println("id and name is: "+ id + " " + name);
	}	
	
	public void getStudentInfo(String email, String phoneNum) {
		// TODO Auto-generated method stub
System.out.println("email and Phone number is: "+ email + " " + phoneNum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students stdObj = new Students();
stdObj.getStudentInfo(100);
stdObj.getStudentInfo(101, "Priya");
stdObj.getStudentInfo("aswinispriya@gmail.com", "9962031247");
	}

}
