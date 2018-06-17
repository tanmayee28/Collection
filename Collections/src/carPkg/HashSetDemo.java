package carPkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cr=new Car(1,"swift");
		Car cr1=new Car(2,"Maruti");
		Car cr2=new Car(3,"Xen");
		Car cr3=new Car(2,"I10");
		Car cr4=new Car(5,"audi");
		Car cr5=cr3;
		HashSet<Car>hset=new HashSet<Car>();
		hset.add(cr);
		hset.add(cr1);
		hset.add(cr2);
		hset.add(cr3);
		hset.add(cr4);
		hset.add(cr5);
		System.out.println(hset.size());
		System.out.println(hset);
		List<Car>li=new ArrayList<>(hset);
		System.out.println("......USING ITERATOR....");
		Iterator<Car>itr=hset.iterator();
		while(itr.hasNext())
		{
			System.out.println("Objects "+"::"+itr.next());
		}
		System.out.println(".......USING LISTITERATOR......");
		ListIterator<Car>list=li.listIterator();
		while(list.hasNext())
		{
			System.out.println("Objects::"+list.next());
		}
		int size=li.size();
		System.out.println(".......FOR LOOP......");
		for(int i=1;i<size;i++)
		{
			System.out.println("Objects:"+li.get(i));
		}
		System.out.println(".......FOR EACH LOOP......");
		for(Car c:li)
		{
			System.out.println("Objects::"+c);
		}
		System.out.println(".......WHILE LOOP......");
		int i=0;
		while(i<size)
		{
			System.out.println("Objects::"+li.get(i));
			i++;
		}
	}

}
