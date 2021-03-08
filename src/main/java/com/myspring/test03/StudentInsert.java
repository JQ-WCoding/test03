package com.myspring.test03;
public class StudentInsert {
	
	private StudentDAO studentDAO;
	
	public StudentInsert(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}	
	
	public void insert(Student student) {
		String id = student.getId();
		if(checkId(id)) {
			System.out.println("중복아이디 입니다.");
		}else {
			studentDAO.insert(student);
		}
	}
	
	public boolean checkId(String id) {
		Student student = studentDAO.select(id);
		return student != null? true:false;
	}
}
