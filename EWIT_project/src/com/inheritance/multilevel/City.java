package com.inheritance.multilevel;

public class City extends State {
private String name;
private String locality;





public City(String countryName, String aadharNo, String state, String language,String name, String locality)
{
	super(countryName, aadharNo, state, language);
	
}





public String getName() {
	return name;
}





public void setName(String name) {
	this.name = name;
}





public String getLocality() {
	return locality;
}





public void setLocality(String locality) {
	this.locality = locality;
}


}
