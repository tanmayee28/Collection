package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class BooksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BooksClass bk=new BooksClass(1,"Java core");
		BooksClass bk1=new BooksClass(1,"Hibermet");
		BooksClass bk2=new BooksClass(2,"Spring");
		BooksClass bk3=new BooksClass(4,"core Java");
		BooksClass bk4=bk1;
		HashSet<BooksClass>bset=new HashSet<>();
		bset.add(bk);
		bset.add(bk1);
		bset.add(bk2);
		bset.add(bk3);
		bset.add(bk4);
		System.out.println("***********WithoutOverriding***************");
		System.out.println("\n");
		System.out.println(bset);
		System.out.println("Size:"+bset.size());
		System.out.println("*****************With Overriding*************");
		System.out.println("\n");
		Iterator<BooksClass> itr=bset.iterator();
		while(itr.hasNext())
		{
			BooksClass s=itr.next();
			System.out.println(s);
		}
		System.out.println("*************HashMap************");
		System.out.println("\n");
		HashMap<BooksClass,String>hmap=new HashMap<>();
		hmap.put(bk,"BK1");
		hmap.put(bk1,"BK1");
		hmap.put(bk2,"BK2");
		hmap.put(bk3,"BK3");
		hmap.put(bk4,"BK4");
		System.out.println(hmap);
		System.out.println("*****************With Overriding*************");
		System.out.println("\n");
		System.out.println("**************KeySet()*****************");
		Set<BooksClass> book=hmap.keySet();
		Iterator<BooksClass> itr1=book.iterator();
		while(itr1.hasNext()){
			BooksClass val=itr1.next();
			System.out.println(val+" "+hmap.get(val));
		}
		System.out.println("*****************Values()*********");
		Collection<String>bval=hmap.values();
		Iterator<String>itr2=bval.iterator();
		while(itr2.hasNext())
		{
			String val1=itr2.next();
			System.out.println(val1);
		}
		System.out.println("*****************EntrySet()************");
		Set<Entry<BooksClass,String>>entry=hmap.entrySet();
		Iterator<Entry<BooksClass,String>>itr3=entry.iterator();
		while(itr3.hasNext())
		{
			Entry<BooksClass,String> entry1=itr3.next();
			System.out.println("Key"+"::"+entry1.getKey()+"Value"+"::"+entry1.getValue());
			
		}

		
	}

}
