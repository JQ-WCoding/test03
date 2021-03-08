package com.myspring.test03;

public class StudentController {
	
	private StudentDAO stDAO;
	
	private StudentInsert insert;
	private StudentSelect select;	
	private StudentSelectAll selectAll;
	private StudentUpdate update;
	private StudentDelete delete;
	
	public StudentController() {
	/*
	 	stDAO = new StudentDAO();	
		insert = new StudentInsert(stDAO);
		select = new StudentSelect(stDAO);
		selectAll = new StudentSelectAll(stDAO);
		update = new StudentUpdate(stDAO);
		delete = new StudentDelete(stDAO);
	 */
	}

	public StudentDAO getStDAO() {
		return stDAO;
	}

	public void setStDAO(StudentDAO stDAO) {
		this.stDAO = stDAO;
	}

	public StudentInsert getInsert() {
		return insert;
	}

	public void setInsert(StudentInsert insert) {
		this.insert = insert;
	}

	public StudentSelect getSelect() {
		return select;
	}

	public void setSelect(StudentSelect select) {
		this.select = select;
	}

	public StudentSelectAll getSelectAll() {
		return selectAll;
	}

	public void setSelectAll(StudentSelectAll selectAll) {
		this.selectAll = selectAll;
	}

	public StudentUpdate getUpdate() {
		return update;
	}

	public void setUpdate(StudentUpdate update) {
		this.update = update;
	}

	public StudentDelete getDelete() {
		return delete;
	}

	public void setDelete(StudentDelete delete) {
		this.delete = delete;
	}

}
