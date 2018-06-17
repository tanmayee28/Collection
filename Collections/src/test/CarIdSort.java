package test;

import java.util.Comparator;

public class CarIdSort implements Comparator<Car>
{

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return o1.getCarId()-o2.getCarId();
	}

}
