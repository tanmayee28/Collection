package hashMap;

public class Employee {
	private int eid;
	private String enm;
	public Employee(int eid, String enm) {
		super();
		this.eid = eid;
		this.enm = enm;
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
	@Override
	public String toString() {
		return " \n Employee [eid=" + eid + ", enm=" + enm + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ((enm == null) ? 0 : enm.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eid != other.eid)
			return false;
		if (enm == null) {
			if (other.enm != null)
				return false;
		} else if (!enm.equals(other.enm))
			return false;
		return true;
	}
	

}
