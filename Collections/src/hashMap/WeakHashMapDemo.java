package hashMap;

import java.util.*;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Suresh");
		Employee e2=new Employee(2,"Sushant");
		Employee e3=new Employee(3,"Suresh");
		Employee e4=new Employee(4,"Mohini");
		Employee e5=new Employee(2,"Sushant");
		
		HashMap<Employee,String>hm=new HashMap<>();
		hm.put(e1,"e1");
		hm.put(e2,"e2");
		hm.put(e3,"e3");
		hm.put(e4,"e4");
		hm.put(e5,"e5");
		
		System.out.println("Before Size:"+hm.size());
		System.out.println("Hashmap:"+hm);
		//e1=null;
		
		
		WeakHashMap<Employee,String> wm=new WeakHashMap<>();
		wm.put(e1,"e1");
		wm.put(e2,"e2");
		wm.put(e3,"e3");
		wm.put(e4,"e4");
		wm.put(e5,"e5");
		
		System.out.println("Before Size:"+wm.size());
		System.out.println("WeakHashMap:"+wm);
		e1=null;
		System.gc();
		System.out.println("size:"+wm.size());
		System.out.println(wm);
	}

}
