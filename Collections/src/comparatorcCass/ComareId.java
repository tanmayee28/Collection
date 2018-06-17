package comparatorcCass;

import java.util.Comparator;

import comparator.Car;

public class ComareId implements Comparator<Car> {
public int compare(Car o1, Car o2) {
		
		return o1.getCarId()-o2.getCarId();
	}
	
}
