package comparatorcCass;

import java.util.Comparator;

import comparator.Car;

public class CompareByName implements Comparator<Car> {
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return (int)o1.getCarname().compareTo(o2.getCarname());
	}
	
}
