package com.myspring.test03;

public class StudentUpdate {

	private StudentDAO studentDAO;
	
	public StudentUpdate(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}	
	
	public void update(Student student) {
		studentDAO.update(student);
	}
	
	
}
