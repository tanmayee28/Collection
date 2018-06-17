package comparator;

public class Car implements Comparable<Car> {
	private int carId;
	private String carname;
	private long carprice;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public long getCarprice() {
		return carprice;
	}
	public void setCarprice(long carprice) {
		this.carprice = carprice;
	}
	public Car(int carId, String carname, long carprice) {
		super();
		this.carId = carId;
		this.carname = carname;
		this.carprice = carprice;
	}
	@Override
	public String toString() {
		return "\n Car [carId=" + carId + ", carname=" + carname + ", carprice=" + carprice + "]";
	}
	public int compareTo(Car c) {
		// TODO Auto-generated method stub
			return (int) (this.getCarprice()-c.getCarprice());
		}
	
	
	
}
