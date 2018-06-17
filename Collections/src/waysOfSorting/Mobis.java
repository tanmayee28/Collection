package waysOfSorting;

public class Mobis {
	private int mid;
	private String mnm;
	private double price;
	public Mobis(int mid, String mnm, double price) {
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "\n Mobis [mid=" + mid + ", mnm=" + mnm + ", price=" + price + "]";
	}
	
}
