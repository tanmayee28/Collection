package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorImp  {

	public static void main(String[] args) {
		Car c1=new Car(4,"Audi",230000);
		Car c2=new Car(2,"Zen",400500);
		Car c3=new Car(1,"Swift",700000);
		Car c4=new Car(5,"Maruti",904000);
		Car c5=new Car(3,"BMW",500000);
		
		List<Car>li=new ArrayList<>();
		li.add(c1);
		li.add(c2);
		li.add(c3);
		li.add(c4);
		li.add(c5);
		System.out.println(" Original List"+li);
		System.out.println("Using Sort Method for Price:");
		Collections.sort(li);
		System.out.println(li);
	}

	

}
