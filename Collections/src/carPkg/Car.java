package carPkg;

public class Car {
	int cid;
	String cnm;
	public Car(int cid, String cnm) {
		super();
		this.cid = cid;
		this.cnm = cnm;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cid;
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
		Car other = (Car) obj;
		if (cid != other.cid)
			return false;
		return true;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCnm() {
		return cnm;
	}
	public void setCnm(String cnm) {
		this.cnm = cnm;
	}
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cnm=" + cnm + "]";
	}
	

}
