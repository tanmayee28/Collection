package collections;

import java.util.HashSet;
import java.util.Iterator;

public class TestDemo {
	public static void main(String[]args)
	{
		Employee e1=new Employee(1,"A");
		Employee e2=new Employee(2,"B");
		Employee e3=new Employee(2,"B");
		Employee e4=e1;
		HashSet<Employee> hset=new HashSet<Employee>();
		hset.add(e1);
		hset.add(e2);
		hset.add(e3);
		hset.add(e4);
	//	System.out.println(set.isEmpty());
	//Hash code of object
		System.out.println(e1.hashCode());
	//	System.out.println(map.get(hash));
		System.out.println("******Use of Iterator*********");
		Iterator<Employee> itr=hset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
