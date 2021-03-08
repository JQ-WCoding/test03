package com.myspring.test03;

import java.util.Map;

public class StudentDAO {
	
	private static int NUM;
	
	private Map<String, Student> stDB;
	
	public int getLastNumber() {
		return StudentDAO.NUM;
	}
	
	public void insert(Student st) {
		this.stDB.put(st.getId(), st);
		
		StudentDAO.NUM += 1;
	}
	
	public Student select(String id) {
		return stDB.get(id);
	}
	
	public void update(Student st) {
		this.stDB.put(st.getId(), st);
	}
	
	public void delete(String id) {
		this.stDB.remove(id);
	}

	public Map<String, Student> getStDB() {
		return stDB;
	}

	public void setStDB(Map<String, Student> stDB) {
		this.stDB = stDB;
	}
	
}
