package imutableClassCases;

final  class Vendor {
	final private int vid;
	final private String vnm;
	
	private Vendor(int vid, String vnm) {
		super();
		this.vid = vid;
		this.vnm = vnm;
	}
	public int getVid() {
		return vid;
	}
	public String getVnm() {
		return vnm;
	}
	@Override
	public String toString() {
		return "\n Vendor [vid=" + vid + ", vnm=" + vnm + "]";
	}
	static public Vendor getVendor(int id,String vnm)
	{
		return new Vendor(id,vnm);
	}

}
