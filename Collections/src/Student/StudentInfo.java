package Student;

public class StudentInfo {
	private int sid;
	private String snm;
	private Address ads;
	public StudentInfo(int sid, String snm, Address ads) {
		super();
		this.sid = sid;
		this.snm = snm;
		this.ads = ads;
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
	public Address getAds() {
		return ads;
	}
	public void setAds(Address ads) {
		this.ads = ads;
	}
	@Override
	public String toString() {
		return "\n student Id=" + sid + ", student name=" + snm + ", address=" + ads+".";
	}
	
	
}
