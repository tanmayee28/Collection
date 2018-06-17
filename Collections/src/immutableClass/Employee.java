package immutableClass;

final class Employee {
	final private int eid;
	final private String enm;
	final Address address;
	public Employee(int eid, String enm,Address address) {
		super();
		this.eid = eid;
		this.enm = enm;
		this.address=address;
	}
	public int getEid() {
		return eid;
	}
	public String getEnm() {
		return enm;
	}
	public Address getAddress() {
		return new Address(address.getStreet(),address.getCity());
	}
	@Override
	public String toString() {
		return "\n Employee [eid=" + eid + ", enm=" + enm + ", address=" + address + "]";
	}
	
	
	
	
	
	

}
