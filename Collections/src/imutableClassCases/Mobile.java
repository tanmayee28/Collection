package imutableClassCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class Mobile {
	final private int mid;
	final private String mname;
	final private Vendor v;
	final private ArrayList<Integer>listofnum;
	public ArrayList<Integer> getList()
	{
		return new ArrayList<Integer>();
	}
	private Mobile(int mid, String mname,Vendor v,ArrayList<Integer> li) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.v=v;
		this.listofnum=li;
	}
	public int getMid() {
		return mid;
	}
	public String getMname() {
		return mname;
	}
	public Vendor getV() {
		return v;
	}
	
	public ArrayList<Integer> getListOfnum() {
		return listofnum;
	}
	@Override
	public String toString() {
		return "\n Mobile [mid=" + mid + ", mname=" + mname + "]"+"Vendor [vid=" + v.getVid() + ", vnm=" + v.getVnm()+"]" +listofnum+ "]";
	}
	//Factory Method;
	public static Mobile getMobile(int id,String name,Vendor v,ArrayList<Integer>li)
	{
		return new Mobile(id,name,v,li);
	}
}
