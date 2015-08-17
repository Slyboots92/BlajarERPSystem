package entity;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6318526482970789694L;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstname=" + firstname
				+ ", lastName=" + lastName + ", classes="
				+ Arrays.toString(classes) + "]";
	}
	private String studentId;
	private String firstname;
	private String lastName;
	private String classes[];
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String[] getClasses() {
		return classes;
	}
	public void setClasses(String[] classes) {
		this.classes = classes;
	}

	
}
