package org.stud.info;

public class Students {
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id:" +id+ " Student name:" +name);
	}
	public void getStudentInfo(String email, long phonenumber) {
		System.out.println("Student email:" +email+ " Student phone number:" +phonenumber);
	}
	public static void main(String[] args) {
		Students sd = new Students();
		sd.getStudentInfo(1240, "Pradeepa");
		sd.getStudentInfo("stellapradeepa23@gmail.com", 9848364775L);		
		System.out.println();
	}
}
