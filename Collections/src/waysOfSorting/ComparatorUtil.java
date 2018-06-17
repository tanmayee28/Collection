package waysOfSorting;

import java.util.Collections;
import java.util.Comparator;

public class ComparatorUtil {

	static Comparator<Mobis> IdBased=new Comparator<Mobis>(){
		
		public int compare(Mobis o1,Mobis o2)
		{
			return o1.getMid()-o2.getMid();
		}
};

	static Comparator<Mobis> NameBased =new Comparator<Mobis>()
{
	public int compare(Mobis o1,Mobis o2)
	{
		return (int)o1.getMnm().compareTo(o2.getMnm());
	}
};

   static Comparator<Mobis> PriceBased=new Comparator<Mobis>()
{
	public int compare(Mobis o1,Mobis o2){
		
		return(int)(o1.getPrice()-o2.getPrice());
	}
};
	
	
	static Comparator<Mobis>NameId=new Comparator<Mobis>(){

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
	
	
	
	static Comparator<Mobis>NamePrice=new Comparator<Mobis>(){
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
	
	
	static Comparator<Mobis>PriceId=new Comparator<Mobis>(){

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
	
	

}
