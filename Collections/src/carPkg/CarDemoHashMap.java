package carPkg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class CarDemoHashMap {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cr=new Car(1,"swift");
		Car cr1=new Car(2,"Maruti");
		Car cr2=new Car(3,"Xen");
		Car cr3=new Car(2,"I10");
		Car cr4=new Car(5,"audi");
		Car cr5=cr3;
		HashMap<Car,String>hm=new HashMap<>();
		hm.put(cr,"C");
		hm.put(cr1,"C1");
		hm.put(cr2,"C2");
		hm.put(cr3,"C3");
		hm.put(cr4,"C4");
		hm.put(cr5,"C5");
		Set<Car> s=hm.keySet();
		Vector<Car>v=new Vector<>(s);
		System.out.println(".....USING ITERATOR....");
		Iterator<Car>vitr=v.iterator();
		while(vitr.hasNext())
		{
			System.out.println("Keys:"+v);
			Car val=vitr.next();
			System.out.println("Values:"+hm.get(val));
			
			
		}
		Collection<String>col=hm.values();
		List<String>l=new ArrayList<>(col);
		Iterator<String>litr=l.iterator();
		while(litr.hasNext())
		{
			String val=litr.next();
			System.out.println("Values:"+val);
			
			
		}
		Set<Entry<Car,String>>se=hm.entrySet();
		Vector<Entry<Car,String>>ve=new Vector<>(se);
		Iterator<Entry<Car,String>>vitre=ve.iterator();
		while(vitre.hasNext())
		{
			Entry<Car,String>e=vitre.next();
			System.out.println("Keys"+"::"+e.getKey()+" Values"+"::"+e.getValue());
		}
		
		System.out.println("........USING ENUMERATION..........");
		Enumeration<Car>cenum=v.elements();
		while(cenum.hasMoreElements())
		{
			Car c=cenum.nextElement();
			System.out.println("Values:"+hm.get(c));
			
		}
		//List<String>l=new ArrayList<>(col);
		System.out.println("........LISTIERATOR........");
		ListIterator<Entry<Car,String>>listiterator=ve.listIterator();
		while(listiterator.hasNext())
		{
			Entry<Car, String> entry1=listiterator.next();
			System.out.println("Keys ::"+entry1.getKey()+" Values::"+entry1.getValue());
		}
		
		
	}

}
