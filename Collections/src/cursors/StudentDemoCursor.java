package cursors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class StudentDemoCursor {
	private static Object Hashmap;

	public static void main(String[]args)
	{
		HashMap<StudentClass,String>map=getDummyData(10);
		//System.out.println(map);
		String str="Student5";
		StudentClass stu1=retriveKeyFromValue(str,map);
		System.out.println("Value of stu:");
		System.out.println(stu1);
		ArrayList<StudentClass>al=new ArrayList<>(getDummyList(10));
		Vector<StudentClass>v=new Vector(al);
		LinkedList<StudentClass>ll=new LinkedList<>(al);
		HashSet<StudentClass>hm=new HashSet<>(getDummyData(10).keySet());
		LinkedHashSet<StudentClass>lhm=new LinkedHashSet<>(hm);
		
		UsingIterator(al);
		UsingIterator(v);
		UsingIterator(ll);
		UsingIterator(hm);
		UsingIterator(lhm);
		
		UsingListIterator(al);
		UsingListIterator(v);
		UsingListIterator(ll);
		
		
		UsingEnumeration(v);
		UsingEnumeration(hm);
		UsingEnumeration(al);
		UsingEnumeration(ll);
		UsingEnumeration(v);
		UsingEnumeration(lhm);
	}

	
	private static void UsingEnumeration(Object ob) {
		System.out.println("########OBJECT OF TYPE"+ob.getClass()+"############");
		Enumeration<Object>enm=null;
		if(ob instanceof Vector)
		{
			Vector<Object> v=(Vector<Object>)ob;
			enm=v.elements();
			while(enm.hasMoreElements())
			{
				System.out.println("Objects ::"+enm.nextElement());
			}
		}else if(ob instanceof Hashtable)
		{
			Hashtable<Object,Object>ht=(Hashtable<Object, Object>) ob;
			while(enm.hasMoreElements())
			{
				System.out.println("Objects ::"+enm.nextElement());
			}
		}else
		{
			System.out.println("IT IS NOT A LLEGACY CLASS");
		}
		
	}


	private static void UsingListIterator(List<StudentClass>li) {
		System.out.println("#############USING LISTITERATOR##########");
		ListIterator<StudentClass>litr=li.listIterator();
		while(litr.hasNext())
		{
			System.out.println("Objects :: "+litr.next());
		}
	}


	private static void UsingIterator(Collection<StudentClass> col) {
		System.out.println("############USING ITERATOR##############");
		Iterator<StudentClass>itr=col.iterator();
		while(itr.hasNext())
		{
			System.out.println("Objects"+col.getClass()+"::"+itr.next());
		}
	}


	private static StudentClass retriveKeyFromValue(String str,HashMap<StudentClass,String>hmap) {
		Set<Entry<StudentClass,String>>entry=hmap.entrySet();
		Iterator<Entry<StudentClass,String>>itr=entry.iterator();
		while(itr.hasNext()){
			Entry<StudentClass,String>etr=itr.next();
			if(etr.getValue().equals(str)){
				return etr.getKey();
			}
		}
		return null;
	}


	private static List<StudentClass> getDummyList(int noobj) {
		List<StudentClass>list=new ArrayList<>();
		for(int i=1;i<=noobj;i++)
		{
			list.add(new StudentClass(i,"Shravan"+i));
		}
		return list;
	}

	private static HashMap<StudentClass,String> getDummyData(int noobj) {
		HashMap<StudentClass,String> hmap=new HashMap<StudentClass,String>();
		for(int i=1;i<=noobj;i++)
		{
			hmap.put(new StudentClass(i,"Shravan"+i), "Student"+i);
		}
		
		hmap.put(new StudentClass(1,"Shravan1"),"Student8");//Student1
		hmap.put(new StudentClass(8,"Shravan21"),"Student64");
		hmap.put(new StudentClass(9,"Shravan10"),"Student29");
		
	/*	System.out.println(hmap.get(new StudentClass(1,"Shravan1")));
		System.out.println(hmap.get(new StudentClass(8,"Shravan21")));
		System.out.println(hmap.get(new StudentClass(9,"Shravan21")));*/
		
		return hmap;
	}

}
