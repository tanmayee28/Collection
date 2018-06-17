package treeMap;

import java.util.Comparator;
import java.util.TreeSet;

public class MainTreeMap {

	public static void main(String[] args) {
		EmployeeClass e1=new EmployeeClass(1,"Employee1",10000);
		EmployeeClass e2=new EmployeeClass(2,"Employee2",60000);
		EmployeeClass e3=new EmployeeClass(3,"Employee3",15000);
		EmployeeClass e4=new EmployeeClass(3,"Employee3",5900);
		EmployeeClass e5=new EmployeeClass(5,"Employee5",17000);
		EmployeeClass e6=e5;
		
		TreeSet<EmployeeClass> t1=new TreeSet<>();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		
		Comparator<EmployeeClass> com=new Comparator<EmployeeClass>(){

			@Override
			public int compare(EmployeeClass o1, EmployeeClass o2) {
				int temp=o1.getEid()-o2.getEid();
				if(temp==0){
					temp=(int) (o1.getSalary()-o2.getSalary());
				}
				return temp;
			}
			
		};
		TreeSet<EmployeeClass>t2=new TreeSet<>(com);
		System.out.println("After"+t2);
		System.out.println(t1);
	}

}
