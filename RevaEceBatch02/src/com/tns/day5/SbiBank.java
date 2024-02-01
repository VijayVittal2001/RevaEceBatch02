package com.tns.day5;

public class SbiBank extends ReserveBank {
	private String PersonName;
	private int accno;
	private String ifsccode;
	
	public SbiBank() {
		super();
	}

	public SbiBank(String personName, int accno, String ifsccode) {
		super();
		PersonName = personName;
		this.accno = accno;
		this.ifsccode = ifsccode;
	}

	public String getPersonName() {
		return PersonName;
	}

	public void setPersonName(String personName) {
		PersonName = personName;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	@Override
	public String toString() {
		return "SbiBank [PersonName=" + PersonName + ", accno=" + accno + ", ifsccode=" + ifsccode + ", branch="
				+ branch + ", getPersonName()=" + getPersonName() + ", getAccno()=" + getAccno() + ", getIfsccode()="
				+ getIfsccode() + ", getBankname()=" + getBankname() + ", getbranch()=" + getbranch() + "]";
	}

	
	

}
