package waysOfSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class MainClass {
	public static void main(String[] args)
	{
	//	SortUsingComparable();
	//	SortUsingComparator();
	//	SortUsingAnnonymousClass();
		SortUsingAnnonymousFile();
		
	}

	private static void SortUsingAnnonymousFile() {
		List<Mobis> list=getDummyObjectList1();
		System.out.println("Before:"+list);
		Collections.sort(list,ComparatorUtil.IdBased);
	//	System.out.println("After:"+list);
		
		Collections.sort(list,ComparatorUtil.NameBased);
		System.out.println("After:"+list);
		
		Collections.sort(list,ComparatorUtil.PriceBased);
//		System.out.println("After:"+list);
		
		Collections.sort(list,ComparatorUtil.PriceId);
	//	System.out.println("After:"+list);
		
		Collections.sort(list,ComparatorUtil.NamePrice);
		//System.out.println("After:"+list);
		
		Collections.sort(list,ComparatorUtil.PriceId);
	//	System.out.println("After:"+list);
		
	}

	private static void SortUsingAnnonymousClass() {
		List<Mobis>list=getDummyObjectList1();
		Comparator<Mobis> IdBased=new Comparator<Mobis>(){
			
			public int compare(Mobis o1,Mobis o2)
			{
				return o1.getMid()-o2.getMid();
			}
	};
	//Collections.sort(list,IdBased);
	//System.out.println("Annonymous Class:+"+list);	
	
	Comparator<Mobis> NameBased =new Comparator<Mobis>()
	{
		public int compare(Mobis o1,Mobis o2)
		{
			return (int)o1.getMnm().compareTo(o2.getMnm());
		}
	};
		System.out.println("Before:"+list);
		//Collections.sort(list,NameBased);
	//	System.out.println("After:"+list);
	
	Comparator<Mobis> PriceBased=new Comparator<Mobis>()
	{
		public int compare(Mobis o1,Mobis o2){
			
			return(int)(o1.getPrice()-o2.getPrice());
		}
	};
		Collections.sort(list,PriceBased);
		System.out.println("Annonympus List:"+list);
		
		Comparator<Mobis>NameId=new Comparator<Mobis>(){

			@Override
			public int compare(Mobis o1, Mobis o2) {
				int temp=(int)o1.getMnm().compareTo(o2.getMnm());
				if(temp==0)
				{
						temp=o1.getMid()-o2.getMid();
				}
				return temp;
				
			}
			
		};
		
		Collections.sort(list,NameId);
		System.out.println("Annonympus List:"+list);
		
		Comparator<Mobis>NamePrice=new Comparator<Mobis>(){
			public int compare(Mobis o1,Mobis o2)
			{
				int temp=(int)o1.getMnm().compareTo(o2.getMnm());
				if(temp==0)
				{
					temp=(int) ((int)o1.getPrice()-o2.getPrice());
				}
				return temp;
			}
		};
		Collections.sort(list,NamePrice);
		System.out.println("Annonymous Class:"+list);
		
		Comparator<Mobis>PriceId=new Comparator<Mobis>(){

			@Override
			public int compare(Mobis o1, Mobis o2) {
				
				int temp=(int) (o1.getPrice()-o2.getPrice());
				if(temp==0)
				{
					temp=(int) (o1.getMid()-o2.getMid());
				}
				return temp;
			}
			
		};
		
		Collections.sort(list,PriceId);
		System.out.println("Annonymous Class:"+list);
}

	private static void SortUsingComparator() {
		List<Mobis>list=getDummyObjectList1();
		System.out.println("Before:"+list);
		System.out.println("After:");
		Collections.sort(list,new CompareByNamePrice());
		System.out.println(list);
	
	}
	private static List<Mobis> getDummyObjectList1() {
	List<Mobis>mobis1=new ArrayList<>();
	Mobis m1=new Mobis(1,"Ipone",100000);
	Mobis m2=new Mobis(2,"Lenovo",20000);
	Mobis m3=new Mobis(3,"Lava",35000);
	Mobis m4=new Mobis(4,"Samsung",25000);
	Mobis m5=new Mobis(5,"Sony",7000);
	Mobis m6=new Mobis(6,"MOTO",13000);
	mobis1.add(m1);
	mobis1.add(m2);
	mobis1.add(m3);
	mobis1.add(m4);
	mobis1.add(m5);
	mobis1.add(m6);
	
	return mobis1;
		
	}

	private static void SortUsingComparable() {
		List<Mobile>list=getDummyObjectList();
		System.out.println("Before Sorting:"+list);
		Collections.sort(list);
		System.out.println("After Sorting:");
		System.out.println(list);
	}

	private static List<Mobile> getDummyObjectList() {
	List<Mobile>mobis=new ArrayList<>();
	Mobile m1=new Mobile(1,"Ipone",100000);
	Mobile m2=new Mobile(2,"Lenovo",20000);
	Mobile m3=new Mobile(3,"Sony",35000);
	Mobile m4=new Mobile(4,"Samsung",25000);
	Mobile m5=new Mobile(5,"LG",7000);
	Mobile m6=new Mobile(6,"MOTO",13000);
	mobis.add(m1);
	mobis.add(m2);
	mobis.add(m3);
	mobis.add(m4);
	mobis.add(m5);
	mobis.add(m6);
	
	return mobis;
		
	}

}
class SortById implements Comparator<Mobis>{

	@Override
	public int compare(Mobis o1, Mobis o2) {
		//return (o1.getMid()-o2.getMid());//ascending order..
		return -(o1.getMid()-o2.getMid());
	}
	
}

class SortByName implements Comparator<Mobis>{

	@Override
	public int compare(Mobis o1, Mobis o2) {
		//return (o1.getMnm().compareTo(o2.getMnm()));//ascending order..
		return -(int)(o1.getMnm().compareTo(o2.getMnm())); //descending Order..
	}
	
}

class SortByPrice implements Comparator<Mobis>{

	@Override
	public int compare(Mobis o1, Mobis o2) {
		//return (int)(o1.getPrice()-o2.getPrice()));//ascending order..
		return -(int)(o1.getPrice()-o2.getPrice()); //descending Order..
	}
	
}
class CompareByNameId implements Comparator<Mobis>{

@Override
public int compare(Mobis o1, Mobis o2) {
	int temp=(int)o1.getMnm().compareTo(o2.getMnm());
	if(temp==0)
	{
		int temp1=o1.getMid()-o2.getMid();
	}
	return temp;
}

}


class CompareByNamePrice implements Comparator<Mobis>{

@Override
public int compare(Mobis o1, Mobis o2) {
	int temp=(int)o1.getMnm().compareTo(o2.getMnm());
	if(temp==0)
	{
		int temp1=(int) (o1.getPrice()-o2.getPrice());
	}
	return temp;
}
 class CompareByIdPrice implements Comparator<Mobis>{

	@Override
	public int compare(Mobis o1, Mobis o2) {
		int temp=o1.getMid()-o2.getMid();
		if(temp==0)
		{
			int temp1=(int) (o1.getPrice()-o2.getPrice());
		}
		return temp;
	}
	 
 }
}
