package com.div;

public class Address {
	String hn,colony,city;

	public Address(String hn, String colony, String city) {
		super();
		this.hn = hn;
		this.colony = colony;
		this.city = city;
	}
	
	public String toString() {
		return "Address is: "+this.hn +", "+this.colony + ", "+this.city ;
	}

	/*public String getHn() {
		return hn;
	}

	public void setHn(String hn) {
		this.hn = hn;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
*/
}
