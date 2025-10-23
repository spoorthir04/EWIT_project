package com.inheritance.multilevel;

public class Country {
	private String countryName;
	private String aadharNo;
	
	
	
	
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", aadharNo=" + aadharNo + "]";
	}
	public Country(String countryName, String aadharNo) {
		super();
		this.countryName = countryName;
		this.aadharNo = aadharNo;
	}






}
