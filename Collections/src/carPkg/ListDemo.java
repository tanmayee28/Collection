package carPkg;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cr=new Car(1,"swift");
		Car cr1=new Car(2,"Maruti");
		Car cr2=new Car(3,"Xen");
		Car cr3=new Car(2,"I10");
		Car cr4=new Car(5,"audi");
		Car cr5=cr3;
		ArrayList<Car>al=new ArrayList<>();
		al.add(cr);
		al.add(cr1);
		al.add(cr2);
		al.add(cr3);
		al.add(cr4);
		al.add(cr5);
		System.out.println(al.size());
		/*System.out.println("......USING ITERATOR....");
		Iterator<Car>itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println("Objects "+"::"+itr.next());
		}
		System.out.println(".......USING LISTITERATOR......");
		ListIterator<Car>list=al.listIterator();
		while(list.hasNext())
		{
			System.out.println("Objects::"+list.next());
		}
		int size=al.size();
		System.out.println(".......FOR LOOP......");
		for(int i=1;i<size;i++)
		{
			System.out.println("Objects:"+al.get(i));
		}
		System.out.println(".......FOR EACH LOOP......");
		for(Car c:al)
		{
			System.out.println("Objects::"+c);
		}
		System.out.println(".......WHILE LOOP......");
		int i=0;
		while(i<size)
		{
			System.out.println("Objects::"+al.get(i));
			i++;
		}
		*/
	/*	System.out.println("........LINKED LIST.......");
		LinkedList<Car>ll=new LinkedList<>(al);
		System.out.println("......USING ITERATOR....");
		Iterator<Car>itr1=ll.iterator();
		while(itr1.hasNext())
		{
			System.out.println("Objects "+"::"+itr1.next());
		}
		System.out.println(".......USING LISTITERATOR......");
		ListIterator<Car>list1=ll.listIterator();
		while(list1.hasNext())
		{
			System.out.println("Objects::"+list1.next());
		}
		int size1=ll.size();
		System.out.println(".......FOR LOOP......");
		for(int i1=1;i1<size1;i1++)
		{
			System.out.println("Objects:"+ll.get(i1));
		}
		System.out.println(".......FOR EACH LOOP......");
		for(Car c:ll)
		{
			System.out.println("Objects::"+c);
		}
		System.out.println(".......WHILE LOOP......");
		int i2=0;
		while(i2<size1)
		{
			System.out.println("Objects::"+ll.get(i2));
			i2++;
		}*/
		System.out.println(".....VECTOR.......");
		Vector<Car> v=new Vector<>(al);
		int size=v.size();
		System.out.println(".....VECTOR-ENUMERATION.......");
		Enumeration<Car>enm=v.elements();
		while(enm.hasMoreElements())
		{
			System.out.println("Objects"+"::"+enm.nextElement());
		}
		System.out.println(".....VECTOR-ITERATOR.......");
		Iterator<Car>itrv=v.iterator();
		while(itrv.hasNext())
		{
			System.out.println("Objects::"+itrv.next());
		}
		System.out.println(".....VECTOR-LISTITERATOR.......");
		ListIterator<Car>list2=v.listIterator();
		while(list2.hasNext())
		{
			System.out.println("Objects::"+list2.next());
		}
		int size3=v.size();
		System.out.println(".......FOR LOOP-VECTOR......");
		for(int i3=1;i3<size3;i3++)
		{
			System.out.println("Objects:"+v.get(i3));
		}
		System.out.println(".......FOR EACH LOOP-VECTOR......");
		for(Car c:v)
		{
			System.out.println("Objects::"+c);
		}
		System.out.println(".......WHILE LOOP-VECTOR......");
		int i4=0;
		while(i4<size3)
		{
			System.out.println("Objects::"+v.get(i4));
			i4++;
		}
		
		
	}

}
