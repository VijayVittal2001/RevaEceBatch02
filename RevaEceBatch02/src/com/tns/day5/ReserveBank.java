package com.tns.day5;

public class ReserveBank {
	private String Bankname;
	protected String branch;
	
	public ReserveBank() {
		System.out.println("RBI object is created");
	}

	

	public ReserveBank(String bankname, String branch) {
		super();
		this.Bankname = bankname;
		this.branch = branch;
	}



	public String getBankname() {
		return Bankname;
	}

	public void setBankname(String bankname) {
		Bankname = bankname;
	}

	public String getbranch() {
		return branch;
	}

	public void setbranch(String branch) {
		branch = branch;
	}

	@Override
	public String toString() {
		return "ReserveBank [Bankname=" + Bankname + ", branch=" + branch + "]";
	}
	
	

}
