package com.myspring.test03;

public class Student {
	private int num;
	private String id;
	private String pw;
	
	public Student() {}
	public Student(int num, String id, String pw) {
		this.num = num;
		this.id = id;
		this.pw = pw;
	}	
	
	public void print() {
		System.out.println(num + " " + id + " " + pw);
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
