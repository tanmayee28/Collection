package cursorDemo;

public class Employee {
	private int empid;
	private String estr;
	public Employee(int empid, String estr) {
		super();
		this.empid = empid;
		this.estr = estr;
	}
	@Override
	public String toString() {
		return "\n Employee [empid=" + empid + ", estr=" + estr + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEstr() {
		return estr;
	}
	public void setEstr(String estr) {
		this.estr = estr;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((estr == null) ? 0 : estr.hashCode());
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
		if (empid != other.empid)
			return false;
		if (estr == null) {
			if (other.estr != null)
				return false;
		} else if (!estr.equals(other.estr))
			return false;
		return true;
	}
	
	
}
