package collections;

public class ArrayListClass {
	private int sid;
	private String snm;
	public ArrayListClass(int sid, String snm) {
		super();
		this.sid = sid;
		this.snm = snm;
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
	@Override
	public String toString() {
		return "ArrayListClass [sid=" + sid + ", snm=" + snm + "]";
	}
	
	

}
