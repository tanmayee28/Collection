package test;

public class Car 
{
	private int carId;
	private String carName;
	private long carPrice;
	public Car(int carId, String carName, long carPrice) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carPrice = carPrice;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public long getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(long carPrice) {
		this.carPrice = carPrice;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", carPrice=" + carPrice + "]";
	}
	
	
	

}
