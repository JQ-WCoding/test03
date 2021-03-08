package com.myspring.test03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

public class StudentSelectAll {
	
	private StudentDAO studentDAO;
	
	public StudentSelectAll(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public Map<String , Student> allSelect(){
		return studentDAO.getStDB();
	}
	
	public void printAll() {
		Map<String , Student> stDB = studentDAO.getStDB();

		ArrayList<Student> studentList = new ArrayList<Student>();
		for(String key : stDB.keySet()) {
			studentList.add(stDB.get(key));
		}
		
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if(s1.getNum() < s2.getNum()) {
					return -1;
				}else if(s1.getNum() > s2.getNum()) {
					return 1;
				}
				return 0;
			};
		}); 
		
		
		for(Student st : studentList) {
			st.print();
		}
	}
	
}
