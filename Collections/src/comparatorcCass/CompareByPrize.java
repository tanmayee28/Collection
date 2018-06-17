package comparatorcCass;

import java.util.Comparator;

import comparator.Car;

public class CompareByPrize implements Comparator<Car> {
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return  (int) ((int)o1.getCarprice()-o2.getCarprice());
	}
}
