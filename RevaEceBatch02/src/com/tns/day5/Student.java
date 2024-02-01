package com.tns.day5;

public class Student extends Citizen {
	private int rollnum;
	private String collegename;
	
	public Student() {
		super();
		}
	

	public Student(String name,String adharno,String address,long phno,int rollnum, String collegename) {
		super(name,adharno,address,phno);
		this.rollnum = rollnum;
		this.collegename = collegename;
	}


	public int getRollnum() {
		return rollnum;
	}


	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}


	public String getCollegename() {
		return collegename;
	}


	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}


	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", collegename=" + collegename + ", getName()=" + getName()
				+ ", getAdharno()=" + getAdharno() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno()
				+ "]";
	}


	
	
	
	
	
	

}
