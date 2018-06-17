package clonning;

public class Employee implements Cloneable {
	int eid;
	String enm;
	Address ads;
	public Employee(int eid, String enm, Address ads) {
		super();
		this.eid = eid;
		this.enm = enm;
		this.ads = ads;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEnm() {
		return enm;
	}
	public void setEnm(String enm) {
		this.enm = enm;
	}
	public Address getAds() {
		return ads;
	}
	public void setAds(Address ads) {
		this.ads = ads;
	}
	@Override
	public String toString() {
		return "\n Employee [eid=" + eid + ", enm=" + enm + ", ads=" + ads + "]";
	}
	protected  Employee Clone() throws CloneNotSupportedException
	{
		//return (Employee)super.clone();
		Employee CloneEmployee = (Employee)super.clone();
		Address cloneadd=(Address)CloneEmployee.getAds().Clone();
		CloneEmployee.setAds(cloneadd);
		return CloneEmployee;
		
	}
}
