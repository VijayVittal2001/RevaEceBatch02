package com.assignment.tnsf;

public class Assignment1 {
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	private String source;
	private String destination;
	
	@Override
	public String toString() {
		return "Assignment1 [Name=" + Name + ", source=" + source + ", destination=" + destination + "]";
	}
	
	

}
