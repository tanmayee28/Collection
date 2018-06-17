package cursorDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Employee,String>map=getDummyData(10);
		List<Employee>li=getDummyList(10);
		String str="Person8";
		Employee e=getKeyFromValue(str,map);
		System.out.println(e);
		ArrayList<Employee>al=new ArrayList<>(li);
		HashSet<Employee>hash=new HashSet<>(map.keySet());
		Vector<Employee>v=new Vector<>(li);
		LinkedList<Employee>ll=new LinkedList<>(al);
		
		usingIterator(al);
		usingIterator(ll);
		usingIterator(v);
		usingIterator(hash);
		
		usingListIterator(al);
		usingListIterator(ll);
		usingListIterator(v);
		
		UsingEnumeration(al);
		UsingEnumeration(ll);
		UsingEnumeration(v);
		UsingEnumeration(hash);
	}

	

	private static void UsingEnumeration(Object object) {
		System.out.println("#####USING ENUMERATION########");
		Enumeration<Object> enum1=null;
		if(object instanceof Vector)
		{
		
			Vector<Object>v=(Vector<Object>)object;
			enum1=v.elements();
			while(enum1.hasMoreElements())
			{
				System.out.println("Objects:"+enum1.nextElement());
			}
		}else if(object instanceof Hashtable)
		{
			
			Hashtable<Object,Object> ht=(Hashtable<Object,Object>)object;
			enum1=ht.elements();
			while(enum1.hasMoreElements())
			{
				System.out.println("Objects:"+enum1.nextElement());
			}
			
		}else {
			System.out.println("It is not a Legacy Class");
		}
		
	}

	
	private static void usingListIterator(List<Employee> al) {
		System.out.println("#########USING LISTITERATOR########");
		ListIterator<Employee>litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
	}


	private static void usingIterator(Collection<Employee>col) {
		System.out.println("#######USING ITERATOR#######");
		Iterator<Employee>itr=col.iterator();
		while(itr.hasNext())
		{
			
			Employee e=itr.next();
			System.out.println(e);
		}
		
	}


	private static Employee getKeyFromValue(String str, HashMap<Employee, String> map) {
		Set<Entry<Employee,String>>entry=map.entrySet();
		Iterator<Entry<Employee,String>> itr=entry.iterator();
		while(itr.hasNext())
		{
			Entry<Employee,String>val=itr.next();
			if(val.getValue().equals(str))
			{
				return val.getKey();
			}
		}
		return null;
	}


	private static List<Employee> getDummyList(int oobj) {
		List<Employee>li=new ArrayList<>();
		for(int i=1;i<oobj;i++)
		{
			li.add(new Employee(i,"Employee"+i));
		}
		return li;
	}


	private static HashMap<Employee,String> getDummyData(int noobj) {
		HashMap<Employee,String>hm=new HashMap<>();
		for(int i=1;i<noobj;i++)
		{
			hm.put(new Employee(i,"Employee"+i),"Person"+i);
			
		}
	//	System.out.println("List::"+hm);
		return hm;
		
	}

}
