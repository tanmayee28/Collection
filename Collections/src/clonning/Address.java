package clonning;

public class Address implements Cloneable {
	String city;
	int pincode;
	public Address(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "\n Address [city=" + city + ", pincode=" + pincode + "]";
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
	protected Address Clone() throws CloneNotSupportedException
	{
		return (Address)super.clone();
		
		
	}
	
}
