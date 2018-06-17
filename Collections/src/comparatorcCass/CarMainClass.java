package comparatorcCass;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparator.Car;

public class CarMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car(4,"Audi",230000);
		Car c2=new Car(2,"Zen",400500);
		Car c3=new Car(1,"Swift",700000);
		Car c4=new Car(5,"Maruti",904000);
		Car c5=new Car(3,"BMW",500000);
		
		List<Car> li=new ArrayList<Car>();
		li.add(c1);
		li.add(c2);
		li.add(c3);
		li.add(c4);
		li.add(c5);
		
		System.out.println(" Original List"+li);
		System.out.println("Using Sort Method for Id:");
        Collections.sort(li, new ComareId());
        System.out.println(li);
		//Collections.sort(li,new ComparisionByName());
    	System.out.println("Using Sort Method for Name:");
    	Collections.sort(li,new CompareByName());
    	System.out.println(li);
    	System.out.println("Using Sort Method for Price:");
    	Collections.sort(li,new CompareByPrize());
    	System.out.println(li);

		
	}
}



