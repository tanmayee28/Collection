package waysOfClonning;

import java.io.Serializable;

public class Address implements Cloneable,Serializable{
	String city;
	int pincode;
	
	public Address(String city, int i) {
		super();
		this.city = city;
		this.pincode = i;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "\n Address [city=" + city + ", pincode=" + pincode + "]";
	}
	public Address Clone() throws CloneNotSupportedException
	{
		return (Address) super.clone();
		
	}
	

}
