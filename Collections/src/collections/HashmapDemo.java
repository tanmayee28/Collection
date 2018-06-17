package collections;
import java.util.*;
public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"A");
		Employee e2=new Employee(1,"B");
		Employee e3=new Employee(2,"A");
		Employee e4=new Employee(1,"C");
		Employee e5=new Employee(2,"C");
		Employee e6=e1;
		HashMap<Employee,String>hmap=new HashMap<>();
		hmap.put(e1, "E1");
		hmap.put(e2, "E2");
		hmap.put(e3, "E3");
		hmap.put(e4, "E4");
		hmap.put(e5, "E5");
		hmap.put(e6, "E6");
		System.out.println(hmap);
		System.out.println(e1.hashCode()&10);
	//	System.out.println("HashMap:"+hmap);
		/*System.out.println("Using methodes of hashmap.........");
		System.out.println("Set of Keys:"+hmap.keySet());
		System.out.println("Set of Values:"+hmap.values());
		System.out.println("set of Entries:"+hmap.entrySet());*/
		
		

	}

}
