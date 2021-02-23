package com.cognizant.loan;

public class Loan {

	private String number;
	private String type;
	private double loan;
	private int emi;
	private int tenure;
	
	@Override
	public String toString() {
		return String.format("Loan [number=%s, type=%s, loan=%s, emi=%s, tenure=%s]", number, type, loan, emi, tenure);
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getLoan() {
		return loan;
	}
	public void setLoan(double loan) {
		this.loan = loan;
	}
	public int getEmi() {
		return emi;
	}
	public void setEmi(int emi) {
		this.emi = emi;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public Loan(String number, String type, double loan, int emi, int tenure) {
		super();
		this.number = number;
		this.type = type;
		this.loan = loan;
		this.emi = emi;
		this.tenure = tenure;
	}
}
