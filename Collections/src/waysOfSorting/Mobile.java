package waysOfSorting;

public class Mobile implements Comparable<Mobile> {
	private int mid;
	private String mnm;
	private long price;
	public Mobile(int mid, String mnm, long price) {
		super();
		this.mid = mid;
		this.mnm = mnm;
		this.price = price;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMnm() {
		return mnm;
	}
	public void setMnm(String mnm) {
		this.mnm = mnm;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "\n Mobile [mid=" + mid + ", mnm=" + mnm + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Mobile o) {
		//Sort using Id
				//return this.getMid()-o.getMid();//ascending Order..
				//return -(this.getMid()-o.getMid());//descending Order..
				
				//sort Using Name
				//return (int)this.getMnm().compareTo(o.getMnm()); //ascending order..
				return -((int)this.getMnm().compareTo(o.getMnm())); //descending order..
				
				//sort Using Price
				//return (int)(this.price-o.price); //ascending order...
										
	}
	
	
}
