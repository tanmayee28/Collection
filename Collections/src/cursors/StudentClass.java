package cursors;

public class StudentClass {
	private int sid;
	private String snm;
	@Override
	public String toString() {
		return "StudentClass [sid=" + sid + ", snm=" + snm + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSnm() {
		return snm;
	}
	public void setSnm(String snm) {
		this.snm = snm;
	}
	public StudentClass(int sid, String snm) {
		super();
		this.sid = sid;
		this.snm = snm;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sid;
		result = prime * result + ((snm == null) ? 0 : snm.hashCode());
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
		StudentClass other = (StudentClass) obj;
		if (sid != other.sid)
			return false;
		if (snm == null) {
			if (other.snm != null)
				return false;
		} else if (!snm.equals(other.snm))
			return false;
		return true;
	}
	
}
