package waysOfClonning;

import java.io.Serializable;

public class Employee1 implements Cloneable,Serializable {
	
	
	int eid;
	String enm;
	Address ad;
	public Employee1(int eid, String enm, Address ad) {
		super();
		this.eid = eid;
		this.enm = enm;
		this.ad = ad;
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
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "\n Employee1 [eid=" + eid + ", enm=" + enm + ", ad=" + ad + "]";
	}
	public Employee1 clone() throws CloneNotSupportedException {
		Employee1 clonedemp=(Employee1)super.clone();
		Address ads=(Address) clonedemp.getAd().Clone();
		clonedemp.setAd(ads);
		return clonedemp;
	}
}
