package hashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MainHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Suresh");
		Employee e2=new Employee(2,"Sushant");
		Employee e3=new Employee(3,"Roshani");
		Employee e4=new Employee(4,"Mohini");
		Employee e5=new Employee(5,"Shristi");
		
		ValueContainer vc1=new ValueContainer(2,"Value1");
		ValueContainer vc2=new ValueContainer(5,"Value2");
		ValueContainer vc3=new ValueContainer(1,"Value3");
		ValueContainer vc4=new ValueContainer(4,"Value4");
		ValueContainer vc5=new ValueContainer(3,"Value5");
		
		HashMap<Employee,String>hm=new HashMap<>();
		hm.put(e1,"e1");
		hm.put(e2,"e2");
		hm.put(e3,"e3");
		hm.put(e4,"e4");
		hm.put(e5,"e5");
		
		System.out.println("Before"+hm);
		
		HashMap<Employee, ValueContainer> hm1=new HashMap<>();
		hm1.put(e1,vc1);
		hm1.put(e2,vc2);
		hm1.put(e3,vc3);
		hm1.put(e4,vc4);
		hm1.put(e5,vc5);
		
		System.out.println(hm1);
		
		System.out.println("LINKEDHASHMAP:");
		
		LinkedHashMap<Employee,ValueContainer>ll = new LinkedHashMap<>();
		ll.put(e1,vc1);
		ll.put(e2,vc2);
		ll.put(e3,vc3);
		ll.put(e4,vc4);
		ll.put(e5,vc5);
		
		System.out.println("After Adding:"+ll);
		

	}

}
