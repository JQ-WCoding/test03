package com.myspring.test03;

public class StudentDelete {

	private StudentDAO studentDAO;
	
	public StudentDelete(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public void delete(String id) {
		studentDAO.delete(id);
	}
}
