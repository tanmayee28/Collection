package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comparator.Car;

public class CollectionSort 
{

	public static void main(String[] args) 
	{
		Car c1=new Car(4,"Audi",230000);
		Car c2=new Car(2,"Zen",400500);
		Car c3=new Car(1,"Swift",700000);
		Car c4=new Car(5,"Maruti",904000);
		Car c5=new Car(3,"BMW",500000);
		
		List<Car> carList=new ArrayList<Car>();
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
		carList.add(c4);
		carList.add(c5);
		
		System.out.println(carList);
		//Collections.sort(carList, new CarIdSort());
		

	}

}
