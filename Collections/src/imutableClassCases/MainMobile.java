package imutableClassCases;

import java.util.ArrayList;
import java.util.Arrays;

public class MainMobile {

	public static void main(String[] args) {
		// when constructor is public 
		/*Vendor v1=new Vendor(1,"v1");
		Mobile e=new Mobile(1,"Samsung",v1);
		//e.getV().setVnm("v2");//we can change the value if we dont make mutable feld class immutable
		System.out.println(e);
		/*final Mobile e1=new Mobile(2,"Iphone");
		System.out.println(e1);
		Mobile e2=new Mobile(3, "AAA");
		//e1=e2;*/
	
		//System.out.println(e2);*/
		//Factory Method through-when constructor is private..
		/*final Mobile e1=Mobile.getMobile(4,"Tanmayee",new Vendor(2,"Vendor1"));
		System.out.println(e1);
		final Mobile e3= Mobile.getMobile(1,"lenevo",new Vendor(3,"Vendor2"));
		//e3=e1;
		*/
		//factor methode within factory means mobile havin private with vendor havin private constructor
		ArrayList<Integer>al=new ArrayList(Arrays.asList(12,13));
		al.add(14);
		al.add(20);
		final Mobile e1=Mobile.getMobile(4,"Tanmayee",Vendor.getVendor(2,"Vendor1"),al);
		System.out.println(e1);
		ArrayList<Integer>num=e1.getList();
		num.add(60);
		num.add(70);
		System.out.println(e1);
		//final Mobile e3= Mobile.getMobile(1,"lenevo",Vendor.getVendor(3,"Vendor2"),al);
		//System.out.println(e3);
	}

}
