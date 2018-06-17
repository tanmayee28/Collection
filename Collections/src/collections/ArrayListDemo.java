package collections;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListClass a1=new ArrayListClass(1,"b");
		ArrayListClass a2=new ArrayListClass(2,"d");
		ArrayListClass a3=new ArrayListClass(3,"c");
		ArrayList<ArrayListClass> ar=new ArrayList<>();
		ar.add(a1);
		ar.add(a2);
		ar.add(a3);
		System.out.println(ar);
		LinkedList<ArrayListClass>ll=new LinkedList<>(ar);
		//System.out.println(ll);
		ar.retainAll(ll);
		
	}

}
